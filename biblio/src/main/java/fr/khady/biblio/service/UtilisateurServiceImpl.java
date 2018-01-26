package fr.khady.biblio.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import fr.khady.biblio.dao.UtilisateurDao;
import fr.khady.biblio.entites.Utilisateur;
import fr.khady.biblio.metier.UtilisateurMetier;


@WebService(serviceName= "UtilisateurService")
public class UtilisateurServiceImpl implements UtilisateurService {

	private UtilisateurMetier metier;

	
	public void setMetier(UtilisateurMetier metier) {
		this.metier = metier;
	}

	@Override
	public List<Utilisateur> listerUtilisateur() {
		return metier.listerUtilisateurs();
	}
	
	@Override
	public Utilisateur getUtilisateur(@WebParam(name = "id_user") Long id_user) {
		return metier.trouverParId(id_user);
	}
}