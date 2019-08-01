/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author olatunjioduro
 */
public class LongestNonRepeatingSubString {

    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        int longest = lengthOfLongestSubstring("dvdf");
        System.out.println("babad".substring(0, 3));

    }

    public static int lengthOfLongestSubstring(String s) {
        String[] tokens = s.split("");
        String curSubString = tokens[0];
        String longestSubString = tokens[0];

        
        for (int i = 1; i < tokens.length; i++) {
            String tempCurrent = curSubString;
            int index = curSubString.indexOf(tokens[i]);
            if (index == -1) {
                curSubString += tokens[i];

                if (curSubString.length() > longestSubString.length()) {
                    longestSubString = curSubString;
                }
            }

            if (index > -1) {
                curSubString = curSubString.substring(index + 1, curSubString.length()) + tokens[i];
            }

            System.out.println(longestSubString + " - " + curSubString);
        }

        return longestSubString.length();
    }

}
