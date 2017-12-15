
public abstract class Player {
	/**
     * Attributes
     */
	protected Hand hand;
	protected Kingdom kingdom;
	protected int points;
	protected Deck deck;
	
	/**
     * Constructor with no initial parameters
     */
	public Player() {
		
	}
	
	public Player(Deck deck) {
		this.deck = deck;
		this.hand = new Hand();
		this.kingdom = new Kingdom();
		this.points = 0;
	}
	
	
	
	/**
     * Getters and setters
     */
	public Hand getHand() {
		return hand;
	}
	public void setHand(Hand hand) {
		this.hand = hand;
	}
	public Kingdom getKingdom() {
		return kingdom;
	}
	public void setKingdom(Kingdom kingdom) {
		this.kingdom = kingdom;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public Deck getDeck() {
		return deck;
	}
	public void setDeck(Deck deck) {
		this.deck = deck;
	}
	/**
     * Methods 
     */
	
	/*
	 * Draw from deck function
	 */
	
	public void Draw()
	{
		deck.getCards().add(deck.Draw());
	} 

	public void Draw(int nb)
	{
		for (int i = 0; i < nb; i++) {
			deck.getCards().add(deck.Draw());
		}
	}
	
	public abstract void play(Hand opponent_hand,Kingdom opponent_kingdom);
	
}
