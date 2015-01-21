package coins;

public class Coin extends GenericCoin {
	//Instance Data
	private String name;
	private double value;

	
	//Constructors
	public Coin()
	{
		super();
		this.name = "Penny";
		this.value = 0.01;
	}
	
	public Coin(String name, double value)
	{
		super();
		this.name = name;
		this.value = value;
	}
	
	//Mutators
	public void set(String name, double value)
	{
		this.name = name;
		this.value = value;
	}
	
	//Accessors
	public String getName()
	{
		return name;
	}
	
	public double getValue()
	{
		return value;
	}
	
	//Methods
	public String toString()
	{
		//Determine the coin's side
		String side = super.toString();
		return "This " + name + " has a value of " + value + " and is currently " + side + " up.";
	}
	
	//Compares 2 coins based on value, name and side
	public boolean equals(Object comparison)
	{
		if(comparison instanceof Coin)
		{
			Coin compCopy = (Coin) comparison;
			if(this.name.equals(compCopy.getName()) && 
					(this.value == compCopy.getValue()) && 
					(this.isHeads() == compCopy.isHeads()))
			{
				return true;
			}
		}
		return false;
	}

	//Main method to test each method
	public static void main(String args[]){
		Coin testCoin = new Coin();
		
		
		System.out.println(testCoin.getName());
		System.out.println(testCoin.getValue());
		System.out.println(testCoin.isTails());
		System.out.println(testCoin.toString());
		System.out.println(testCoin.equals(testCoin));
		
		Coin testCoin2 = new Coin();
		testCoin2.set("Quarter", 0.25);
		testCoin2.setToTails();
		
		System.out.println(testCoin2.getName());
		System.out.println(testCoin2.getValue());
		System.out.println(testCoin2.isTails());
		System.out.println(testCoin2.toString());
		System.out.println(testCoin2.equals(testCoin));
		
	}
}

