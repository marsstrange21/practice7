package com.company;

import java.util.Scanner;
import java.util.Stack;

public class stack1 {

    public static void pushBack(Stack<Integer> s, Integer item){
        Stack<Integer> ns = new Stack<>();
        while (!s.empty())
            ns.push(s.pop());
        s.push(item);
        while (!ns.empty())
            s.push(ns.pop());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int counter = 0;

        Stack<Integer> first = new Stack<>();
        Stack<Integer> second = new Stack<>();
        Stack<Integer> all = new Stack<>();
        for (int i = 0; i < 10; i++)
            all.push(in.nextInt());
        for (int i = 0; i < 5; i++)
            second.push(all.pop());
        for (int i = 0; i < 5; i++)
            first.push(all.pop());


        while (!(first.empty()) && !(second.empty()) && counter <= 107){
            if (counter == 107) {
                System.out.println("botva");
                counter++;
            }
            else{
                if ((first.peek() > second.peek() && second.peek() != 0) || (first.peek() == 0 && second.peek() == 9)) { // first won
                    pushBack(first, first.pop());
                    pushBack(first, second.pop());
                }
                else if ((first.peek() < second.peek() && first.peek() != 0) || (first.peek() == 9 && second.peek() == 0)){
                    pushBack(second, first.pop());
                    pushBack(second, second.pop());
                }
                counter++;
            }
        }

        if (first.empty() && counter <= 106)
            System.out.println("second " + counter);
        else if (counter <= 106)
            System.out.println("first " + counter);

    }

}
