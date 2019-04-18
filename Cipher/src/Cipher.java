/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;

/**
 *
 * @author ariannascheidell
 */
public class Cipher {
    private File inputDir;
    private File outputDir;
    private File keyDir;
    
    private File [] inputFiles;
    private File [] outputFiles;
    private File [] keys;
    
    public Cipher(File inputDir, File outputDir, File keyDir) {
        this.inputDir = inputDir;
        inputFiles = inputDir.listFiles();
        this.outputDir = outputDir;
        outputFiles = outputDir.listFiles();
        this.keyDir = keyDir;
        keys = keyDir.listFiles();
        
    }
    
    public void encrypt() {
        System.out.println("Starting encryption... ");
        int i = 0;
        for (File f : inputFiles) {
            
            String text = Reader.read(f);
            System.out.println("Encrypting " + f.getName() + ": " + text);
            
            if (i < keys.length) {
                int key = Integer.parseInt(Reader.read(keys[0]));
                System.out.println("Key: " + key);
                Encipher e = new Encipher(text, key);
                String encrypted = e.encrypt();
                System.out.println("Encrypted text: " + encrypted);
                
                Writer.write(f.getName(), encrypted);
            } else {
                System.err.println("Error: number of files does not match number of keys.");
            }
            i++;
        }
        System.out.println("Done encrypting. Encrypted " + i + " files in " + inputDir.getName());
    }
    
    public void decrypt() {
        System.out.println("Starting decryption... ");
        int i = 0;
        outputFiles = outputDir.listFiles(); //just in case
        for (File f : outputFiles) {
            
            String text = Reader.read(f);
            System.out.println("Decrypting " + f.getName() + ": " + text);
            
            if (i < keys.length) {
                int key = Integer.parseInt(Reader.read(keys[0]));
                System.out.println("Key: " + key);
                Decipher d = new Decipher(text, key);
                String decrypted = d.decrypt();
                System.out.println("Decrypted text: " + decrypted);
            } else {
                System.err.println("Error: number of files does not match number of keys.");
            }
            i++;
        }
        System.out.println("Done decrypting. Decrypted " + i + " files in " + outputDir.getName());
    }
}
