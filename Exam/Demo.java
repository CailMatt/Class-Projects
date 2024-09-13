import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
   public static void main(String[] args) {
      //Declaring Variable
      Scanner scnr = new Scanner(System.in);
      ArrayList<HoneyOrder> honeyOrder = new ArrayList<HoneyOrder>();
      String repeat = "";
      int typeHoney = 0;
      int honeyAmt = 0;
      int totalOHoney = 0;
      int totalWHoney = 0;
      int totalCHoney = 0;
      String honeyName = "";
      int i;
      
      //Runs for the first iteration automatically, then requests user input to continue
      do{
         // Printing the menu choices
         System.out.println("\nType of Honey:");
         System.out.println("   1. Orange Blossom");
         System.out.println("   2. Wildflower");
         System.out.println("   3. Clover");
         //Begins taking user input
         System.out.print("Select the type of honey: ");
         typeHoney = scnr.nextInt();
         //Validating the input, it must be 1-3
         while (typeHoney != 1 && typeHoney != 2 && typeHoney != 3) {
            System.out.println("Input invalid, please re-enter (1, 2, or 3): ");
            typeHoney = scnr.nextInt();
         }
         
         System.out.print("Enter the number of pounds ordered: ");
         honeyAmt = scnr.nextInt();
         //Validating again, it must be a whole number
         while (honeyAmt % 1 != 0) {
            System.out.print("You must enter a whole number. Try again: ");
            honeyAmt = scnr.nextInt();
         }
         //This automatically sets the user unput to 0 if entered as a negative number
         if (honeyAmt < 0) {
            honeyAmt = 0;
         }
         
         //The counter for the total amount of each type of honey
         if (typeHoney == 1) {
            totalOHoney = honeyAmt + totalOHoney;
         }
         if (typeHoney == 2) {
            totalWHoney = honeyAmt + totalWHoney;
         }
         if (typeHoney == 3) {
            totalCHoney = honeyAmt + totalCHoney;
         }
         
         
         //Appending to the arraylist with the information input 
         honeyOrder.add(new HoneyOrder(typeHoney, honeyAmt));
         
         //Resetting the Scanner
         scnr.nextLine();
         
         //User input for the loop to continue or cease
         System.out.print("\nWould you like to enter another order of honey (Y/N)?: ");
         repeat = scnr.nextLine();
         
         System.out.println("");
         
      }while(repeat.equalsIgnoreCase("y"));

   System.out.println("\nHoney Sales Report");
   
   //Loop that continue for each object in the ArrayList "honeyOrder"
   for(i = 0; i < honeyOrder.size(); i++) {
      //Setting the bottle requirments and the total price
      honeyOrder.get(i).setTotalPrice();
      honeyOrder.get(i).setBottles();
   
      //Setting the name of the honey based on the earlier selected menu choice
      if(honeyOrder.get(i).getHoneyType() == 1) {
         honeyName = "Orange Blossom";
      }
      if(honeyOrder.get(i).getHoneyType() == 2) {
         honeyName = "Wildflower";
      }
      if(honeyOrder.get(i).getHoneyType() == 3) {
         honeyName = "Clover";
      }
      
      //Printing the info of the object, including the price and the number of bottles required
      System.out.println("\nType of honey: " + honeyName);
      System.out.println("Amount (lb): " + honeyOrder.get(i).getAmtPounds());
      System.out.println("Price: $" + String.format("%.2f", honeyOrder.get(i).getTotalPrice()));
      System.out.println("No. 6lb bottles: " + honeyOrder.get(i).getSixlbBottles());
      System.out.println("No. 3lb bottles: " + honeyOrder.get(i).getThreelbBottles());
      System.out.println("No. 1lb bottles: " + honeyOrder.get(i).getOnelbBottles());
      
   }
   
   //Simply prints the total weight of each honey type sold
   System.out.println("\n\nThe total amount of orange blossom honey sold is " + totalOHoney + " lb.");
   System.out.println("The total amount of wildflower honey sold is " + totalWHoney + " lb.");
   System.out.println("The total amount of clover honey sold is " + totalCHoney + " lb.");
   
   
   
   
   
   }
}