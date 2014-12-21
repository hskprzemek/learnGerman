/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn.german.service;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import learn.german.model.User;

/**
 *
 * @author cartman
 */
@Stateless
public class UserService {
    
    @Inject
    EntityManager entityManager;
    
    public void createUser (User user) {
        entityManager.persist(user);
    }
    
}
