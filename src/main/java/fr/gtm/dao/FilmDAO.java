package fr.gtm.dao;

import javax.persistence.EntityManagerFactory;
import fr.gtm.entities.Film;

public class FilmDAO extends AbstractDAO<Film, Long>{

	public FilmDAO(EntityManagerFactory emf) {
		super(emf, Film.class);
		// TODO Auto-generated constructor stub
	}

}
