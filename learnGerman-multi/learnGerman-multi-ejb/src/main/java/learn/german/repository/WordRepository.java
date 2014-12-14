/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn.german.repository;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import learn.german.model.Noun;
import learn.german.model.Verb;

/**
 *
 * @author cartman
 */

@ApplicationScoped
public class WordRepository {
    
    @Inject
    EntityManager entityManager;
    
    public List<Noun> getNouns() {
        Query query = entityManager.createQuery("Select n from Noun n");
        return query.getResultList();
    }
    
    public List<Verb> getVerbs() {
        Query query = entityManager.createQuery("Select v from Verb v");
        return query.getResultList();
    }

    public Noun getNoun(int id) {
       return entityManager.find(Noun.class, id);
    }
    
    public Verb getVerb(int id) {
        return entityManager.find(Verb.class, id);
    }
}
