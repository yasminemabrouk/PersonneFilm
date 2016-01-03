/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.personnefilm.presentation.bean;

import ch.hearc.ig.odi.personnefilm.business.Person;
import ch.hearc.ig.odi.personnefilm.service.Services;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author yasmine.mabrouk
 */

@RequestScoped 
@Named(value = "detailPersonneBean")
public class DetailPersonneBean  implements Serializable{
    
    Person personne ;

    public DetailPersonneBean() {
    }

    public Person getPersonne() {
        return personne;
    }

    public void setPersonne(Person personne) {
        this.personne = personne;
    }
    
   public String showPersonne(Person p ){
           if(p != null){
            personne = p;
        }else{
            personne = null;
           }
   return "Show";
   }
    
}
