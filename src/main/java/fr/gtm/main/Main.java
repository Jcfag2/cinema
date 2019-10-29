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
		
		Film film = dao.findById(1L);
		Film film2 = dao.findById(4L);
		
		System.out.println(" ");
		System.out.println(film);
		System.out.println(film.getRole());
		System.out.println(" ");
		
		System.out.println(" ");
		System.out.println(film2);
		System.out.println(film2.getRole());
		System.out.println(" ");
		
		ActeurDAO dao2 = new ActeurDAO(emf);
		Acteur acteur = dao2.findById(2L);
		System.out.println(" ");
		System.out.println(acteur.getFilms());
		System.out.println(" ");
		emf.close();
	}

}
