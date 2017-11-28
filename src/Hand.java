import java.util.ArrayList;
import java.util.List;

public class Hand {

    //Attributs
    private List<Card> cards;

    //Getteurs et Setteurs
    public List<Card> Cards() {
        return cards;
    }

    //Constructeur
    public Hand()
    {
        cards = new ArrayList<Card>();
    }

    //Methodes
    public Card Remove(Card card_play) // renvoie la carte joué ou volé et l'enleve de la main
    {
        if(cards.contains(card_play))
        {
            return cards.remove(cards.indexOf(card_play));
        }
        return null;
    }

    public Card Remove_random() // return a random card
    {
        if(cards.size() >=1) {
            int rand = (int) (Math.random() * cards.size());
            return cards.remove(rand);
        }
        return null;
    }

    public void Draw(Deck deck)
    {
        cards.add(deck.Draw());
    }
}
