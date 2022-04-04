package io.amigos.ds;

import java.util.Stack;

public class _Stack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();

        stack.push(1);
        stack.push(2);
        stack.push(5);

        System.out.println(stack.size());
        System.out.println(stack.peek());

        System.out.println(stack.pop());

        System.out.println(stack.size());

        System.out.println(stack.peek());

    }
}
