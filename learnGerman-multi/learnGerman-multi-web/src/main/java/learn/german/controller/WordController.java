/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn.german.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import learn.german.model.Noun;
import learn.german.model.Verb;
import learn.german.model.util.Gender;
import learn.german.repository.WordRepository;
import learn.german.service.WordService;

/**
 *
 * @author cartman
 */

@Model
public class WordController {
 
    @Inject 
    Logger logger;
    
    @Inject 
    WordRepository wordRepository;
    
    @Inject 
    WordService wordService;
    
    public List<Noun> getNouns(){
        return wordRepository.getNouns();
    }
    
    public List<Verb> getVerbs() {
        return wordRepository.getVerbs();
    }
    
    public Gender[] getGenders() {
        return Gender.values();
    }
    
    private Noun noun;
    private Verb verb;
            
    @Produces
    @Named        
    public Noun getNoun() {        
        System.out.println("getNoun::" + noun);
        if ( noun == null) {
            noun = new Noun();
        }
        return noun;
    }
    
    @Produces
    @Named        
    public Verb getVerb() {        
        System.out.println("getVerb::" + verb);
        if ( verb == null) {
            verb = new Verb();
        }
        return verb;
    }
    
    public String addNoun() { 
        wordService.addNoun(noun);
        noun = null;
        return "";
    }
     public String editNoun(int id) {
         noun = wordRepository.getNoun(id);
         return "";
     }
     
     public String addVerb() {
         wordService.addVerb(verb);
         verb = null;
         return "";
     }
     
     public String editVerb(int id) {
         verb = wordRepository.getVerb(id);
         return "";
     }
    
            
}
