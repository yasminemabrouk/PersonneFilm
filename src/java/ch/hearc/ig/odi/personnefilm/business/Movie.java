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
public class Movie {
    
    Long id ;
    String name ;
    String producter;
    private Map<Long, Person> people;
    
    /**
    * Constructeur paramétré de la classe Account. Toutes les valeurs sont obligatoires
    * @param id Le numéro du film
    * @param name Le nom du film
    * @param producter Le producteur de filme
    */
    public Movie(Long id, String name, String producter) {
        this.id = id;
        this.name = name;
        this.producter = producter;
        this.people = new HashMap<>() ;
    }
   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducter() {
        return producter;
    }

    public void setProducter(String producter) {
        this.producter = producter;
    }

    public Map<Long, Person> getPeople() {
        return people;
    }

    public void setPeople(Map<Long, Person> people) {
        this.people = people;
    }

    
    
}
