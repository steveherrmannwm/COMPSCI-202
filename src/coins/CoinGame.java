package coins;
import java.util.Scanner;

/**
 * 
 * @author Steven Herrmann
 * @date 1/14/15
 */

public class CoinGame {

	public static void main(String[] args) {
		//Initialize coins and counters
		GenericCoin coin = new GenericCoin();
		int correctCounter = 0;
		int coinTosses = 0;
		
		//Begin to accept user input
		Scanner userInput = new Scanner(System.in);
		System.out.println("Guess heads or tails!");
		
		//Continue to check user input until they quit
		while(userInput.hasNextLine())
		{
			coin.toss();
			String input = userInput.nextLine();
			
			if(input.equalsIgnoreCase("Heads") || input.equalsIgnoreCase("Tails") || input.equalsIgnoreCase("Exit") || input.equalsIgnoreCase("Quit"))
			{

			if(input.equalsIgnoreCase(coin.toString()))
			{
				System.out.println("Correct!");
				correctCounter++;
			}
			else if(input.equalsIgnoreCase("quit") || input.equalsIgnoreCase("exit"))
			{
				System.out.println("Thanks for playing! You got " + correctCounter + " out of " + coinTosses + " correct!");
				userInput.close();
				break;
			}
			else
			{
				System.out.println("Incorrect");
			}
				coinTosses++;
				System.out.println("Keep Playing! Enter Quit or Exit to leave.");
			}
			else
			{
				System.out.println("Please give valid input");
				continue;
			}
		}
	}
}
