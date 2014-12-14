/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn.german.model;

import javax.persistence.Entity;
import learn.german.model.util.Gender;

/**
 *
 * @author jakubowski
 */
@Entity
public class Noun extends Word {
    private static final long serialVersionUID = 1L;
   
    private String singularForm;
    private String pluralForm;
    private Gender gender;

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    
    public String getSingularForm() {
        return singularForm;
    }

    public void setSingularForm(String singularForm) {
        this.singularForm = singularForm;
    }

    public String getPluralForm() {
        return pluralForm;
    }

    public void setPluralForm(String pluralForm) {
        this.pluralForm = pluralForm;
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
        if (!(object instanceof Noun)) {
            return false;
        }
        Noun other = (Noun) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "learn.german.model.Noun[ id=" + id + " ]";
    }
    
}
