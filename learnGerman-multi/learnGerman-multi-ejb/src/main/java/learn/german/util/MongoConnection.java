/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn.german.util;

import com.mongodb.DB;
import com.mongodb.MongoClient;

/**
 *
 * @author cartman
 */
public class MongoConnection {

    private DB db;

    public DB getDb() {
        return db;
    }
    
    
    public MongoConnection() {
        try {
            MongoClient mongoClient = new MongoClient("localhost", 27017);
            db = mongoClient.getDB("test");
            System.out.println("Connect to database successfully");
        } catch (Exception e) {
        }
    }
}
