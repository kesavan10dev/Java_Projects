package com.numberguessinggame;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int key = 1 + rand.nextInt(10);
        int value = 0;
        System.out.println("This is Number Guessing Game u have to find the number From 1 to 10 GOOD LUCK!!!");
        while( value != key){

            System.out.print("enter ur guess :");
            value = scan.nextInt();
            if(value < key)    System.out.println("ur guess is low");
            else if(value > key)    System.out.println("ur guess is high");
        }
        System.out.println("u got it!");
        scan.close();
    }
}
