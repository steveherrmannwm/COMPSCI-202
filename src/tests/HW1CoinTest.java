package tests;
import static org.junit.Assert.*;
import coins.*;

import org.junit.Test;


public class HW1CoinTest {

	@Test
	/** tests constructor, accessors */
	public void testConstructors() {
		Coin penny = new Coin();
		assertTrue(penny.getValue() >= 0);
		assertNotNull(penny.getName());
		Coin nickel = new Coin("nickel", 0.05);
		assertEquals(nickel.getValue(), 0.05,0.001);
		assertEquals(nickel.getName().toLowerCase(),"nickel");
	}

	@Test
	/** tests mutators, accessors */
	public void testMutators() {
		Coin coin = new Coin("nickel", 0.05);
		assertEquals(coin.getValue(), 0.05, 0.001);
		assertEquals(coin.getName().toLowerCase(),"nickel");
		coin.set("penny", 0.01);
		coin.setToHeads();
		assertEquals(coin.getValue(), 0.01, 0.001);
		assertEquals(coin.getName().toLowerCase(),"penny");
		assertTrue(coin.isHeads());
		assertFalse(coin.isTails());	  	
		coin.set("dime", 0.1);
		coin.setToTails();
		Coin quarter = new Coin();
		quarter.set("quarter", 0.25);
		quarter.setToHeads();
		assertEquals(coin.getValue(), 0.1, 0.001);
		assertEquals(coin.getName().toLowerCase(),"dime");
		assertFalse(coin.isHeads());
		assertTrue(coin.isTails());   
		assertEquals(quarter.getValue(), 0.25, 0.001);
		assertEquals(quarter.getName().toLowerCase(),"quarter");
		assertTrue(quarter.isHeads());
		assertFalse(quarter.isTails());   
	}

    @Test
	/** test toString */
	public void testToString() {
		Coin coin = new Coin("nickel", 0.05);
		String string = coin.toString().toLowerCase();
		assertTrue(string.indexOf("nickel") != -1);
		assertTrue(string.indexOf("5") != -1);
		assertTrue(string.indexOf("heads") != -1);
		coin.setToTails();
		string = coin.toString().toLowerCase();
		assertTrue(string.indexOf("tails") != -1);
	}

    @Test
	/** test equals */
	/** If you fail this text, be sure to review the steps on page 77-80 of your book. */
	public void testEquals() {
		GenericCoin coin1 = new GenericCoin();
		GenericCoin coin2 = new Coin("penny", 0.01);
		Coin coin3 = new Coin("penny", 0.01);
		Coin coin4 = new Coin("nickel", 0.05);
		assertFalse(coin3.equals(null));  
		assertFalse(coin3.equals(coin1));
		assertFalse(coin3.equals(coin4));  
		assertTrue(coin3.equals(coin2));
		assertTrue(coin3.equals(coin3));
		assertTrue(coin2.equals(coin3));
		assertFalse(coin4.equals(coin3));
		assertFalse(coin3.equals("hello"));
		coin2.setToTails();
		assertFalse(coin3.equals(coin2));
		assertFalse(coin2.equals(coin3));
		assertFalse(coin1.equals(coin2));
	}


}
