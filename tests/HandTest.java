import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HandTest {
	private Hand hand;
	private Hand opponentHand;
	private Deck deck;
	
	@Before
	public void setUp() throws Exception {
		hand = new Hand();
		opponentHand = new Hand();
		deck = new Deck(5);
		
		System.out.println("\n\n- * - * - * BEFORE TEST - * -* - * ");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDraw() {
		System.out.println("My hand : " + hand);
		System.out.println("My deck : " + deck);
		
		hand.Draw(deck);
		
		System.out.println("\n\n~ * ~ * ~ * AFTER TEST ~ * ~ * ~ * ");
		System.out.println("My hand : " + hand);
		System.out.println("My deck : " + deck);
	}
	
	@Test
	public void testSwap() {
		Dryad dryad = new Dryad();
		Elf elf = new Elf();
		
		hand.Add(dryad);
		opponentHand.Add(elf);
		
		System.out.println("My hand : " + hand);
		System.out.println("Opponent hand : " + opponentHand);
		
		hand.Swap(opponentHand);
		
		System.out.println("\n\n~ * ~ * ~ * AFTER TEST ~ * ~ * ~ * ");
		System.out.println("My hand : " + hand);
		System.out.println("Opponent hand : " + opponentHand);
	}
}
