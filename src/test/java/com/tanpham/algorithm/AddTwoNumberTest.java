package com.tanpham.algorithm;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.tanpham.algorithm.AddTwoNumber;
import com.tanpham.algorithm.ListNode;

public class AddTwoNumberTest {
    
    @Test
    public void addTwoNumber() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        
        ListNode result = new AddTwoNumber().addTwoNumbers(l1, l2);
        assertThat(result.val, equalTo(7));
        assertThat(result.next.val, equalTo(0));
        assertThat(result.next.next.val, equalTo(8));
    }
    
    @Test
    public void addTwoNumber_2() {
        ListNode l1 = new ListNode(5);
        
        ListNode l2 = new ListNode(5);
        
        ListNode result = new AddTwoNumber().addTwoNumbers(l1, l2);
        assertThat(result.val, equalTo(0));
        assertThat(result.next.val, equalTo(1));
    }
    
    @Test
    public void addTwoNumber_3() {
        ListNode l1 = new ListNode(5);
        
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(1);
        
        ListNode result = new AddTwoNumber().addTwoNumbers(l1, l2);
        System.out.println(result);
        assertThat(result.val, equalTo(0));
        assertThat(result.next.val, equalTo(2));
    }
    
    @Test
    public void addTwoNumber_4() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(8);
        
        ListNode l2 = new ListNode(0);
        
        ListNode result = new AddTwoNumber().addTwoNumbers(l1, l2);
        System.out.println(result);
        assertThat(result.val, equalTo(1));
        assertThat(result.next.val, equalTo(8));
    }
    
    @Test
    public void addTwoNumber_5() {
        ListNode l1 = new ListNode(1);
        
        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        
        ListNode result = new AddTwoNumber().addTwoNumbers(l1, l2);
        System.out.println(result);
        assertThat(result.val, equalTo(0));
        assertThat(result.next.val, equalTo(0));
        assertThat(result.next.next.val, equalTo(1));
    }
    
    @Test
    public void addTwoNumber_6() {
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        
        ListNode l2 = new ListNode(9);
        
        ListNode result = new AddTwoNumber().addTwoNumbers(l1, l2);
        System.out.println(result);
        assertThat(result.val, equalTo(8));
        assertThat(result.next.val, equalTo(0));
        assertThat(result.next.next.val, equalTo(1));
    }
    
    @Test
    public void addTwoNumber_7() {
        ListNode l1 = new ListNode(0);
        
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(7);
        l2.next.next = new ListNode(8);
        
        ListNode result = new AddTwoNumber().addTwoNumbers(l1, l2);
        System.out.println(result);
        assertThat(result.val, equalTo(2));
        assertThat(result.next.val, equalTo(7));
        assertThat(result.next.next.val, equalTo(8));
    }
    
}
