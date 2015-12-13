/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.PersonFilm.presentation.bean;

import ch.hearc.ig.odi.PersonFilm.presentation.business.Movie;
import ch.hearc.ig.odi.PersonFilm.presentation.business.Person;
import ch.hearc.ig.odi.PersonFilm.presentation.business.Services;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author yasmine.mabrouk
 */
@RequestScoped 
@Named
public class ListsBean implements Serializable {

    @Inject
    Services service;

    public List<Person> getPeoples() {
        return service.getPeopleList();
    }

    public List<Movie> getMovies() {
        return service.getMoviesList();
    }

}
