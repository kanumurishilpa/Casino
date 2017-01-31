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
        player.setName("Shilpa");
        String expected = "Shilpa";
        String actual = player.getName();
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getPlayerBalanceTest(){
        player.setBalance(500);
        double expected = 500;
        double actual = player.getBalance();
        Assert.assertEquals(expected,actual,0);

    }

    @Test
    public void getPlayerGameChoiceScanTest(){
        player.setGameChoice("goFish");
        String expected = "goFish";
        String actual = player.getGameChoice();
        Assert.assertEquals(expected,actual,0);

    }

    @Test
    public void doYouWantToPlayTest(){
        player.setYesOrNO("Y");
        String expected = "goFish";
        String actual = player.getYesOrNO();
        Assert.assertEquals(expected,actual,0);

    }

    @Test
    public void giveMeYourCardTest(){
        player.setCardChoice("TWO");
        String expected = "goFish";
        String actual = player.getCardChoice();
        Assert.assertEquals(expected,actual,0);

    }


}
