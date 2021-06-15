package week2.lab;
import java.util.Scanner;
import java.util.Random;
public class Rock
{ 
public static void main(String[] args) 
{ 
 String personPlay; //User's play -- "R", "P", or "S"
 //String computerPlay; //Computer's play -- "R", "P", or "S"
int computerInt; //Randomly generated number used to determine //computer's play
String result = null ;
 Scanner scan = new Scanner(System.in); 
 //Random generator = new Random();
 System.out.println("Enter a key to start the Game  (R , P or S)"); 
 personPlay = scan.nextLine();
 System.out.println("personPlay Entered Values is "+personPlay);
//Get player's play -- note that this is stored as a string
//Make player's play uppercase for ease of comparison
//Generate computer's play (0,1,2)
//Translate computer's randomly generated play to string
 System.out.println("Enter a Number from this 0, 1 or 2 to Proceed"); 
 computerInt= scan.nextInt();
  switch (computerInt) 
 { 
 case 0:
		 result= "R";
		 System.out.println("computerPlay Entered Values is "+result);
		break;
 case 1:
		 result= "P";
		 System.out.println("computerPlay Entered Values is "+result);
		break;
case 2:
	 	result= "S";
	 	 System.out.println("computerPlay Entered Values is "+result);
	 	break;
default:
		System.out.println(" Enter Correct  Number");
		break;
		
 } 
 String computerPlay= result;
// System.out.println("computerPlay Entered Values is "+computerPlay);

//Print computer's play
//See who won. Use nested ifs instead of &&.
 
 if (personPlay.equals(computerPlay)) 
 {
	 System.out.println("It's a tie!"); 
 }
 else if (personPlay.equals("S")) 
	  if (computerPlay.equals("R")) 
		 System.out.println("scissors broken by Rock. You Lose!!");
	 else {
		 if (personPlay.equals("S")) 
		  if (computerPlay.equals("P")) 
		  System.out.println("scissors will cut paper. You win!!");
	      }
 else if (personPlay.equals("R")) 
	 if (computerPlay.equals("S")) 
		  System.out.println("Rock crushes scissors. You win!!"); 
	 else {
		 if (personPlay.equals("R")) 
	 	  if (computerPlay.equals("P")) 
          System.out.println("Rock Covered by Paper. You Lose!!"); 
	      }
 else if (personPlay.equals("P")) 
	   if (computerPlay.equals("R")) 
	      System.out.println("Paper will cover Rock. You win!!");
	 else {
		 if (personPlay.equals("P")) 
		  if (computerPlay.equals("S")) 
          System.out.println("Paper is cutted by Scissor . You Lose!!");
	 }
else
	
System.out.println("Enter Correct Data");
	 } 
}

