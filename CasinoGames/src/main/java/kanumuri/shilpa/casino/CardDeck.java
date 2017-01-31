package kanumuri.shilpa.casino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by shilpakanumuri on 1/28/17.
 */
public class CardDeck extends ArrayList<Card> {

    {
        for (Suit suit : Suit.values())
            for (Rank rank : Rank.values())
                this.add(new Card(rank, suit));

     }

    @Override
    public String toString() {
         String temp = "";
         for(Card card : this){
             temp += card.toString()+ "\n";
         }
        return temp;
    }

    public void shuffleDeck(){
        Collections.shuffle(this);
    }

    public Card getNextCard(){
       Card dealTempCard = this.get(0);
       this.remove(0);
       return dealTempCard;
    }



}
