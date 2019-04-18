
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ariannascheidell
 */
public class Reader {
    
    public static String read(File f) {
        String fileString = "";
        try {
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()) {
                fileString += sc.nextLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Reader.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return fileString;
    }
}
