/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn.german.mongo.model;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import java.io.Serializable;

/**
 *
 * @author cartman
 */
public interface MongoObject extends Serializable {

    public DBObject getObject();
}
