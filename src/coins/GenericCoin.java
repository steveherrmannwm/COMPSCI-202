package coins;

/**
 * 
 * @author Steven Herrmann
 * @date 1/14/15
 * Creates a coin to flip
 */

public class GenericCoin {

	public enum CoinSide{HEADS,TAILS};
	
	//Instance Variables
	private CoinSide currentSide;
	
	//Constructors
	public GenericCoin()
	{
		currentSide = CoinSide.HEADS;
	}
	
	//Mutators
	public void setToHeads()
	{
		currentSide = CoinSide.HEADS;
	}
	
	public void setToTails()
	{
		currentSide = CoinSide.TAILS;
	}
	
	public boolean isHeads()
	{
		if(currentSide == CoinSide.HEADS)
			return true;
		return false;
	}
	
	public boolean isTails()
	{
		if(currentSide == CoinSide.TAILS)
			return true;
		return false;
	}
	
	//Methods
	//Provides a fifty fifty chance to flip the coin's side
	public void toss()
	{
		if(Math.random() < 0.5)
		{
			this.setToHeads();
		}
		else
		{
			this.setToTails();
		}
	}
	
	//Converts the object to a string based on the current coin side
	public String toString()
	{
		if(this.isHeads())
		{
			return "Heads";
		}
		else
		{
			return "Tails";
		}
	}
}
