public class Korrigan extends Card  {

    public Korrigan()
    {
    }
    
    
    /**
     * The power of the Korrigan makes the current player draw twice in the opponent hand.
     * Drawing is random
     * @param hand
     * @param opponentHand
     * @param kingdom
     * @param opponentKingdom
     * @param deck
     */
    @Override
    public void Power(Hand hand,Hand opponentHand,Kingdom kingdom,Kingdom opponentKingdom,Deck deck) {
        hand.Cards().add(opponentHand.RandomRemove());
        hand.Cards().add(opponentHand.RandomRemove());
    }
}
