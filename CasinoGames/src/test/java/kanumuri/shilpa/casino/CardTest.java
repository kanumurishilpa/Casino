package kanumuri.shilpa.casino;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by shilpakanumuri on 1/29/17.
 */
public class CardTest {

    Card card = new Card(Rank.FIVE,Suit.DIAMOND);

    @Test
    public void toStringTest(){
        String expected = "FIVE of DIAMOND";
        String actual = card.toString();
        Assert.assertEquals(expected,actual);
    }

}
