import java.util.ArrayList;
import java.util.List;

public class Hand {

	/**
     * Attributes
     */
    private List<Card> cards;
    
    /**
     * Constructor with no initial data
     */
    public Hand()
    {
        cards = new ArrayList<Card>();
    }

    /**
     * Getters and setters
     */
    public List<Card> getCards() {
        return cards;
    }
    public void setCards(List<Card> newCards) {
        cards=newCards;
    }

    /**
     * Methods
     */
    
    /**
     * Method Remove removes a card
     * @param cardToRemove
     * @return the card that has been removed
     */
    public Card Remove(Card cardToRemove) 
    {
        if(cards.contains(cardToRemove))
        {
            return cards.remove(cards.indexOf(cardToRemove));
        }
        return null;
    }

    public Card RandomRemove() // return a random card
    {
        if(cards.size() >=1) {
            int rand = (int) (Math.random() * cards.size());
            return cards.remove(rand);
        }
        return null;
    }

    /**
     * Method Swap two list_cards of hand
     */
    public void Swap(Hand hand)
    {
        List<Card> tmp = cards;
        cards = hand.getCards();
        hand.setCards(tmp);
    }

    public void Draw(Deck deck)
    {
        cards.add(deck.Draw());
    } 
}
