/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn.german.test;

import com.mongodb.DB;
import java.util.Set;
import junit.framework.TestCase;
import learn.german.util.MongoConnection;
import org.junit.Test;

/**
 *
 * @author cartman
 */
public class MongoDBConnectionTest  {
    
    @Test
    public void connectTest() {
        new MongoConnection();
    }
    @Test
    public void getCollectionsTest() {
        DB db = new MongoConnection().getDb();
        Set<String> colls = db.getCollectionNames();
        for (String s : colls) {
            System.out.println(s);
        }
    }
}
