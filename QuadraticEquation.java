//Lucas Lupo CS 1050 Project
import java.util.Scanner;
import java.lang.Math;

public class QuadraticEquation{

   public static String AskUser(String s){
      Scanner coeff = new Scanner(System.in);
      System.out.println(s);
      String n = coeff.nextLine();
      return n;
   
   }
   public static void main(String[] args){
      
      String x = AskUser("Enter your A value");
      double a = Double.parseDouble(x);
     
      if(a == 0){
         System.out.println("A is 0");
         System.exit(0);
         }
      
      String y = AskUser("Enter your B value");
      double b = Double.parseDouble(y);
      
      String z = AskUser("Enter your C value");
      double c = Double.parseDouble(z);
      
      double disc = ((Math.pow(b,2))-4*a*c);
      double negB = b * -1;
      double x1 = (negB + Math.sqrt(disc))/(2*a);
      double x2 = (negB - Math.sqrt(disc))/(2*a);
      
      if(disc < 0){
         System.out.println("Solution is a complex number");
         System.exit(0);
         }
         
      if(disc == 0){
         System.out.println("Calculating single root x1");
         System.out.println("x1 = " + x1);
         }
         
      if(disc > 0){
         System.out.println("Your roots are:");
         System.out.println("x1 = " + x1);
         System.out.println("x2 = " + x2);
         }  
      
  }
}
      
   
      
      
     