package com.xiaoxgeek.demo14;

/**
 * Created by XiaoX on 2018/1/23.
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Demo01 {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(k<=0)return null;
        if(head==null) return null;
        ListNode p =  head;
        int count = k;
        while(head.next!=null){
            count--;
            if(k>0)k--;
            if(k==0)p=p.next;
            head = head.next;
        }
        if(count>1)return null;
        return p;
    }
}
