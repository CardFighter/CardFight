public class Korrigan extends Card  {

    public Korrigan()
    {
    }

    @Override
    public void Power(Hand hand,Hand opponent_hand,Kingdom kingdom,Kingdom opponent_kingdom,Deck deck) {
        //draw 2 random cards in opponent hand
        hand.Cards().add(opponent_hand.Remove_random());
        hand.Cards().add(opponent_hand.Remove_random());
    }
}
