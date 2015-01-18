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
	public void setName(String name, double value)
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
		return "This " + name + " has a value of " + value + " and is currently " + side + "up.";
	}
	
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

}
