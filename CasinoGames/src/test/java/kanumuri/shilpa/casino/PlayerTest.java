package kanumuri.shilpa.casino;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by shilpakanumuri on 1/28/17.
 */
public class PlayerTest {

    Player player;


    @Before
    public void setUp(){
        player = new Player();
    }

    @Test
    public void getPlayerNameTest(){
        player.name = "Shilpa";
        String actual = "Shilpa";
        String expected = player.getName();
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getPlayerBalanceTest(){
        player.balance = 500;
        double actual = 500;
        double expected = player.getBalance();
        Assert.assertEquals(expected,actual,0);

    }


}
