/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn.german.model;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author jakubowski
 */
@Entity
public class Verb extends Word implements Serializable {
    private static final long serialVersionUID = 1L;
   
    private String infinitiveForm;
    private String singular1stForm;
    private String singular2ndForm;
    private String singular3rdForm;
    private String plural1stForm;
    private String plural2ndForm;
    private String plural3rdForm;
    private String perfect3rdForm;

    public String getInfinitiveForm() {
        return infinitiveForm;
    }

    public void setInfinitiveForm(String infinitiveForm) {
        this.infinitiveForm = infinitiveForm;
    }

    public String getSingular1stForm() {
        return singular1stForm;
    }

    public void setSingular1stForm(String singular1stForm) {
        this.singular1stForm = singular1stForm;
    }

    public String getSingular2ndForm() {
        return singular2ndForm;
    }

    public void setSingular2ndForm(String singular2ndForm) {
        this.singular2ndForm = singular2ndForm;
    }

    public String getSingular3rdForm() {
        return singular3rdForm;
    }

    public void setSingular3rdForm(String singular3rdForm) {
        this.singular3rdForm = singular3rdForm;
    }

    public String getPlural1stForm() {
        return plural1stForm;
    }

    public void setPlural1stForm(String plural1stForm) {
        this.plural1stForm = plural1stForm;
    }

    public String getPlural2ndForm() {
        return plural2ndForm;
    }

    public void setPlural2ndForm(String plural2ndForm) {
        this.plural2ndForm = plural2ndForm;
    }

    public String getPlural3rdForm() {
        return plural3rdForm;
    }

    public void setPlural3rdForm(String plural3rdForm) {
        this.plural3rdForm = plural3rdForm;
    }

    public String getPerfect3rdForm() {
        return perfect3rdForm;
    }

    public void setPerfect3rdForm(String perfect3rdForm) {
        this.perfect3rdForm = perfect3rdForm;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Verb)) {
            return false;
        }
        Verb other = (Verb) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "learn.german.model.Verb[ id=" + id + " ]";
    }
    
}
