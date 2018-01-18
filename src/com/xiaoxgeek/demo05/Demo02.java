package com.xiaoxgeek.demo05;

import java.util.Stack;

/**
 * Created by XiaoX on 2018/1/18.
 */
public class Demo02 {
    // 入棧
    Stack<Integer> stack1 = new Stack<Integer>();
    // 出棧
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack2.push(node);
    }

    public int pop() {
        if(!stack1.isEmpty())
            return stack1.pop();
        else if(!stack2.isEmpty()){
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
            return stack1.pop();
        }
        return stack1.pop();
    }
}
