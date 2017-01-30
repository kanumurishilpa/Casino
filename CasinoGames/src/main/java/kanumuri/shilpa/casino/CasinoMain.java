package kanumuri.shilpa.casino;

import kanumuri.shilpa.blackjack.BlackJack;
import kanumuri.shilpa.gofish.GoFish;

/**
 * Created by shilpakanumuri on 1/28/17.
 */
public class CasinoMain {

    public static void main(String[] args) {

        Player player = new Player();
        BlackJack blackJack = new BlackJack();
        GoFish goFish = new GoFish();

        String currentPlayerName = "";
        double currentPlayerBalance = 0;
        String gameChoice = "";

        boolean playerWantsToPlay = player.doYouWantToPlay();
        if(playerWantsToPlay){
             currentPlayerName = player.getPlayerName();
             currentPlayerBalance = player.getPlayerBalanceScan();
             gameChoice = player.getPlayerGameChoiceScan();
        }

        while(playerWantsToPlay){
            if(gameChoice.equalsIgnoreCase("BlackJack")){
                blackJack.playBlackJack();
            }else if(gameChoice.equalsIgnoreCase("GoFish")){
                goFish.playGoFish();
            }else {
                System.out.println("No such game");
            }

            playerWantsToPlay = player.doYouWantToPlay();
            if(playerWantsToPlay)gameChoice = player.getPlayerGameChoiceScan();
        }


    }

}

