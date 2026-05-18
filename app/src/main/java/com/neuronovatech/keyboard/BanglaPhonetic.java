package com.neuronovatech.keyboard;

import java.util.HashMap;
import java.util.Map;

public class BanglaPhonetic {
    private static final Map<String, String> phonemeMap = new HashMap<>();
    
    static {
        // Vowels
        phonemeMap.put("a", "\u0985");  // অ
        phonemeMap.put("aa", "\u0986"); // আ
        phonemeMap.put("i", "\u0987");  // ই
        phonemeMap.put("ii", "\u0988"); // ঈ
        phonemeMap.put("u", "\u0989");  // উ
        phonemeMap.put("uu", "\u098A"); // ঊ
        
        // Consonants
        phonemeMap.put("k", "\u0995");  // ক
        phonemeMap.put("kh", "\u0996"); // খ
        phonemeMap.put("g", "\u0997");  // গ
        phonemeMap.put("gh", "\u0998"); // ঘ
        phonemeMap.put("ng", "\u0999"); // ঙ
        phonemeMap.put("ch", "\u099A"); // চ
        phonemeMap.put("chh", "\u099B"); // ছ
        phonemeMap.put("j", "\u099C");  // জ
        phonemeMap.put("jh", "\u099D"); // ঝ
        phonemeMap.put("ny", "\u099E"); // ঞ
        
        // More consonants
        phonemeMap.put("t", "\u099F");  // ট
        phonemeMap.put("th", "\u09A0"); // ঠ
        phonemeMap.put("d", "\u09A1");  // ড
        phonemeMap.put("dh", "\u09A2"); // ঢ
        phonemeMap.put("n", "\u09A3");  // ণ
    }
    
    public static String convertPhonetic(String input) {
        StringBuilder result = new StringBuilder();
        String lower = input.toLowerCase();
        int i = 0;
        
        while (i < lower.length()) {
            String matched = null;
            // Try two-character combinations first
            if (i + 1 < lower.length()) {
                String twoChar = lower.substring(i, i + 2);
                if (phonemeMap.containsKey(twoChar)) {
                    matched = twoChar;
                }
            }
            
            // Fall back to single character
            if (matched == null) {
                String oneChar = String.valueOf(lower.charAt(i));
                if (phonemeMap.containsKey(oneChar)) {
                    matched = oneChar;
                }
            }
            
            if (matched != null) {
                result.append(phonemeMap.get(matched));
                i += matched.length();
            } else {
                result.append(lower.charAt(i));
                i++;
            }
        }
        
        return result.toString();
    }
}
