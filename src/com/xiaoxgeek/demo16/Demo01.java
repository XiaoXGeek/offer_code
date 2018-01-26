package com.xiaoxgeek.demo16;

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
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null)return list2;
        if(list2 == null)return list1;
        ListNode current = new ListNode(0);
        ListNode result = current;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                current.next = list1;
                list1 = list1.next;
                current = current.next;
            }else if(list1.val > list2.val){
                current.next = list2;
                list2 = list2.next;
                current = current.next;
            }else{
                current.next = list1;
                list1 = list1.next;
                current = current.next;
                current.next = list2;
                list2 = list2.next;
                current = current.next;
            }
        }
        if(list1 == null)
            current.next = list2;
        if(list2 == null)
            current.next = list1;
        return result.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode p = list1;
        for(int i=3;i<6;i=i+2){
            ListNode node = new ListNode(i);
            p.next = node;
            p = p.next;
        }

        ListNode list2 = new ListNode(2);
        ListNode q = list2;
        for(int i=4;i<7;i=i+2){
            ListNode node = new ListNode(i);
            q.next = node;
            q = q.next;
        }

        ListNode new_head = new Demo01().Merge(list1, list2);
        while(new_head.next!=null){
            System.out.print(new_head.val);
            new_head = new_head.next;
        }
        System.out.print(new_head.val);
    }
}
