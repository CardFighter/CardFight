import java.util.List;
import java.util.Random;

public class Deck {
	/**
     * Attributes
     */
    private static Random rand = new Random();
    private List<Card> cards;
    
    /**
     * Constructor 
     * @param nbr_set
     */
    public Deck(int nbr_set)
    {
        super();
        int r;
        for(int i = 0; i < nbr_set; i++)
        {
        	r = rand.nextInt();
        	//c = 
        	//cards.add(c);
        }
    }
    
    /**
     * Getters and setters
     */

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	/**
     * Methods
     */
	
	/**
     * Method Draw draws a card from the deck
     * @return drawn card
     */
	public Card Draw() {
		if(cards.size() >= 1)
        {
            return cards.remove(0);
        }
        return null;
	}
}
