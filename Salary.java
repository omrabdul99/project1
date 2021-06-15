package week2.lab;

import java.util.Scanner;
import java.text.NumberFormat; 
public class Salary 
{ 

public static void main (String[] args) 
{ 
double currentSalary; 
double raise = 0; 
double newSalary; 

//String rating;
 Scanner sc = new Scanner(System.in); 
 
 		
 		System.out.println("Enter the current salary: ");
 		currentSalary = sc.nextDouble(); 
 		System.out.println("Enter the performance rating (Excellent, Good, or Poor): "); 
 		String rating = sc.next(); 
 		//rating = sc.nextInt(); 
 		System.out.println("entered rating "+rating);
 		
if(rating.equalsIgnoreCase("Excellent"))
 {
raise=0.06*currentSalary;
	}
 else if(rating.equalsIgnoreCase("Good"))
 {
	 raise=0.04*currentSalary;
 }
 else
 {raise=0.015*currentSalary;
 }
 
newSalary = currentSalary + raise; 
System.out.println ("Enter the raise salary: "+raise);

 NumberFormat money = NumberFormat.getCurrencyInstance(); 
 System.out.println(); 
 System.out.println("Current Salary: " + money.format(currentSalary)); 
 System.out.println("Amount of your raise: " + money.format(raise)); 
 System.out.println("Your new salary: " + money.format(newSalary)); 
 System.out.println(); 
}


}