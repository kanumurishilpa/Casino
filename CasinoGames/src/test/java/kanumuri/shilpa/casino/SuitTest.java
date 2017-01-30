package kanumuri.shilpa.casino;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by shilpakanumuri on 1/29/17.
 */
public class SuitTest {
    @Test
    public void suitTest(){
        Assert.assertNotNull(Suit.valueOf("DIAMOND"));
        Assert.assertNotNull(Suit.valueOf("SPADE"));
        Assert.assertNotNull(Suit.valueOf("HEART"));
        Assert.assertNotNull(Suit.valueOf("CLUB"));
    }
}
