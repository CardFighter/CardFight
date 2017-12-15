
public class RandomPlayer extends Player{
	public RandomPlayer(Deck deck) {
		super(deck);
	}
	
	@Override
	public void play(Hand opponentHand, Kingdom opponentKingdom) {
		Card cardToPlay = this.hand.RandomRemove();
		cardToPlay.Power(this.hand, opponentHand, this.kingdom, opponentKingdom, this.deck);
		this.kingdom.Add(cardToPlay);
	}

	

}
