package fr.khady.biblio.dao;

import java.util.List;

import fr.khady.biblio.entites.Utilisateur;

public interface UtilisateurDao {

	public void ajouterUtilisateur(Utilisateur u);

	public List<Utilisateur> listerUtilisateurs();
	
	public void modifierUtilisateur(Utilisateur u);

	public Utilisateur trouverParId(long id_user);

}
