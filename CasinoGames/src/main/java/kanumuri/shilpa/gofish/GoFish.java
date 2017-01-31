package kanumuri.shilpa.gofish;


import kanumuri.shilpa.casino.Card;
import kanumuri.shilpa.casino.CardGame;
import kanumuri.shilpa.casino.Player;

/**
 * Created by shilpakanumuri on 1/29/17.
 */
public class GoFish extends CardGame{

    HandOfGoFish playerHand = new HandOfGoFish();
    HandOfGoFish dealerHand = new HandOfGoFish();
    Player player = new Player();
    String selectedCard;
    Integer oldValueOfKey;

    public void startPlaying(){
        System.out.println("You have Started Playing GoFish");
        playerHand.addSevenCards(cardDeck);
        dealerHand.addSevenCards(cardDeck);
        showBothDecks();
        selectedCard = player.giveMeYourCard();
        oldValueOfKey = playerHand.get(selectedCard);
        do{
            System.out.println();
            System.out.println("Player Play");
           playerPlay();
            System.out.println();
            System.out.println("Dealer Play");
           dealerPlay();
        }while (dealerHand.containsCard(selectedCard) || playerHand.containsCard(selectedCard));

    }

    public void playerPlay(){
        playerHand.transferCard(selectedCard,dealerHand);
        System.out.println("New hands");
        showBothDecks();
        if(playerHand.transferSuccessful(oldValueOfKey,selectedCard)){
            selectedCard = player.giveMeYourCard();
        }else playerHand.goFishCardFromStack(cardDeck);
    }

    public void dealerPlay(){
        dealerHand.transferCard(selectedCard,playerHand);
        System.out.println("New hands");
        showBothDecks();
        if(dealerHand.transferSuccessful(oldValueOfKey,selectedCard)){
            selectedCard = player.giveMeYourCard();
        }else dealerHand.goFishCardFromStack(cardDeck);
    }

    public void showBothDecks(){
        System.out.println("playerHand");
        System.out.println(playerHand.toString());
        System.out.println("dealerHand");
        System.out.println(dealerHand.toString());
    }

    public void playGoFish(){
        this.startPlaying();
        this.stopPlaying();
    }

}
