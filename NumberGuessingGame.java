
package numberguessinggame;
import java.util.*;
public class NumberGuessingGame {

	public static void main(String[] args) {
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		//Generating the random number
		int randomno=r.nextInt(100)+1;
		System.out.println(randomno);
		while(true) {
			//Getting the input number from the player
		System.out.println("Enter your guess from 1 to 100:");
		int playerguess=sc.nextInt();
		//checks the player guess with the random number
		if(playerguess==randomno) {
			System.out.println("Congrats!!! YOU WIN");
		    break;
		}
		else if(randomno>playerguess) {
			System.out.println("Oh no! The number you guessed is lesser.Guess Again");
		}
		else {
			System.out.println("On no! The number you guessed is higher.Guess Again");
		}
	}
	}
}
