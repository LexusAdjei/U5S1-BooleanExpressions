package com.codedifferently.labs.partA.ex03;

public class ShoppingCart {
    public static String shopping(){
        String response = "";
        String custName = "Mary Smith";
        String itemDesc = "Shirt";

        // numeric fields
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
        double total;
        String message = custName + " wants to purchase " + quantity + " " + itemDesc;

        // Calculating total cost
        total = (price * quantity) * tax;

        // Declare outOfStock variable and initialize it
        boolean outOfStock = false;

        if(quantity > 1){
            response= message +  "\nTotal cost with tax is: " +  total;
        }
        // Test quantity and modify message if quantity > 1.
        else if (quantity == 1) {
            response = message + "\nTotal cost with tax is: " +  total;
        }else{
            response = "Ay, listen up, big man. We ain't got the stock so you gonna have to go bome";
            outOfStock = true;
        }


        // Test outOfStock and notify user in either case.

        return response;
    }



    public static void main(String[] args) {
        String shopOutput = shopping();
        System.out.println(shopOutput);

    }}
