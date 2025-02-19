package com.codedifferently.labs.partB.ex02;

public class EqualityOperator {
    public static String numEquality(){
        String response = "";
        String num1 = "4";
        String num2 = "5";

        /* Your code goes here*/
        if(num1.equals(num2)){
            response+=false;
        }
        if (num1.equals(num1)){
            response+=true;
        }


        return response;
    }
    public static void main(String args[]) {
        String equalityOutput = numEquality();
        System.out.print(equalityOutput);
    }
}
