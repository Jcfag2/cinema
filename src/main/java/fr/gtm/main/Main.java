package fr.gtm.main;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.gtm.dao.ActeurDAO;
import fr.gtm.dao.FilmDAO;
import fr.gtm.entities.Acteur;
import fr.gtm.entities.Film;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cinema");
		FilmDAO dao = new FilmDAO(emf);
		
		Film film = dao.findById((long)1);
		System.out.println(film);
		System.out.println(film.getRole());

		
		ActeurDAO dao2 = new ActeurDAO(emf);
		Acteur acteur = dao2.findById(1L);
		System.out.println(acteur.getFilms());
		emf.close();
	}

}
