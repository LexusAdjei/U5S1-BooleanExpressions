package com.codedifferently.labs.partB.ex04;
import java.util.Scanner;


public class IfElse {

    public static String equalToSeven(){
        String response = "";

        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        /* Put your code in between these comments : Top */
        if(num != 7){
            response+="Whoops,That's unlucky!";
        } else if (num == 7) {
            response+="That's a lucky number!";
        }

        /* Put your code in between these comments : Bottom */


        return response;
    }
    public static void main(String[] args) {
        String luckyOutput = equalToSeven();
        System.out.println(luckyOutput);
    }
}
