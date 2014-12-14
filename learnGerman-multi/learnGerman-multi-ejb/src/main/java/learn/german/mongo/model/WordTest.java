/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn.german.mongo.model;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;
import java.util.List;

/**
 *
 * @author cartman
 */
public class WordTest implements MongoObject {

    
    private int id;
    
    private List<Integer> words;
    
    @Override
    public DBObject getObject() {
        return BasicDBObjectBuilder.start().add("id",id).add("words", words).get();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Integer> getWords() {
        return words;
    }

    public void setWords(List<Integer> words) {
        this.words = words;
    }
    
    
    
}
