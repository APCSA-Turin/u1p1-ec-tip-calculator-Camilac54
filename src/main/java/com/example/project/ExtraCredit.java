package com.example.project;
import java.util.ArrayList;
import java.util.Scanner;


public class ExtraCredit {


    public static String calculateTip(int people, int percent, double cost, String items) {
        StringBuilder result = new StringBuilder();

        //Calculating the tip, total cost, cost per person, tip per person, and the total cost per person
        double tip = cost * (percent / 100.0); //Calculates tip by multiplying cost by the decimal version of percent
        double totalCost = cost + tip; // Calculates total cost by adding cost and tip
        double costPerPerson = (cost / people); // Calculates cost per person by dividing cost by the number of people there are
        double tipPerPerson = tip / people; // Calculates tip per person by dividing the amount of tip by the number of people there are
        double totalPersonCost = (tipPerPerson + costPerPerson); // Calculates the total cost per person by adding the tip per person and the cost per person

        //Printing the results of the calculations and rounding them by using String.format, which cuts off the decimals at the second place value, hence the "%.2f"
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + String.format("%.2f", cost) + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%" + "\n");
        result.append("Total tip: $" + String.format("%.2f", tip) + "\n");
        result.append("Total Bill with tip: $" + String.format("%.2f", totalCost) + "\n");
        result.append("Per person cost before tip: $" + String.format("%.2f", costPerPerson) + "\n");
        result.append("Tip per person: $" + String.format("%.2f", tipPerPerson) + "\n");
        result.append("Total cost per person: $" + String.format("%.2f", totalPersonCost) + "\n");
        result.append("-------------------------------\n");

        // I learned how to round with String.format from here: https://www.w3schools.com/java/ref_string_format.asp

        //the two lines  should go below result.append("-------------------------------\n"); 
        result.append("Items ordered:\n");
        result.append(items);

        return result.toString();
    }
                                   
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int people = 2;
        int percent = 5;
        double cost = 29.56;
        ArrayList<String> itemsList = new ArrayList <>();
        String menuStop = "";
        String items;

        //While loop in order to add the menu items onto the list 
        while (menuStop != "-1"){ // I used ! to signify that while it is NOT true 
            System.out.println("Enter an item name or type '-1' to finish:");
            String itemsPlace = myScanner.nextLine();

            if (itemsPlace.equals("-1")){ // I used an if () statement to identify if the user input is '-1' in order to stop the while loop
                menuStop = "-1"; 
            } else {
                itemsList.add(itemsPlace); // If the input is idenfitied to not be '-1', the input gets added to the list
            } 
        }

        items = String.join("\n", itemsList);

        System.out.println(calculateTip(people, percent, cost, items));
        myScanner.close();

    }
}
// I learned how to compare Strings from https://stackoverflow.com/questions/513832/how-do-i-compare-strings-in-java
// I learned how to join strings from https://www.geeksforgeeks.org/java-string-join-examples/
// I learned how to 
// I learned how to add lists from https://www.geeksforgeeks.org/list-add-method-in-java-with-examples/
// AND https://www.studytonight.com/java-examples/how-to-convert-string-to-arraylist-in-java