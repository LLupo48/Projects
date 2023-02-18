//Lucas Lupo CS 1050 Change Project
import java.util.Scanner; 

public class MakeChange2{

   public static String AskUser(String s){
      Scanner scan = new Scanner(System.in);
      System.out.println(s);
      String n = scan.nextLine();
      return n; 
     }   
   
   public static void main(String[] args){
      
      
      String x = AskUser("Enter how much you have in your pocket");
      double amount = Double.parseDouble(x);
      
      String y = AskUser("Enter the cost of the candy bar");
      double candyPrice = Double.parseDouble(y);
      
      double change = (amount - candyPrice); //calculate change left by subtracting value amount - value of candyPrice
      double diff = change * 100; //initalize and declare variable diff to take the value calculated for change and multiply by 100 to calculate change in coins.
      
      //Quarter Calculation
      int numberOfQuarters = (int) diff / 25; 
      int rem = (int) diff % 25;  
      
      //Dime Calculation
      int numberOfDimes = rem / 10; 
      int rem2 = (int) diff % 10;  
      
      //Nickel Calculation
      int numberOfNickels = rem2 / 5; 
      int rem3 = (int) diff % 5; 
      
      //Penny Calculation
      int numberOfPennies = rem3; 
      
      
      //Print statement telling user what their change is in coins.
      System.out.println("Your change is " + numberOfQuarters + " quarter(s) " + numberOfDimes + " dime(s) "+ numberOfNickels + " nickel(s) and " + numberOfPennies + " penny(s)!");
      
   }
 }