package com.codedifferently.labs.partB.ex01;
import java.util.Scanner;

public class TempCheck {

    public static String bool(){
        String response= "";
        System.out.println("Enter a number between 0 and 100");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();

        if (temp <= 45){
            response = "It's cold as hell, bro, I'm putting on my jacket, fam";
        }
        if (temp >= 46 && temp <=65) {
            response = "It's not bad out, innit - my jacket be aight";
        } else if (temp > 65) {
            response = "It’s burning out there man, I'm putting my t-shirt on";
        }

        return response;
    }
    public static void main(String args[]) {
        String booleanOutput = bool();
        System.out.println(booleanOutput);

    }
}
