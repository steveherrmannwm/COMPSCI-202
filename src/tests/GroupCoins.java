package tests;

import java.text.DecimalFormat;
import java.util.ArrayList;

import coins.Coin;

public class GroupCoins {

	public static void main(String[] args) {
		ArrayList<Coin> coinList = new ArrayList<Coin>();
		
		//Create pennies
		for(int i = 0; i < 10; i++)
		{
			coinList.add(new Coin("Penny",0.01));
		}
		//Create nickels
		for(int i = 0; i < 10; i++)
		{
			coinList.add(new Coin("Nickel",0.05));
		}
		//Create dimes
		for(int i = 0; i < 10; i++)
		{
			coinList.add(new Coin("Dime",0.10));
		}
		//Create quarters
		for(int i = 0; i < 10; i++)
		{
			coinList.add(new Coin("Quarter",0.25));
		}

		int headsCount = 0;
		int tailsCount = 0;
		
		double headsValues = 0;
		double tailsValues = 0;
		
		//Toss each coin
		for(Coin selected: coinList)
		{
			selected.toss();
			if(selected.isHeads())
			{
				headsCount++;
				headsValues += selected.getValue(); 
			}
			else
			{
				tailsCount++;
				tailsValues += selected.getValue();
			}
			
		}
		DecimalFormat format = new DecimalFormat("#.00");
		System.out.println("There were " + headsCount + " heads coins with a total value of $" + format.format(headsValues));
		System.out.println("There were " + tailsCount + " tails coins with a total value of $" + format.format(tailsValues));
		

	}

}
