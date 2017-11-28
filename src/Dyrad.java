public class Dyrad extends Card {

    public Dyrad()
    {
    }

    @Override
    public void Power(Hand hand,Hand opponent_hand,Kingdom kingdom,Kingdom opponent_kingdom,Deck deck) {

        // stole a card in the opponent kingdom and putt it in your kingdom without power
        //TAKE THE FIRST
        //CAN CHOICE ?
        kingdom.Add(opponent_kingdom.Cards().remove(0));

    }
}
