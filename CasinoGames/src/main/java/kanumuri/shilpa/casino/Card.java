package kanumuri.shilpa.casino;

/**
 * Created by shilpakanumuri on 1/28/17.
 */
public class Card {

    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    public Rank getRank() {
        return rank;
    }
}
