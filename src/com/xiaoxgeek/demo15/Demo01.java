package com.xiaoxgeek.demo15;

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
    public ListNode ReverseList(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode p = head;
        ListNode q = head.next;
        ListNode r = head;
        while(q.next!=null){
            r = q.next;
            q.next = p;
            p = q;
            q = r;
        }
        q.next = p;
        head.next = null;
        return q;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode p = head;
        for(int i=2;i<6;i++){
            ListNode node = new ListNode(i);
            p.next = node;
            p = p.next;
        }
        ListNode new_head = new Demo01().ReverseList(head);
        while(new_head.next!=null){
            System.out.print(new_head.val);
            new_head = new_head.next;
        }
        System.out.print(new_head.val);
    }
}
