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
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    @Inject 
    Logger logger;
    
    @Inject 
    WordRepository wordRepository;
    
    @Inject 
    WordService wordService;
    
    public List<Noun> getNouns(){
        return wordRepository.getNouns();
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
        System.out.println(noun.toString());
        System.out.println(noun.getSingularForm());
        System.out.println(noun.getPluralForm());
        System.out.println(noun.getGender());
        wordService.addNoun(noun);
        text = noun.getSingularForm() + " " + noun.getPluralForm();
        noun = null;
        return "";
    }
     public String editNoun(int id) {
         noun = wordRepository.getNoun(id);
         return "";
     }
    
            
}
