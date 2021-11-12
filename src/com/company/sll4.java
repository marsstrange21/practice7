package com.company;
import java.util.LinkedList;
import java.util.Scanner;

public class sll4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int counter = 0;
        LinkedList<Integer> first = new LinkedList<>();
        LinkedList<Integer> second = new LinkedList<>();

        for (int i = 0; i < 5; i++)
            first.add(in.nextInt());
        for (int j = 0; j < 5; j++)
            second.add(in.nextInt());

        while (!(first.isEmpty()) && !(second.isEmpty()) && counter <= 107){
            if (counter == 107) {
                System.out.println("botva");
                counter++;
            }
            else{
                if ((first.peek() > second.peek() && second.peek() != 0) || (first.peek() == 0 && second.peek() == 9)) { // first won
                    first.add(first.remove());
                    first.add(second.remove());
                }
                else if ((first.peek() < second.peek() && first.peek() != 0) || (first.peek() == 9 && second.peek() == 0)){
                    second.add(first.remove());
                    second.add(second.remove());
                }
                counter++;
            }
        }

        if (first.isEmpty() && counter <= 106)
            System.out.println("second " + counter);
        else if (counter <= 106)
            System.out.println("first " + counter);
    }
}
