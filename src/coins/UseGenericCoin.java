package coins;

/**
 * 
 * @author Steven Herrmann
 * @date 1/14/15
 * 
 */

public class UseGenericCoin {

	public static void main(String[] args) {
		//Initialize coins
		GenericCoin coin1 = new GenericCoin();
		GenericCoin coin2 = new GenericCoin();
		//Initialize counters
		int headCount1 = 0;
		int headCount2 = 0;
		
		//Loop through the required number of coin flips
		for(int i = 0; i < 100; i++)
		{
			coin1.toss();
			coin2.toss();
			if(coin1.isHeads())
				headCount1++;
			
			if(coin2.isHeads())
				headCount2++;
		}
		
		//Display percentages of each coin's flips
		System.out.println("Percentage of coin 1 that was heads: " + headCount1 + "%");
		System.out.println("Percentage of coin 2 that was heads: " + headCount2 + "%\n");
		
		//Display how they compared to each other
		if(headCount1 > headCount2)
			System.out.println("Coin 1 was heads " + (headCount1 - headCount2) + " more times.");
		else if(headCount2 > headCount1)
			System.out.println("Coin 2 was heads " + (headCount2 - headCount1) + " more times.");
		else
			System.out.println("They were heads an equal amount of times");
		

	}

}
