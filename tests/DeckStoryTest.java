import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DeckStoryTest {

	private Hand hand;
	private Deck deck;
	
	@Before
	public void setUp() throws Exception {
		hand = new Hand();
		deck = new Deck();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Elf elf = new Elf();
		Dryad dryad = new Dryad();
		
		deck.Add(elf);
		deck.Add(dryad);
		List<Card> expectedDeck = new ArrayList<Card>();
		expectedDeck.add(elf);
		expectedDeck.add(dryad);
	    List<Card> expectedHand = new ArrayList<Card>();
	    
	    assertEquals(expectedDeck, deck.getCards());
	    assertEquals(expectedHand, hand.getCards());
	    
	    hand.Draw(deck);
	    
	    expectedHand.add(elf);
	    expectedDeck.remove(elf);
	    
	    assertEquals(expectedDeck, deck.getCards());
	    assertEquals(expectedHand, hand.getCards());
	    
	}

}
