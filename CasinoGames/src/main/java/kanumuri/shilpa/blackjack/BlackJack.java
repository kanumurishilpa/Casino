package kanumuri.shilpa.blackjack;

import kanumuri.shilpa.casino.Card;
import kanumuri.shilpa.casino.CardGame;

/**
 * Created by shilpakanumuri on 1/28/17.
 */
public class BlackJack {
    HandBJ handBJ = new HandBJ();


    public void startPlaying() {
        System.out.println("You have Started Playing BlackJack");
    }



    public void gameResult(){
        handBJ.dealCards();
        //System.out.println(handBJ.showRoundResult());
        System.out.println(handBJ.cardDeck.toString());
    }

    public void playBlackJack(){
        this.startPlaying();
        this.gameResult();
        handBJ.stopPlaying();
    }


}
