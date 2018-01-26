package fr.khady.biblio.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.khady.biblio.entites.Utilisateur;


public class UtilisateurDaoImpl implements UtilisateurDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void ajouterUtilisateur(Utilisateur u) {
		entityManager.persist(u);

	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Utilisateur> listerUtilisateurs() {
		Query req = entityManager.createQuery("select u from Utilisateur u");
		return req.getResultList();
	}

	@Override
	public void modifierUtilisateur(Utilisateur u) {
		 entityManager.merge(u);
		
	}

	@Override
	public Utilisateur trouverParId(long id_user) {
		Utilisateur u = entityManager.find(Utilisateur.class, id_user);
		return u;
	}

}
