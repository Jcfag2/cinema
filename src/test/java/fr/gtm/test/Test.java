package fr.gtm.test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import fr.gtm.dao.FilmDAO;
import fr.gtm.entities.Acteur;
import fr.gtm.entities.Film;

public class Test {

	@org.junit.Test
	public void test() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cinema");
		FilmDAO dao = new FilmDAO(emf);
		
		Film film = dao.findById((long)1);
		emf.close();
		
		Film sw1 = new Film();
		Film sw2 = new Film();
		Film sw3 = new Film();
		
		List<Acteur> acteurs = new ArrayList<>();
		List<Film> starWars = new ArrayList<>();
		
		Acteur Ewan = new Acteur();
		Ewan.setCivilite("Mr");
		Ewan.setDateNaissace(LocalDate.of(1971, 3, 31));
		Ewan.setId(1);
		Ewan.setNom("McGregor");
		Ewan.setPrenom("Ewan");
		Ewan.setFilms(starWars);
		acteurs.add(Ewan);
		
		Acteur Nathalie = new Acteur();
		Nathalie.setCivilite("Mme");
		Nathalie.setDateNaissace(LocalDate.of(1981, 6, 9));
		Nathalie.setId(2);
		Nathalie.setNom("Portman");
		Nathalie.setPrenom("Nathalie");
		Nathalie.setFilms(starWars);
		acteurs.add(Nathalie);
		
		sw1.setDateSortie(LocalDate.of(1999, 5, 19));
		sw1.setDuree(136);
		sw1.setTitre("Star Wars: Episode I La menace Fantôme");
		sw1.setActeurs(acteurs);	
		sw1.setRealisateur("Georges Lucas");
		sw1.setId(1);
		starWars.add(sw1);
		
		sw2.setDateSortie(LocalDate.of(2002, 5, 16));
		sw2.setDuree(142);
		sw2.setTitre("Star Wars: Episode II L'attaque des clones");
		sw2.setActeurs(acteurs);	
		sw2.setRealisateur("Georges Lucas");
		sw2.setId(2);
		starWars.add(sw2);
		
		sw3.setDateSortie(LocalDate.of(2005, 5, 19));
		sw3.setDuree(140);
		sw3.setTitre("Star Wars: Episode III La revanche des Siths");
		sw3.setActeurs(acteurs);	
		sw3.setRealisateur("Georges Lucas");
		sw3.setId(3);
		starWars.add(sw3);
		
		Ewan.setFilms(starWars);
		Nathalie.setFilms(starWars);
		sw1.setActeurs(acteurs);
	

//		assertEquals(sw1.getTitre(), film.getTitre());
//		assertEquals(sw1.getDateSortie(), film.getDateSortie());
//		assertEquals(sw1.getActeurs().get(0).getNom(), film.getActeurs().get(0).getNom());
//		assertEquals(sw1.getActeurs().get(0).getCivilite(), film.getActeurs().get(0).getCivilite());
//		assertEquals(sw1.getActeurs().get(0).getDateMort(), film.getActeurs().get(0).getDateMort());
//		assertEquals(sw1.getActeurs().get(0).getDateNaissace(), film.getActeurs().get(0).getDateNaissace());
//		assertEquals(sw1.getActeurs().get(0).getId(), film.getActeurs().get(0).getId());
//		assertEquals(sw1.getActeurs().get(0).getPrenom(), film.getActeurs().get(0).getPrenom());
//		assertEquals(sw1.getActeurs().get(1).getNom(), film.getActeurs().get(1).getNom());
//		assertEquals(sw1.getActeurs().get(1).getCivilite(), film.getActeurs().get(1).getCivilite());
//		assertEquals(sw1.getActeurs().get(1).getDateMort(), film.getActeurs().get(1).getDateMort());
//		assertEquals(sw1.getActeurs().get(1).getDateNaissace(), film.getActeurs().get(1).getDateNaissace());
//		assertEquals(sw1.getActeurs().get(1).getId(), film.getActeurs().get(1).getId());
//		assertEquals(sw1.getActeurs().get(1).getPrenom(), film.getActeurs().get(1).getPrenom());
//		assertEquals(sw1.getDuree(), film.getDuree());
//		assertEquals(sw1.getId(), film.getId());
//		assertEquals(sw1.getRealisateur(), film.getRealisateur());
		
	}

}
