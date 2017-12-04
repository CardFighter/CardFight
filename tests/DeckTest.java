import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DeckTest {
	private Deck deck;

	@Before
	public void setUp() throws Exception {
		deck = new Deck(5);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		System.out.println(deck);
	}

}
