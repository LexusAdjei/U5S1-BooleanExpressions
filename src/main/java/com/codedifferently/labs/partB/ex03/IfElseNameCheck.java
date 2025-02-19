package com.codedifferently.labs.partB.ex03;
import java.util.Scanner;

public class IfElseNameCheck {
    public static String nameCheck(String name){
        String response = "";
        /* Put your code in between these comments : Top */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name, please");
        name = scan.nextLine();

        if(name.equals("Elvis"))
            response+="BRO! You are the king of rock and roll!";
        else if (name != "Elvis") {
            response+="You're not Elvis!? Who the hell are you?";
        }
        /* Put your code in between these comments : Bottom */

        return response;

    }

    public static void main(String args[]) {
        String name = "";
        /* Put your code in between these comments : Top */


        /* Put your code in between these comments : Bottom */


        String responseToName  = nameCheck(name);
        System.out.println(responseToName);
    }

}
