/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccont.presentation.business;

import java.util.Map;

/**
 *
 * @author yasmine.mabrouk
 */
public class Person {
    Long id ;
    String firstNsame;
    String LastName ;
    Map<Long, Movie> movies;

    public Person(Long id, String firstNsame, String LastName) {
        this.id = id;
        this.firstNsame = firstNsame;
        this.LastName = LastName;
    }

     /*
    ajouter un film a liste des films d'une personne
    parametre un objet de type Movie a jouter a n la liste
    */
    public void addMovie(Movie movie){
    Integer position = movies.size()+ 1;
    movies.put( position.longValue(), movie);
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstNsame() {
        return firstNsame;
    }

    public void setFirstNsame(String firstNsame) {
        this.firstNsame = firstNsame;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public Map<Long, Movie> getMovies() {
        return movies;
    }

    public void setMovies(Map<Long, Movie> movies) {
        this.movies = movies;
    }
    
   
    
}
