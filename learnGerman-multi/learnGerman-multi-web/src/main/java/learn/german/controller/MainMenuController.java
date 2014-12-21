/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn.german.controller;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import learn.german.util.MenuItem;

/**
 *
 * @author cartman
 */
@Named("mainMenu")
@SessionScoped
public class MainMenuController implements  Serializable{
    
    private MenuItem item = MenuItem.MAIN;

    public MenuItem getItem() {
        return item;
    }

    public void setItem(MenuItem item) {
        this.item = item;
    }
    
    public void verbs() {
        System.out.println("Verbs");
        System.out.println(item);
        item = MenuItem.EDIT_VERBS;
    }
    
    public void nouns() {
        System.out.println("Nouns");
        System.out.println(item);
        item = MenuItem.EDIT_NOUNS;
    }
    
    public void menu() {
        item = MenuItem.MAIN;
    }
    
    public boolean isMain() {
        System.out.println("::IsMain::" +  item);
        return item == MenuItem.MAIN;
    }
    
    public boolean isEditNouns() {
        System.out.println("::IsEditNouns::" +  item);
        return item == MenuItem.EDIT_NOUNS;
    }
    
    public boolean isEditVerbs() {
        System.out.println("::IsEditVerbs::" +  item);
        return item == MenuItem.EDIT_VERBS;
    }
}
