/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.PersonFilm.presentation.bean;

import ch.hearc.ig.odi.PersonFilm.presentation.business.Movie;
import ch.hearc.ig.odi.PersonFilm.presentation.business.Person;
import ch.hearc.ig.odi.PersonFilm.presentation.business.Services;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author yasmine.mabrouk
 */
public class ListsBean {

    @Inject
    Services service;

    public List<Person> getPeoples() {
        return service.getPeopleList();
    }

    public List<Movie> getMovies() {
        return service.getMoviesList();
    }

}
