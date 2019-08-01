/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import static testsuite.TestApp.hash;

/**
 *
 * @author olatunjioduro
 */
public class TwoSum {
    
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {

    }
    
    public static int[] twoSum(int[] nums, int target) {
        int[] resultArray = new int[2];
        
        for(int i =0; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    resultArray[0] = i;
                    resultArray[1] = j;
                    break;
                }
            }
        }
        
        return resultArray;
    }
}
