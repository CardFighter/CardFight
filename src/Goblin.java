public class Goblin extends Card {


    public Goblin()
    {
    }

    @Override
    public void Power(Hand hand,Hand opponent_hand,Kingdom kingdom,Kingdom opponent_kingdom,Deck deck) {

        // switch hand
        Hand res = hand;
        //WORK OR NEED TO DUPLICATE ?
        hand = opponent_hand;
        opponent_hand = res;
    }
}
