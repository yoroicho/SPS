/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preCon;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Map.Entry;

/**
 *
 * @author tokyo
 */
public class FileHandler {

    public static void loadXML(File file) throws IOException {
        System.out.println(file.getPath().toString());
        Properties prop = new Properties();
        InputStream is = null;
        try {
            is = new FileInputStream(file.getPath().toString());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        prop.loadFromXML(is); // is はこのメソッドが終了すると close される

        System.out.println(prop.getProperty("title"));
        System.out.println(prop.getProperty("section"));
        System.out.println(prop.getProperty("location"));
        System.out.println(prop.getProperty("user"));
        System.out.println(prop.getProperty("token"));
        System.out.println(prop.getProperty("notes"));
        System.out.println(prop.getProperty("date"));
        
        /**
         * Other way
        for (Entry<Object, Object> entry : prop.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        */
    }
}
