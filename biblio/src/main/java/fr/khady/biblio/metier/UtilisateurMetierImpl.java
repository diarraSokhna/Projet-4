package fr.khady.biblio.metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import fr.khady.biblio.dao.UtilisateurDao;
import fr.khady.biblio.entites.Utilisateur;

public class UtilisateurMetierImpl implements UtilisateurMetier {

	private UtilisateurDao dao;
	
	public void setDao(UtilisateurDao dao) {
		this.dao = dao;
	}
	
	@Override
	@Transactional
	public void ajouterUtilisateur(Utilisateur u) {
		dao.ajouterUtilisateur(u);

	}

	@Override
	public List<Utilisateur> listerUtilisateurs() {
		return dao.listerUtilisateurs();
	}

	@Override
	@Transactional
	public void modifierUtilisateur(Utilisateur u) {
		dao.modifierUtilisateur(u);

	}

	@Override
	@Transactional
	public Utilisateur trouverParId(long id_user) {
		return dao.trouverParId(id_user);
	}

}
