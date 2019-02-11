package com.company;

import java.util.Stack;

public class SimpleStack
{
    public static void main(String[] args)
    {
        SimpleStack stack = new SimpleStack();
        stack.run();
    }

    public void run()
    {
        Stack<String> myStack = new Stack();
        myStack.push("one");
        myStack.push("two");
        myStack.push("three");
        myStack.push("four");
        myStack.push("five");
        System.out.println(myStack);

        // pop removes the last number accord to the LIFO rule for stacks.
       /* myStack.pop();
        System.out.println(myStack);
        myStack.pop();
        System.out.println(myStack);
        myStack.pop();
        System.out.println(myStack);
        myStack.pop();
        System.out.println(myStack);
        myStack.pop();
        System.out.println(myStack);
        myStack.pop();
        System.out.println(myStack);
        */
       //peek just retrieves the last number instead of r 
        System.out.println(myStack.peek());
        System.out.println(myStack.peek());

    }

}
