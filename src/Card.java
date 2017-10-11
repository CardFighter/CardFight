public class Card {


    //Attributs
    private int race ; //0 a 5

    //Getteur et Setteur
    public int Race() {
        return race;
    }

    //Constructeurs
    public Card(int race)
    {
        super();
        this.race=race ;
    }

    //Methodes
    public void Action()
    {
        if ( race==0) // Korrigan
        {
            //draw 2 random cards in opponent hand
        }
        if ( race==1) // Gnome
        {
            //draw 2 cards
        }
        if ( race==2) // Goblin
        {
            // switch hand
        }
        if ( race==3) // Elf
        {
            // copy and use the power of a card of your kingdom
        }
        if ( race==4) // Dyrad
        {
            // stole a card in the opponent kingdom and putt it in your kingdom without power
        }
        if ( race==5) // Troll
        {
            //swap kingdom
        }
    }


}
