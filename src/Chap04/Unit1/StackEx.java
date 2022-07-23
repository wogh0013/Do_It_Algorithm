package Chap04.Unit1;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Data1");
        stack.push("Data2");
        stack.push("Data3");

        System.out.println(stack.pop());

        System.out.println(stack.peek());

        System.out.println(stack.pop());
    }
}
