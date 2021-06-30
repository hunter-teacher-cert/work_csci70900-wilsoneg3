//01/Nim.java
//Collaborators: Marisa Laks, Michelle Best, Eric Wilson, Ian Scheffler


/*
To simulate the game of Nim, we represent the "choices" of the AI player, one to embody the rules of Nim, and one to NIX that - we thought about doing this in a more complex manner; then we realized that time wise it would be better to do this more simply and this is where we are. 
*/

// this imports the scanner which accepts user input
import java.util.Scanner;
// this imports the random function? 
import java.util.Random;

// this establishes the public class named "NIM", which is aligned with the java filename so it will run
public class Nim {
// this establishes the method "main" and says it accepts an array of Strings
  public static void main (String[] args) {
    // these establish variables and assigns values
    int totalStones = 12;
    int playerStones = 0;
    int aiStones = 0;
   // this scanner solicits user input by prompting them to follow the directions in red
    Scanner in = new Scanner(System.in);
    System.out.println("This is the game of Nim. We start with 12 stones in a bag. Players choose 1, 2, or 3 stones each turn. The object of the game is to choose the last stone.");
    // this establishes a while loop and the condition while the variable "totalStones" is less than or equal to 0

    while(totalStones >= 0){ // we previously had != 0, which meant that negative numbers didn't stop the loop
     System.out.print("Player 1: How many stones would you like to choose? Choose 1, 2, or 3: ");

     // The nextInt(radix) method of java.util.Scanner class scans the next token of the input as a Int... what does it mean by "next token of input"? just the next time the user 
       playerStones = in.nextInt();

       //This part gives the total stones remaining after player makes a choice and then prints it
       totalStones = totalStones - playerStones;
       System.out.println("Remaining stones: " + totalStones);    
       System.out.println();
       
       //we need to add something here to break the loop if the player wins at this point
       System.out.print("Player AI: How many stones would you like to choose? ");
       // this calls the random from the io. up top
       Random random = new Random();
       aiStones = random.nextInt(2) + 1;
       System.out.println(aiStones);
       
       totalStones = totalStones - aiStones;
       System.out.println("Remaining stones: " + totalStones);
       System.out.println();
    }  
    System.out.println("Congratulations--the preceding player wins!");
   
}
}

//if total is less than 0, set it to 0


