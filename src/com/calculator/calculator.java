package com.calculator;

import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose your Operation");
        System.out.println("1 for Addition");
        System.out.println("2 for Subtraction");
        System.out.println("3 for Multiplication");
        System.out.println("4 for Division");

        int choose = scan.nextInt();
        System.out.println("Enter Two Numbers");
        int x = scan.nextInt();
        int y = scan.nextInt();

        if(choose == 1){
            System.out.println("The answer is:"+ add(x,y));
        }
        else if(choose == 2){
            System.out.println("The answer is:"+ sub(x,y));
        }
        else if(choose == 3){
            System.out.println("The answer is:"+ mul(x,y));
        }
        else if(choose == 4){
            System.out.println("The answer is:"+ div(x,y));
        }
        else{
            System.out.println("You're out of range");
        }

    }
    public static int add(int x, int y){
        int n;
        n=x+y;
        return n;
    }
    public static int sub(int x, int y){
          int n;
          n=x-y;
          return n;
    }
    public static int mul(int x, int y){
      int n;
      n=x*y;
      return n;
    }
    public static int div(int x, int y){
     int n;
     n=x/y;
     return n;
    }
}
