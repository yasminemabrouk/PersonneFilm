/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.personnefilm.business;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author yasmine.mabrouk
 */
public class Person {
    Long id ;
    String firstName;
    String lastName ;
    Map<Long, Movie> movies;

         /**
	 * Constructeur paramétré de la classe Account. Toutes les valeurs sont obligatoires
	 * @param id Le numéro du film
	 * @param firstNsame firstNsame Le nom du film
         * @param LastName Le producteur de filme
	 */
    public Person(Long id, String firstNsame, String LastName) {
        this.id = id;
        this.firstName = firstNsame;
        this.lastName = LastName;
        this.movies = new HashMap<>();
    }

    /**
     * Méthode qui permet ajouter un film a liste des films d'une personne
     * @param movie un film
     */
    public void addMovie(Movie movie){
        // récuperatio de la permiere position libre dans liste de movies
    Integer position = movies.size() + 1;
    //ajouter un film au liste des movies
    movies.put( position.longValue(), movie);
    }
    
 
    public Long getId() {
        return id;
    }
  
    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstNsame() {
        return firstName;
    }

    public void setFirstNsame(String firstNsame) {
        this.firstName = firstNsame;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String LastName) {
        this.lastName = LastName;
    }

    public Map<Long, Movie> getMovies() {
        return movies;
    }

    public void setMovies(Map<Long, Movie> movies) {
        this.movies = movies;
    }
    
   
    
}
