public class Gnome extends Card {

    public Gnome()
    {
    }

    @Override
    public void Power(Hand hand,Hand opponent_hand,Kingdom kingdom,Kingdom opponent_kingdom,Deck deck) {

        //draw 2 cards
        hand.Draw(deck);
        hand.Draw(deck);
    }
}
