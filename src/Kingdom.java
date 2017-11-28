import java.util.ArrayList;
import java.util.List;

public class Kingdom {

    //Attributes
    private List<Card> cards;

    // Constructor
    public Kingdom() {
        this.cards = new ArrayList<Card>();
    }

    // Getter and setter
    public List<Card> Cards() {
        return cards;
    }


    //Methods
    public int CountPoints(Card[] cardsInKingdom) {
        return 0;
    }

    public void Add(Card cardToAdd) {
        cards.add(cardToAdd);
    }
}