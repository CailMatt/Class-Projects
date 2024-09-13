import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
   public static void main(String[] args) {
   
      Scanner scnr = new Scanner(System.in);
      ArrayList<Order> orderList = new ArrayList<Order>();
      
      
      int numOfDrawers = 0;
      String typeOfWood = "";
      int numOfDesks = 0;
      String repeat = "";
      double mostExpensive = 0;
      int j = 0;
      int mostExpensiveCount = 0;

      do{
      
         System.out.println("Type of Wood:");
         System.out.println("  1. Cherry");
         System.out.println("  2. Oak");
         System.out.println("  3. Pine");
         
         
         System.out.print("\nSelect the type of wood: ");
         int intTemp = scnr.nextInt();
         while (intTemp > 4 || intTemp < 1) {
            scnr.nextLine();
            System.out.print("\nThat is an invalid menu choice. You must enter a number from 1 – 3. Try again: ");
            scnr.nextInt();
         }
         if (intTemp == 1) {
            typeOfWood = "Cherry";
         } else if (intTemp == 2) {
            typeOfWood = "Oak";
         } else if (intTemp == 3) {
            typeOfWood = "Pine";
         }
         scnr.nextLine();
         
         System.out.print("\nEnter the number of drawers: ");
         intTemp = scnr.nextInt();
         while (intTemp > 6 || intTemp < 0) {
            scnr.nextLine();
            if (intTemp > 6) {
               System.out.print("\nThat is too many drawers. The number of drawers must be no more than 6: Try again:");
               intTemp = scnr.nextInt();
            }
            if (intTemp < 0) {
               System.out.print("\nThat is too few drawers. The number of drawers must be at least 0. Try again:");
               intTemp = scnr.nextInt();
            }
         }
         numOfDrawers = intTemp;
         scnr.nextLine();
         
         System.out.print("Enter the number of desks you wish to purchase: ");
         intTemp = scnr.nextInt();
         while (intTemp < 1) {
            scnr.nextLine();
            System.out.print("You must order at least one desk. Try again: ");
            intTemp = scnr.nextInt();
         }
         numOfDesks = intTemp;
         
         
         orderList.add(new Order(typeOfWood, numOfDrawers, numOfDesks));
         orderList.get(j).setDiscountedPrice();
         orderList.get(j).setOrderPrice();
         
         System.out.print("Would you like to enter another order for desks (Y/N)?: ");
         repeat = scnr.nextLine();
         
      
      
         j++;
      }while(repeat.equalsIgnoreCase("y"));

      System.out.println("\nDesk Orders Report");
      
      for(int i = 0; i < orderList.size(); i++) {
         System.out.print("\n" + orderList.get(i));
         if (orderList.get(i).getDiscountedPrice() > mostExpensive) {
            mostExpensiveCount = i;
            mostExpensive = orderList.get(i).getDiscountedPrice();
         }
      }
      
      System.out.println("Out of the " + orderList.get(j).getOrderNum() + "orders that were placed, the most expensive desk sold cost $" + orderList.get(mostExpensiveCount).getDiscountedPrice());
      
      
      
   }
}