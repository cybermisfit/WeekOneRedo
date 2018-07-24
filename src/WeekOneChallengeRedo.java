import java.util.Scanner;
import java.util.Random;

public class WeekOneChallengeRedo {
    public static void main(String[] args){

//        Requirements:
//
//        Prompt the user for input of 2 grocery item with the following criterias:
//        itemName01, itemName02 (is a text value)
//        itemPrice01, itemPrice02 (is a decimal number value)
//        itemQuantity01, itemQuantity02 (is a whole number value)
//        Calculate the total cost of each grocery item (cost=price*quantity)
//        Calculate the total amount of items in the purchase
//        Your final display should be similar to:
//
//        Item Name       Price      Quantity     Cost
//        Apple           $2.25      3            $6.75
//        Banana          $1.50      5            $7.50
//
//        Total Purchase Amount = $14.25
//
//
//
//        Hint: Use escape sequences to help format the tab spaces between your columns!
//
//                BONUS:
//
//        Generate a random number from 1-10 for each item's quantity amount
//        If you spend more than $20, print "You spent too much today..." to the console
//        Otherwise, print "Thank you for shopping at my market!"

        //VARIABLES

        String itemName01, itemName02;
        double itemPrice01, itemPrice02;
        double purchaseAmount;
        double costTotal01, costTotal02;

        int itemQuantity01, itemQuantity02;

        //INITIALIZE SCANNER
        Scanner scan = new Scanner(System.in);

        //USER INPUT

        printout("Enter item #1: ");
        itemName01 = scan.next();

        printout("Enter item #1 price: ");
        itemPrice01 = scan.nextDouble();

        printout("Enter item #1 quantity: ");
        itemQuantity01 = scan.nextInt();

        printout("Enter item #2: ");
        itemName02 = scan.next();

        printout("Enter item #2 price: ");
        itemPrice02 = scan.nextDouble();

        printout("Enter item#2 quantity: ");
        itemQuantity02 = scan.nextInt();

        //PROCESS CALCULATIONS
        purchaseAmount = (itemPrice01*itemQuantity01)+(itemPrice02*itemQuantity02);
        costTotal01 = (itemPrice01*itemQuantity01);
        costTotal02 = (itemPrice02*itemQuantity02);

        //A LITTLE FORMATTING

        String formatCost1 = String.format("%.02f", costTotal01);
        String formatCost2 = String.format("%.02f", costTotal02);
        String formatItemPrice1 = String.format("%.02f", itemPrice01);
        String formatItemPrice2 = String.format("%.02f", itemPrice02);
        String formatPurchaseTotal = String.format("%.02f", purchaseAmount);

        //DISPLAY OUTPUT

        printout("Item Name" + "\t\t" + "Item Price" + "\t\t" + "Item Quantity" + "\t\t" + "Cost");
        printout(itemName01 + "\t\t\t" + formatItemPrice1 + "\t\t\t" + itemQuantity02 + "\t\t\t\t\t" + formatCost1);
        printout(itemName02 + "\t\t\t" + formatItemPrice2 + "\t\t\t" + itemQuantity02 + "\t\t\t\t\t" + formatCost2 +"\n");

        printout("Total Purchase Amount: $" + formatPurchaseTotal);

        //BONUS - BONUS RANDOM IN "WeekOneRedoRandom"

        if (purchaseAmount > 20){
            printout("You spent too much today...");
        }
        else {
            printout("Thank you for shopping at my market!");
        }




    }

    public static void printout(String printout){
        System.out.println(printout);
    }
}
