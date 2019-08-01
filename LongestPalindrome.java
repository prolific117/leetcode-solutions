/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

/**
 *
 * @author olatunjioduro
 */
public class LongestPalindrome {
  
    public String longestPalindrome(String s) {
        int maxLength = 1; // The result (length of LPS) 
        int start = 0; 
        int len = s.length(); 
        int low = 0;
        int high = 0; 
        
        if(s.equals("")){
            return "";
        }
        
        if(s.length() == 1){
            return s;
        }
  
        // One by one consider every character as center 
        // point of even and length palindromes 
        for (int i = 1; i < len; ++i)  
        { 
            // Find the longest even length palindrome with  
            // center points as i-1 and i. 
            low = i - 1; 
            high = i; 
            while (low >= 0 && high < len  && s.charAt(low) == s.charAt(high)) { 
                if (high - low + 1 > maxLength) { 
                    start = low; 
                    maxLength = high - low + 1; 
                } 
                --low; 
                ++high; 
            } 
  
            // Find the longest odd length palindrome with  
            // center point as i 
            low = i - 1; 
            high = i + 1; 
            while (low >= 0 && high < len 
                    && s.charAt(low) == s.charAt(high)) { 
                if (high - low + 1 > maxLength) { 
                    start = low; 
                    maxLength = high - low + 1; 
                } 
                --low; 
                ++high; 
            } 
            
           
         }
        
        return s.substring(start, start + maxLength); 
    }
    
}
