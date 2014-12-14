/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn.german.service;

import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import javax.ejb.Stateless;
import learn.german.util.MongoConnection;

/**
 *
 * @author cartman
 */

@Stateless
public class MongoService {

    public void insertDocument(DBObject object, String collectionName) {
        MongoConnection conn = new MongoConnection();
        DBCollection coll = conn.getDb().getCollection(collectionName);
        coll.insert(object);
    }
}
