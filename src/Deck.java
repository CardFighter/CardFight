import java.util.ArrayList;
import java.util.List;

public class Deck {



    //Attribut
    private List<Card> cards;

    //Getteur et Setteur
    public List<Card> Cards() {
        return cards;
    }

    //Constructeur
    public Deck(int nbr_set)
    {
        cards= new ArrayList<>();
        for(int i =0;i<nbr_set;i++)
        {
            for(int j=0;j<=5;j++)
            {
                cards.add(new Card(j));
            }
        }
    }

    //Methodes
    public int RemainingCard()
    {
        return cards.size();
    }

    public void Shuffle()
    {
        //melange
    }

    public Card Draw() //retourne la carte retirer
    {
        return cards.remove(0);
    }
}
