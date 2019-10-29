package fr.gtm.main;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.gtm.dao.FilmDAO;
import fr.gtm.entities.Film;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cinema");
		FilmDAO dao = new FilmDAO(emf);
		
		
		Film film = dao.findById((long)1);
		System.out.println(film);
		
	
		emf.close();
	}

}
