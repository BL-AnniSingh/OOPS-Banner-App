package com.bridgelabz.oopsbannerapp;

import java.util.HashMap;
import java.util.Map;

public class OOPSBanner {

    public static void main(String[] args) {

        // Step 1: Create a Map of letters to their patterns
        Map<Character, String[]> letterPatterns = new HashMap<>();

        letterPatterns.put('O', new String[]{
                "   ******   ",
                " **      ** ",
                "**        **",
                "**        **",
                "**        **",
                " **      ** ",
                "   ******   "
        });

        letterPatterns.put('P', new String[]{
                "********    ",
                "**      **  ",
                "**      **  ",
                "********    ",
                "**          ",
                "**          ",
                "**          "
        });

        letterPatterns.put('S', new String[]{
                "   ******   ",
                " **         ",
                "**          ",
                "   ******   ",
                "        **  ",
                "        **  ",
                "   ******   "
        });

        // Step 2: Define the word to print
        String word = "OOPS";

        // Step 3: Print the word line by line
        for (int i = 0; i < 7; i++) {  // 7 lines in each letter
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = letterPatterns.get(ch);
                if (pattern != null) {
                    line.append(pattern[i]).append("  "); // spacing between letters
                } else {
                    line.append("          "); // empty space if letter not found
                }
            }

            System.out.println(line);
        }
    }
}
