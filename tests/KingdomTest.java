import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class KingdomTest {
	private Kingdom kingdom;
	private Kingdom opponentKingdom;
	
	@Before
	public void setUp() throws Exception {
		kingdom = new Kingdom();
		opponentKingdom = new Kingdom();
		
		System.out.println("\n\n- * - * - * BEFORE TEST - * -* - * ");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		Dryad dryad = new Dryad();
		
		System.out.println("My kingdom : " + kingdom + "\nadding a dryad to the kingdom...");
		
		kingdom.Add(dryad);
		
		System.out.println("\n\n~ * ~ * ~ * AFTER TEST ~ * ~ * ~ * ");
		System.out.println("My kingdom : " + kingdom);
	}
	
	@Test
	public void testRemove() {
		Dryad dryad = new Dryad();
		kingdom.Add(dryad);
		
		System.out.println("My kingdom : " + kingdom + "\nremoving the dryad from the kingdom...");
		
		kingdom.Remove(dryad);
		
		System.out.println("\n\n~ * ~ * ~ * AFTER TEST ~ * ~ * ~ * ");
		System.out.println("My kingdom : " + kingdom);
	}
	
	@Test
	public void testSwap() {
		Dryad dryad = new Dryad();
		Elf elf = new Elf();
		
		kingdom.Add(dryad);
		opponentKingdom.Add(elf);
		
		System.out.println("My kingdom : " + kingdom);
		System.out.println("Opponent kingdom : " + opponentKingdom);
		
		kingdom.Swap(opponentKingdom);
		
		System.out.println("\n\n~ * ~ * ~ * AFTER TEST ~ * ~ * ~ * ");	
		System.out.println("My kingdom : " + kingdom);
		System.out.println("Opponent kingdom : " + opponentKingdom);
		}
	
	@Test
	public void testCountPoints() {
		Dryad dryad = new Dryad();
		Elf elf = new Elf();
		Gnome gnome = new Gnome();
		Goblin goblin = new Goblin();
		Korrigan korrigan = new Korrigan();
		Troll troll = new Troll();
		Dryad dryad2 = new Dryad();
		
		kingdom.Add(dryad);
		kingdom.Add(elf);
		kingdom.Add(gnome);
		kingdom.Add(goblin);
		kingdom.Add(korrigan);
		kingdom.Add(troll);
		kingdom.Add(dryad2);
		
		System.out.print("Points of kingdom : ");
		System.out.println(kingdom.CountPoints());
	}
}
