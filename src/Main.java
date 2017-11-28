
public class Main {
	public static void main(String[] args)
	{
		Deck deck_test = new Deck(2);
		System.out.println("Hello World");
		System.out.println(deck_test.Cards().size());
		System.out.println(deck_test.Cards().get(0).Race());
		deck_test.Shuffle();
		System.out.println(deck_test.Cards().get(0).Race());
		deck_test.Shuffle();
		System.out.println(deck_test.Cards().get(0).Race());
	}
}
