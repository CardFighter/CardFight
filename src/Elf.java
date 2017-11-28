public class Elf extends Card {

    public Elf()
    {
    }

    @Override
    public void Power(Hand hand,Hand opponent_hand,Kingdom kingdom,Kingdom opponent_kingdom,Deck deck) {

        // copy and use the power of a card of your kingdom
        //TAKE THE FIRST
        //NEED CHOICE
        kingdom.Cards().get(0).Power(hand,opponent_hand,kingdom,opponent_kingdom,deck);
    }
}
