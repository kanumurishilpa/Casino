package kanumuri.shilpa.casino;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by shilpakanumuri on 1/29/17.
 */
public class CardDeckTest {

    CardDeck deck;

    @Before
    public void setUp(){
        deck = new CardDeck();
    }

    @Test
    public void getNextCardTest(){
        Card expected = new Card(Rank.TWO,Suit.HEART);
        Card actual = deck.getNextCard();
        Assert.assertEquals(expected.toString(),actual.toString());

    }



}
