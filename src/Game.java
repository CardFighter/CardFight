
public class Game {
	/**
     * Attributes
     */
	private Player player;
	private Player issouPlayer;
	private Deck deck;
	
	public Game()
	{
		deck = new Deck(60);
		player = new RandomPlayer(deck);
		issouPlayer = new RandomPlayer(deck);
		player.Draw(5);
		issouPlayer.Draw(5);
	}
	
	public void update()
	{
		
	}
	
	
}
