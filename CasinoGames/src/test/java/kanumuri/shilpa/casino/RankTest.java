package kanumuri.shilpa.casino;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by shilpakanumuri on 1/29/17.
 */
public class RankTest {


    @Test
    public void rankPointsTest() {
        Assert.assertEquals(2,Rank.TWO.getRankpoints());
        Assert.assertEquals(3,Rank.THREE.getRankpoints());
        Assert.assertEquals(4,Rank.FOUR.getRankpoints());
        Assert.assertEquals(5,Rank.FIVE.getRankpoints());
        Assert.assertEquals(6,Rank.SIX.getRankpoints());
        Assert.assertEquals(7,Rank.SEVEN.getRankpoints());
        Assert.assertEquals(8,Rank.EIGHT.getRankpoints());
        Assert.assertEquals(9,Rank.NINE.getRankpoints());
        Assert.assertEquals(10,Rank.TEN.getRankpoints());
        Assert.assertEquals(10,Rank.JACK.getRankpoints());
        Assert.assertEquals(10,Rank.QUEEN.getRankpoints());
        Assert.assertEquals(10,Rank.KING.getRankpoints());
        Assert.assertEquals(11,Rank.ACE.getRankpoints());
    }
}
