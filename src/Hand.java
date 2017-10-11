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
}
