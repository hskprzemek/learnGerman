/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn.german.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author jakubowski
 */
@Entity
public class Adjective extends  Word implements Serializable {
    private static final long serialVersionUID = 1L;
   
    private String word;
    
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
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
        if (!(object instanceof Adjective)) {
            return false;
        }
        Adjective other = (Adjective) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "learn.german.model.Adjective[ id=" + id + " ]";
    }

  
    
}
