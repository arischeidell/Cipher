
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
//        System.out.println("_____ENCRYPTION_____");
//        File rawFile = new File("Docs/doc1.txt");
//        File keyFile = new File("Keys/key1.txt");
//        
//        //read the file and key
//        String raw = Reader.read(rawFile);
//        System.out.println(raw);
//        int key = Integer.parseInt(Reader.read(keyFile));
//        System.out.println(key);
//        
//        //encypt the file
//        Encipher e = new Encipher(raw, key);
//        String encrypted = e.encrypt();
//        System.out.println(encrypted);
//        
//        //write the file
//        Writer.write("doc1", encrypted, true);
//        
//        System.out.println("\n______DECRYPTION______");
//        File encryptedFile = new File("Output/doc1encrypted.txt");
//        String crypt = Reader.read(encryptedFile);
//        System.out.println(crypt);
//        Decipher d = new Decipher(crypt, key);
//        String plaintext = d.decrypt();
//        System.out.println(plaintext);
//        Writer.write("doc1", plaintext, false);

        File inputDir = new File("Docs/");
        File outputDir = new File("Output/");
        File keyDir = new File("Keys/");
        Cipher c = new Cipher(inputDir, outputDir, keyDir);
        c.encrypt();
        c.decrypt();
    }
    
}
