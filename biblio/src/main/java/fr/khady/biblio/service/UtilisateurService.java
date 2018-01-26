package fr.khady.biblio.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import fr.khady.biblio.entites.Utilisateur;

@WebService
public interface UtilisateurService {


	@WebMethod
	public List<Utilisateur> listerUtilisateur() ;
	
	@WebMethod
	public Utilisateur getUtilisateur(@WebParam(name = "id_user") Long id_user);
}
