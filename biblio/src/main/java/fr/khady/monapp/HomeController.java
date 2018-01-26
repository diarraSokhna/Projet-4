package fr.khady.monapp;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.khady.biblio.entites.Utilisateur;
import fr.khady.biblio.metier.UtilisateurMetier;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private UtilisateurMetier metier;
	
	@RequestMapping(value="/")
	public String index(Model model){
	model.addAttribute("utilisateur", new Utilisateur());
	model.addAttribute("utilisateurs", metier.listerUtilisateurs());
	return "utilisateurs";
	}
	

}
