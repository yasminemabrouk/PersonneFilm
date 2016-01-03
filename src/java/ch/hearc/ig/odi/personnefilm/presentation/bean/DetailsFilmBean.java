/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.personnefilm.presentation.bean;

import ch.hearc.ig.odi.personnefilm.business.Movie;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 * bean lié a la page detailFilm.xhtml
 * @author yasmine.mabrouk
 */
@SessionScoped
@Named(value = "detailFilmBean")
public class DetailsFilmBean implements Serializable {
Movie film ;
    
    /**
     * constructeur par défaut
     */
    public DetailsFilmBean() {
    }

    public Movie getFilm() {
        return film;
    }

    public void setFilm(Movie film) {
        this.film = film;
    }
    
    /**
     * methode qui reçoit le film à afficher sur la page.
     * @param p le film
     * @return "show" si le paramètre est correct, "error" s'il est null.
     */
    public String showFilm(Movie p ){
        // verifier si la movie est null ou pas
           if(p != null){
            film = p;
        }else{
            film = null;
           }
   return "ShowMovie";
   }
    

}
