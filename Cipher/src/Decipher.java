
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ariannascheidell
 */
public class Decipher {
    private ArrayList<Character> alpha;
    private String encrypted;
    private int key;
    
    public Decipher(String encrypted, int key) {
        alpha = new ArrayList();
        setup();
        this.encrypted = encrypted;
        this.key = key;
    }
    
    private void setup() {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*()-_=+{}[]|:;\"'?/\\~,.<> ";
        for (int i = 0; i < alphabet.length(); i++) {
            alpha.add(alphabet.charAt(i));
        }
    }
    
    public String decrypt() {
        String decrypted = "";
        for (int i = 0; i < encrypted.length(); i++) {
            Character c = encrypted.charAt(i);
            decrypted += transform(c);
        }
        return decrypted;
    }
    
    private Character transform(Character c) {
        int charNum = alpha.indexOf(c) - key;
        if (charNum < 0) {
            charNum = charNum + alpha.size();
        }
        return alpha.get(charNum);
    } 
}
