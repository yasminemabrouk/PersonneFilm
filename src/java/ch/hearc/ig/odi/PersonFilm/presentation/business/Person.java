/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.PersonFilm.presentation.business;

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

    public Person(Long id, String firstNsame, String LastName) {
        this.id = id;
        this.firstName = firstNsame;
        this.lastName = LastName;
    }

     /*
    ajouter un film a liste des films d'une personne
    parametre un objet de type Movie a jouter a n la liste
    */
    public void addMovie(Movie movie){
    Integer position = movies.size() + 1;
        System.out.println("yasmine : "+position);
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
