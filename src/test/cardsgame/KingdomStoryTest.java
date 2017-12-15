package cardsgame;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class KingdomStoryTest {

	private Kingdom kingdom;
	
	@Before
	public void setUp() throws Exception {
		kingdom = new Kingdom();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void test() {
		Dryad dryad = new Dryad();
		Elf elf = new Elf();
		List<Card> expected = new ArrayList<Card>();
		expected.add(dryad);
		expected.add(elf);
		
		kingdom.Add(dryad);
		kingdom.Add(elf);
		
		Assert.assertEquals(expected, kingdom.getCards());
	}

}
