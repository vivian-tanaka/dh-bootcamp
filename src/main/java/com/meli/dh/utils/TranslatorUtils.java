package com.meli.dh.utils;

public class TranslatorUtils {
    // store the all the alphabet in an array
    char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f',
            'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r',
            's', 't', 'u', 'v', 'w', 'x',
            'y', 'z', '1', '2', '3', '4',
            '5', '6', '7', '8', '9', '0' };


    public static String morseToEnglish(String morseCode)
    {
        StringBuilder builder = new StringBuilder();
        // Morse code by indexing
        String[] code
                = { ".-",   "-...", "-.-.", "-..",  ".",
                "..-.", "--.",  "....", "..",   ".---",
                "-.-",  ".-..", "--",   "-.",   "---",
                ".--.", "--.-", ".-.",  "...",  "-",
                "..-",  "...-", ".--",  "-..-", "-.--",
                "--..", "|" };

        String[] array = morseCode.split(" ");
        
        // Morse code to English
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < code.length; j++) {
                if (array[i].compareTo(code[j]) == 0) {
                    builder.append((char)(j + 'a') + " ");
                    break;
                }
            }
        }

        return builder.toString();
    }

}
