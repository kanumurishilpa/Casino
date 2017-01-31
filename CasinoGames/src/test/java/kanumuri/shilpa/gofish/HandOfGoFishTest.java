package kanumuri.shilpa.gofish;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by shilpakanumuri on 1/31/17.
 */
public class HandOfGoFishTest {

    HandOfGoFish handOfGoFish;

    @Test
    public void transferSucessfulTest() {
        handOfGoFish = new HandOfGoFish();
        handOfGoFish.put("TWO", 1);
        Boolean actual = handOfGoFish.transferSuccessful(1, "THREE");
        Assert.assertEquals(true, actual);
    }

    @Test
    public void transferSucessfulFalseTest() {
        handOfGoFish = new HandOfGoFish();
        handOfGoFish.put("THREE", 1);
        Boolean actual = handOfGoFish.transferSuccessful(1, "THREE");
        Assert.assertEquals(false, actual);
    }

    @Test
    public void containsCardFalseTest() {
        handOfGoFish = new HandOfGoFish();
        handOfGoFish.put("THREE", 1);
        boolean actual = handOfGoFish.containsCard("FIVE");
        Assert.assertEquals(false, actual);
    }

    @Test
    public void containsCardTrueTest() {
        handOfGoFish = new HandOfGoFish();
        handOfGoFish.put("FIVE", 1);
        boolean actual = handOfGoFish.containsCard("FIVE");
        Assert.assertEquals(true, actual);

    }

}
