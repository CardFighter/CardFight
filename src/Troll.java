public class Troll extends Card {

    public Troll()
    {

    }

    @Override
    public void Power(Hand hand,Hand opponent_hand,Kingdom kingdom,Kingdom opponent_kingdom,Deck deck) {

        //swap kingdom
        Kingdom res = kingdom;
        //WORK OR NEED TO DUPLICATE ?
        kingdom = opponent_kingdom;
        opponent_kingdom = res;

    }
}
