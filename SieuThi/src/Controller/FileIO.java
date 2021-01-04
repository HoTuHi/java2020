/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class FileIO {
    public <T> List<T> readFromFile(String fileName){
        List<T> l = new ArrayList<>();
        File file = new File(fileName);
        try {
            file.createNewFile();
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object o = ois.readObject();
            l= (List<T>) o;
        } catch (IOException | ClassNotFoundException ex) {
        }
        return l;
    }
    public <T> void saveToFile(ArrayList l,String fileName){
        File file = new File(fileName);
        try {
            file.createNewFile();
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(l);
        } catch (IOException ex) {     
        }
    }
}
