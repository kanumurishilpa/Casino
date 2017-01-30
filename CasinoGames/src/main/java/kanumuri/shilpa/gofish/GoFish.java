package kanumuri.shilpa.gofish;


/**
 * Created by shilpakanumuri on 1/29/17.
 */
public class GoFish{

    HandGF handGF = new HandGF();
    GoFishGameLogic goFishGame = new GoFishGameLogic();

    public void startPlaying(){
        System.out.println("You have Started Playing GoFish");
    }

    public void showPlayerDeck(){
          handGF.showHand(handGF.playerHand);
    }

    public void showDealerResult(){
        handGF.showHand(handGF.dealerHand);
    }

    public void gamefirstPlay(){
        handGF.dealSevenRounds();
        showPlayerDeck();
        //System.out.println(cardDeck.toString());
    }

    public void playGoFish(){
        this.startPlaying();
        this.gamefirstPlay();
        goFishGame.play(handGF.playerHand, handGF.dealerHand);
        handGF.stopPlaying();
    }

}
