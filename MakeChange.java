//Lucas Lupo CS 1050 Project
public class MakeChange{

   public static void main(String[] args){
      double amount = 1.00; 
      double candyPrice = 0.33; 
      double change = (amount - candyPrice); 
      double diff = change * 100; 
      
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