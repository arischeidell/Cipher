
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ariannascheidell
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File rawFile = new File("Docs/doc1.txt");
        File keyFile = new File("Keys/key1.txt");
        
        String raw = Reader.read(rawFile);
        System.out.println(raw);
        int key = Integer.parseInt(Reader.read(keyFile));
        System.out.println(key);
        
        Encipher e = new Encipher(raw, key);
        String encrypted = e.encrypt();
        System.out.println(encrypted);
        
        Writer.write("doc1", encrypted, true);
    }
    
}
