/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn.german.controller;

import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import learn.german.model.User;
import learn.german.service.UserService;

/**
 *
 * @author cartman
 */

@Model
public class UserController {
    
    @Inject
    UserService userService;
    
    private User user; 
    
    @Produces
    @Named
    public User getUser(){
        if ( user == null) {
            user = new User();
        }
        return user;
    }
    
    public String registerUser() {
        userService.createUser(user);
        user = null;
        return "ok";
    }
    
}
