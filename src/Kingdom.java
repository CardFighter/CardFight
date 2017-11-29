import java.util.ArrayList;
import java.util.List;

public class Kingdom {

	/**
     * Attributes
     */
    private List<Card> cards;

    /**
     * Constructor with no initial parameters
     */
    public Kingdom() {
        this.cards = new ArrayList<Card>();
    }

    /**
     * Getters and setters
     */
    public List<Card> getCards() {
        return cards;
    }
    public void setCards(List<Card> newCards) {
        cards = newCards;
    }


    /**
     * Methods 
     */
    
    /**
     * Method CountPoints counts the point of the current kingdom
     * @return points
     */
    public int CountPoints() {
        return 0;
    }

    public void Add(Card cardToAdd) {
        cards.add(cardToAdd);
    }
    
    public void Remove(Card cardToRemove) {
    	if(cards.contains(cardToRemove))
        {
            cards.remove(cards.indexOf(cardToRemove));
        }
    }


    /**
     * Method Swap two list_cards of kingdom
     */
    public void Swap(Kingdom kingdom)
    {
        List<Card> tmp = cards;
        cards = kingdom.getCards();
        kingdom.setCards(tmp);
    }
    
    public int Length() {
    	return cards.size();
    }
}