/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.personnefilm.presentation.bean;

import ch.hearc.ig.odi.personnefilm.business.Person;
import ch.hearc.ig.odi.personnefilm.service.Services;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author yasmine.mabrouk
 */

@SessionScoped
@Named(value="creePersonneBean")
public class CreePersonneBean implements Serializable {
   @Inject private Services services;
    Person personne ;

    private CreePersonneBean(Person personne) {
        this.personne = personne;
    }

    public Person getPersonne() {
        return personne;
    }

    public void setPersonne(Person personne) {
        this.personne = personne;
    }
    
    public String addPerson (){
        
        if (personne != null){
        services.getPeopleList().add(personne);
         personne = null ;
         return "addOk";
        }else {
          return "addError";
        }
    }
    
    
    
}
