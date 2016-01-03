/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.personnefilm.presentation.bean;

import ch.hearc.ig.odi.personnefilm.business.Movie;
import ch.hearc.ig.odi.personnefilm.business.Person;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author yasmine.mabrouk
 */
@RequestScoped
@Named(value = "detailFilmBean")
public class DetailsFilmBean implements Serializable {
Movie film ;
    
    public DetailsFilmBean() {
    }

    public Movie getFilm() {
        return film;
    }

    public void setFilm(Movie film) {
        this.film = film;
    }
    public String showFilm(Movie p ){
           if(p != null){
            film = p;
        }else{
            film = null;
           }
   return "ShowMovie";
   }
    

}
