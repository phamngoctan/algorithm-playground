package com.tanpham.algorithm;

public class AddTwoNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode next1 = l1;
        ListNode next2 = l2;

        int carryAmount = 0;
        boolean isSecondListLonger = false;
        while (next1 != null || next2 != null) {
            int val1 = next1 != null ? next1.val : 0;
            int val2 = next2 != null ? next2.val : 0;

            int value = (val1 + val2 + carryAmount)% 10;
            carryAmount = (val1 + val2 + carryAmount) / 10;
            
            if (next1 != null && next2 != null) {
                next1.val = value;
                next2.val = value;
            } else if (next1 == null) {
                isSecondListLonger = true;
                next2.val = value;
            } else {
                next1.val = value;
            }

            if ((next1 == null || next1.next == null) && (next2 == null || next2.next == null) && carryAmount != 0) {
                if (isSecondListLonger)
                    next2.next = new ListNode(carryAmount);
                else 
                    next1.next = new ListNode(carryAmount);
                break;
            }
            
            next1 = next1 == null ? null : next1.next;
            next2 = next2 == null ? null : next2.next;
        }
        return isSecondListLonger ? l2 : l1;
    }
    
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return "ListNode [val=" + val + "]";
    }
    
}
