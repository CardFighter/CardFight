import static org.junit.Assert.*;

import java.io.Console;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CardTest {
	private Kingdom kingdom;
	private Kingdom opponentKingdom;
	private Hand hand;
	private Hand opponentHand;
	private Deck deck;
	
	@Before
	public void setUp() throws Exception {
		kingdom = new Kingdom();
		opponentKingdom = new Kingdom();
		hand = new Hand();
		opponentHand = new Hand();
		deck = new Deck();
		
		System.out.println("\n\n- * - * - * BEFORE TEST - * -* - * ");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDryadPower() {
		
		Dryad dryad = new Dryad();
		Elf elf = new Elf();
		
		hand.Add(dryad);
		opponentKingdom.Add(elf);
		System.out.println("My hand :\n" + hand);
		System.out.println("My kingdom :\n" + kingdom);
		System.out.println("Opponent kingdom :\n" + opponentKingdom);
		
		hand.Use(hand, opponentHand, kingdom, opponentKingdom, deck, dryad);
		
		System.out.println("\n\n~ * ~ * ~ * AFTER TEST ~ * ~ * ~ * ");
		System.out.println("My hand :\n" + hand);
		System.out.println("My kingdom :\n" + kingdom);
		System.out.println("Opponent kingdom :\n" + opponentKingdom);
	}
	
	@Test
	public void testElfPower() {
		Elf elf = new Elf();
		Gnome gnome = new Gnome();
		
		hand.Add(elf);
		kingdom.Add(gnome);
		System.out.println("My hand :\n" + hand);
		System.out.println("Deck :\n" + deck);
		System.out.println("My kingdom :\n" + kingdom);
		
		hand.Use(hand, opponentHand, kingdom, opponentKingdom, deck, elf);
		
		System.out.println("\n\n~ * ~ * ~ * AFTER TEST ~ * ~ * ~ * ");
		System.out.println("My hand :\n" + hand);
		System.out.println("Deck :\n" + deck);
		System.out.println("My kingdom :\n" + kingdom);
	}
	
	@Test
	public void testGnomePower() {
		Gnome gnome = new Gnome();
		deck = new Deck(2);
		
		hand.Add(gnome);
		
		System.out.println("My hand :\n" + hand);
		System.out.println("Deck :\n" + deck);
		System.out.println("My kingdom :\n" + kingdom);
		
		hand.Use(hand, opponentHand, kingdom, opponentKingdom, deck, gnome);
		
		System.out.println("\n\n~ * ~ * ~ * AFTER TEST ~ * ~ * ~ * ");
		System.out.println("My hand :\n" + hand);
		System.out.println("Deck :\n" + deck);
		System.out.println("My kingdom :\n" + kingdom);
		
	}
	
	@Test
	public void testGoblinPower() {
		Goblin goblin = new Goblin();
		Dryad dryad = new Dryad();
		Elf elf = new Elf();
		
		hand.Add(goblin);
		hand.Add(dryad);
		opponentHand.Add(elf);
		
		System.out.println("My hand :\n" + hand);
		System.out.println("Opponent hand :\n" + opponentHand);
		System.out.println("My kingdom :\n" + kingdom);
		
		hand.Use(hand, opponentHand, kingdom, opponentKingdom, deck, goblin);
		
		System.out.println("\n\n~ * ~ * ~ * AFTER TEST ~ * ~ * ~ * ");
		System.out.println("My hand :\n" + hand);
		System.out.println("Opponent hand :\n" + opponentHand);
		System.out.println("My kingdom :\n" + kingdom);
	}
	
	@Test
	public void testKorriganPower() {
		Dryad dryad1 = new Dryad();
		Dryad dryad2 = new Dryad();
		Korrigan korrigan = new Korrigan();
		
		opponentHand.Add(dryad1);
		opponentHand.Add(dryad2);
		hand.Add(korrigan);
		
		System.out.println("My hand :\n" + hand);
		System.out.println("Opponent hand :\n" + opponentHand);
		System.out.println("My kingdom :\n" + kingdom);
		
		hand.Use(hand, opponentHand, kingdom, opponentKingdom, deck, korrigan);
		System.out.println("\n\n~ * ~ * ~ * AFTER TEST ~ * ~ * ~ * ");
		System.out.println("My hand :\n" + hand);
		System.out.println("Opponent hand :\n" + opponentHand);
		System.out.println("My kingdom :\n" + kingdom);
	}
	
	@Test
	public void testTrollPower() {
		Troll troll = new Troll();
		Dryad dryad = new Dryad();
		Elf elf = new Elf();
		
		kingdom.Add(dryad);
		opponentKingdom.Add(elf);
		hand.Add(troll);
		
		System.out.println("My hand :\n" + hand);
		System.out.println("My kingdom :\n" + kingdom);
		System.out.println("Opponent kingdom :\n" + opponentKingdom);
		
		hand.Use(hand, opponentHand, kingdom, opponentKingdom, deck, troll);
		System.out.println("\n\n~ * ~ * ~ * AFTER TEST ~ * ~ * ~ * ");
		System.out.println("My hand :\n" + hand);
		System.out.println("My kingdom :\n" + kingdom);
		System.out.println("Opponent kingdom :\n" + opponentKingdom);
		
		
	}
}
