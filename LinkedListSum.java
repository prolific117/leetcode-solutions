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
public class LinkedListSum {
    
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //pass the sum into l1
        ListNode sumNode = null;
        
        while(l1 != null || l2 != null){
            int sum = 0;
            //run recursion
            if(l1 != null){
                sum = sum + l1.val;
                l1 = l1.next;
            }
            
            if(l2 != null){
                sum = sum + l2.val;
                l2 = l2.next;
            }
                    
            if(sum >= 10){
                sum = sum % 10;
                if(l1 == null){
                    l1 = new ListNode(1);
                }
                else
                    l1.val = l1.val + 1;
             }
            
            if(sumNode == null){
                sumNode = new ListNode(sum);
            }
            else{
                ListNode last = sumNode;
                while (last.next != null) {
                    last = last.next;
                }
                last.next = new ListNode(sum);
            }                        
        }
            
        return sumNode;
    }
}
