/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.personnefilm.presentation.bean;

import ch.hearc.ig.odi.personnefilm.business.Person;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 * bean lié a la page detailPersonne.xhtml
 * @author yasmine.mabrouk
 */

@SessionScoped
@Named(value = "detailPersonneBean")
public class DetailPersonneBean  implements Serializable{
    
    Person personne ;

    /**
     * constructeur pas défaut
     */
    public DetailPersonneBean() {
    }


    public Person getPersonne() {
        return personne;
    }

    public void setPersonne(Person personne) {
        this.personne = personne;
    }
    
    /**
     * methode qui reçoit le personne à afficher sur la page.
     * @param p objet Person 
     * @return "show" si le paramètre est correct, "error" s'il est null.
     */
   public String showPersonne(Person p ){
           if(p != null){
            personne = p;
        }else{
            personne = null;
           }
   return "Show";
   }
    
}
