// This program will act as a menu system consisted of many methods for my company, Starr (Jade Park - 7/12/2021)

import java.util.Scanner;

public class Midterm { 
   
   // Declaring variables who's values will equal the user's selection
   public static int selection1 = 0;
   public static int selection2 = 0;
   public static int selection3 = 0;
   
   // The flag variable that'll determine whether the do-while loop runs again or not
   public static boolean flag = true;
      
      // start of main method
      public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      do { 
         // displaying options to the user
         System.out.println("\nWelcome to Starr! Here are your options:");
         System.out.println("1 - Inventory Actions");
         System.out.println("2 - Sales Actions");
         System.out.println("3 - Exit");
         System.out.print("Please enter the number that corresponds to where you want to go today: ");
         selection1 = input.nextInt();
         
         // if-else statement that determines whether to loop or exit to a different method
         if (selection1 == 1) {
            flag = false;
            inventoryActions();
         } else if (selection1 == 2) {
            flag = false;
            salesActions();
         } else if (selection1 == 3) {
            flag = false;
            exit();
         } else {
            System.out.println("\nINVALID INPUT. Please try again!");
            flag = true;
         }
      
      } while (flag == true);
   } // end of main method
   
   public static void inventoryActions() {
      Scanner input = new Scanner(System.in);
      
      // Printing out options in Inventory Actions
      System.out.println("\nYou are now in Inventory Actions. Here are your options:");
      System.out.println("1 - Adding a Product");
      System.out.println("2 - Viewing Inventory");
      System.out.println("3 - Go Back to the Main Menu");
      System.out.print("Please enter the number that corresponds to where you want to go today: ");
      selection2 = input.nextInt();
      
      // redirecting the user to the sub-method of their choice
      if (selection2 == 1) {
         addAProduct();
      } else if (selection2 == 2) {
         viewingInventory();
      } else if (selection2 == 3) {
         flag = true;
      } else {
         System.out.println("\nINVALID INPUT. Please try again!");
         inventoryActions();
      }


   }
   
   public static void salesActions() {
      Scanner input = new Scanner(System.in);
         
      // Printing out options in Sales Actions
      System.out.println("\nYou are now in Sales Actions. Here are your options:");
      System.out.println("1 - Viewing Products");
      System.out.println("2 - Puchasing Products");
      System.out.println("3 - Go Back to the Main Menu");
      System.out.print("Please enter the number that corresponds to where you want to go today: ");
      selection3 = input.nextInt();
      
      // redirecting the user to the sub-method of their choice
      if (selection3 == 1) {
         viewingProducts();
      } else if (selection3 == 2) {
         purchasingProducts();
      } else if (selection3 == 3) {
         flag = true;
      } else {
         System.out.println("\nINVALID INPUT. Please try again!");
         salesActions();
      }
   }
   
   // exit method that lets the user know they sucessfully quit the program
   public static void exit() {
      System.out.println("\nYou have successfully exited the program."); 
   }

   // below are sub-methods printing out placeholder text
   public static void addAProduct() {
      Scanner input = new Scanner(System.in);
      System.out.println("\nCongrats! You made it to adding a product!");
   }
   
   public static void viewingInventory() {
      Scanner input = new Scanner(System.in);
      System.out.println("\nCongrats! You made it to the viewing inventory!");
   }
   
   public static void viewingProducts() {
      Scanner input = new Scanner(System.in);
      System.out.println("\nCongrats! You made it to viewing products!");
   }
   
   public static void purchasingProducts() {
      Scanner input = new Scanner(System.in);
      System.out.println("\nCongrats! You made it to purchasing products!");
   }
   
} // end of class

