
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
public class Encipher {
    private ArrayList<Character> alpha;
    private String raw;
    private int key;
    
    public Encipher(String raw, int key) {
        alpha = new ArrayList();
        setup();
        this.raw = raw;
        this.key = key;
    }
    
    private void setup() {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*()-_=+{}[]|:;\"'?/\\~,.<> ";
        for (int i = 0; i < alphabet.length(); i++) {
            alpha.add(alphabet.charAt(i));
        }
    }
    
    public String encrypt() {
        String encrypted = "";
        for (int i = 0; i < raw.length(); i++) {
            Character c = raw.charAt(i);
            encrypted += transform(c);
        }
        return encrypted;
    }
    
    private Character transform(Character c) {
        int charNum = alpha.indexOf(c) + key;
        if (charNum > alpha.size()) {
            charNum = charNum - alpha.size();
        }
        return alpha.get(charNum);
    } 
}
