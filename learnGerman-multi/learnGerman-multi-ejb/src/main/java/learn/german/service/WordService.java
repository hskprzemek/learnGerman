/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn.german.service;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import learn.german.model.Noun;
import learn.german.model.Verb;

/**
 *
 * @author cartman
 */
@Stateless
public class WordService {

    @Inject 
    EntityManager entityManager;
    
    public void addNoun(Noun noun) {
        entityManager.merge(noun);
    }
    
    public void addVerb(Verb verb) {
        entityManager.merge(verb);
    }
    
    public Noun editNoun(Noun noun) {
        return entityManager.merge(noun);
    }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
