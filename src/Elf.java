public class Elf extends Card {

    public Elf()
    {
    }
    
    /**
     * Copy a random card from our kingdom and uses its power
     * @param hand
     * @param opponentHand
     * @param kingdom
     * @param opponentKingdom
     * @param deck
     */
    // Est ce que ca fait une copie la carte ou pas ?
    @Override
    public void Power(Hand hand,Hand opponentHand,Kingdom kingdom,Kingdom opponentKingdom,Deck deck) {
        kingdom.Cards().get(0).Power(hand,opponentHand,kingdom,opponentKingdom,deck);
    }
}
