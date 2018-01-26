package com.xiaoxgeek.demo20;

import java.util.Stack;

/**
 * Created by XiaoX on 2018/1/25.
 */
public class Demo01 {
    private Stack<Integer> stack = new Stack();
    public void push(int node) {
        stack.push(node);

    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.pop();
    }

    public int min() {

    }
}
