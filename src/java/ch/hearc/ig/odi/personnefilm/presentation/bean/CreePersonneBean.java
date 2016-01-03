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
 * bean lié a la page creePersonne.xhtml
 * @author yasmine.mabrouk
 */

@SessionScoped
@Named(value="creePersonneBean")
public class CreePersonneBean implements Serializable {
   @Inject private Services services;
    Person personne ;
    
    /**
     * constructeur 
     * @param personne 
     */
    private CreePersonneBean(Person personne) {
        this.personne = personne;
    }

    public Person getPersonne() {
        return personne;
    }

    public void setPersonne(Person personne) {
        this.personne = personne;
    }
    
    /**
     * methodw addPerson qui permettre d'ajouter une personne a la liste des personne
     * @return "addOk" si le personne est correct, addError" s'il est null.
     */
    public String addPerson (){
        // verifier si la personne est nul ou pas
        if (personne != null){
        services.getPeopleList().add(personne);
         personne = null ;
         return "addOk";
        }else {
          return "addError";
        }
    }
    
    
    
}
