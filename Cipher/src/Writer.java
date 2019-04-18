
import java.io.FileNotFoundException;
import java.io.PrintWriter;
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
public class Writer {
    public static void write(String filename, String fileString) {
        try {
            PrintWriter pw = new PrintWriter(filename);
            pw.write(fileString);
            pw.flush();
            pw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Writer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
