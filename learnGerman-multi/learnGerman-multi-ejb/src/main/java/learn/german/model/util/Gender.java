/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn.german.model.util;

/**
 *
 * @author cartman
 */
public enum Gender {
    
    MASCULINE  ("M"),  //calls constructor with value 3
    FEMININE("F"),  //calls constructor with value 2
    NEUTER  ("NT");   //calls constructor with value 1
    
    //calls constructor with value 1
    public String getShortName() {
        return shortName;
    }    


    private final String shortName;

    Gender(String shortName) {
        this.shortName = shortName;
    }
    
    
    
        
}
