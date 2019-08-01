/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import static LeetCode.LongestNonRepeatingSubString.lengthOfLongestSubstring;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author olatunjioduro
 */
public class FindMedian {
    
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        double median = findMedianSortedArrays(new int[]{1,2}, new int[]{3,4});
        System.out.println(median);
        
    }
    
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //merge both arrays
        int firstCounter = 0;
        int secondCounter = 0;
        int sumCounter = 0;
        
        int[] resultingArray = new int[nums1.length + nums2.length];
        
        while(firstCounter < nums1.length && secondCounter < nums2.length){
            if(nums1[firstCounter] <= nums2[secondCounter]){
                resultingArray[sumCounter] = nums1[firstCounter];
                firstCounter++;
            }
            else{
                resultingArray[sumCounter] = nums2[secondCounter];
                secondCounter++;
            }
            
            sumCounter++;
        }
        
        while(firstCounter < nums1.length){
           resultingArray[sumCounter] = nums1[firstCounter];
           firstCounter++; 
           sumCounter++;
        }
        
        while(secondCounter < nums2.length){
           resultingArray[sumCounter] = nums2[secondCounter];
           secondCounter++; 
           sumCounter++;
        }
       
        int mid = (int) Math.floor(resultingArray.length/2);
        if(resultingArray.length % 2 == 0){
            return (resultingArray[mid - 1] + resultingArray[mid]) / 2;
        }
        else{
            return new Double(resultingArray[mid]);
        }
        
    }
}
