import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

    private static Random rand = new Random();

    //Attribut
    private List<Card> cards;

    //Getteur et Setteur
    public List<Card> Cards() {
        return cards;
    }

    //Constructeur
    public Deck(int nbr_set)
    {
        super();
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
        List<Card> cards_shuffle = new ArrayList<Card>();
        while(cards.size()!=0)
        {
            cards_shuffle.add(cards.remove(rand.nextInt(cards.size())));
        }
        cards=cards_shuffle;
    }

    public Card Draw() //retourne la carte retirer
    {
        if(cards.size()>=1){
            return cards.remove(0);
        }
        return null;
    }
}
