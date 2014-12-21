/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn.german.model;

import java.io.Serializable;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

/**
 *
 * @author jakubowski
 */
@Entity
public class Verb extends Word implements Serializable {

    private static final long serialVersionUID = 1L;

    private String infinitiveForm;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "singular1stForm", column = @Column(name = "presentSimple_singular1stForm")),
        @AttributeOverride(name = "singular2ndForm", column = @Column(name = "presentSimple_singular2ndForm")),
        @AttributeOverride(name = "singular3rdForm", column = @Column(name = "presentSimple_singular3rdForm")),
        @AttributeOverride(name = "plural1stForm", column = @Column(name = "presentSimple_plural1stForm")),
        @AttributeOverride(name = "plural2ndForm", column = @Column(name = "presentSimple_plural2ndForm")),
        @AttributeOverride(name = "plural3rdForm", column = @Column(name = "presentSimple_plural3rdForm"))

    })
    private VerbConjugation presentSimple = new VerbConjugation();

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "singular1stForm", column = @Column(name = "pastSimple_singular1stForm")),
        @AttributeOverride(name = "singular2ndForm", column = @Column(name = "pastSimple_singular2ndForm")),
        @AttributeOverride(name = "singular3rdForm", column = @Column(name = "pastSimple_singular3rdForm")),
        @AttributeOverride(name = "plural1stForm", column = @Column(name = "pastSimple_plural1stForm")),
        @AttributeOverride(name = "plural2ndForm", column = @Column(name = "pastSimple_plural2ndForm")),
        @AttributeOverride(name = "plural3rdForm", column = @Column(name = "pastSimple_plural3rdForm"))

    })
    private VerbConjugation pastSimple = new VerbConjugation();

    @NotNull
    private PresentPerfectMode perfectMode;

    @NotNull
    private String presentPerfectForm;

    public String getInfinitiveForm() {
        return infinitiveForm;
    }

    public void setInfinitiveForm(String infinitiveForm) {
        this.infinitiveForm = infinitiveForm;
    }

    public VerbConjugation getPresentSimple() {
        return presentSimple;
    }

    public void setPresentSimple(VerbConjugation presentSimple) {
        this.presentSimple = presentSimple;
    }

    public PresentPerfectMode getPerfectMode() {
        return perfectMode;
    }

    public void setPerfectMode(PresentPerfectMode perfectMode) {
        this.perfectMode = perfectMode;
    }

    public String getPresentPerfectForm() {
        return presentPerfectForm;
    }

    public void setPresentPerfectForm(String presentPerfectForm) {
        this.presentPerfectForm = presentPerfectForm;
    }

//    public VerbConjugation getPastSimple() {
//        return pastSimple;
//    }
//
//    public void setPastSimple(VerbConjugation pastSimple) {
//        this.pastSimple = pastSimple;
//    }

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
