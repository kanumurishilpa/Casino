package kanumuri.shilpa.blackjack;

import kanumuri.shilpa.casino.Card;
import kanumuri.shilpa.casino.CardGame;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shilpakanumuri on 1/30/17.
 */
public class HandBJ extends CardGame{

    {
        cardDeck.shuffleDeck();
    }

    public Card playerCard;
    public Card dealerCard;

    List<String> playerHand = new ArrayList<String>();
    List<String> dealerHand = new ArrayList<String>();

    public void dealCards() {
        for(int i =0; i < 2 ; i++) {
            playerCard = cardDeck.getNextCard();
            addCardToPlayerHand(playerCard);
            dealerCard = cardDeck.getNextCard();
            addCardToDealerHand(dealerCard);
        }
    }

    public void addCardToPlayerHand(Card playerCard){
        String card = playerCard.toString();
        playerHand.add(card);
    }

    public void addCardToDealerHand(Card dealerCard){
        String card = dealerCard.toString();
        dealerHand.add(card);
    }

    public void hit() {
        playerCard = cardDeck.getNextCard();

    }

    public void stay() {

        dealerCard = cardDeck.getNextCard();
    }

    /*public String showPlayerCard() {

         playerHand.toString();
    }

    public String showDealerCard() {

        dealerCard.toString();
    }

    public String showRoundResult() {
        return "Player card : " + showPlayerCard() + "\nDealer card : " + showDealerCard();

    }*/

    public boolean userHitOrStay(String hitOrStay) {
        boolean option = false;
        if(hitOrStay.equalsIgnoreCase("Hit")){
            hit();
            option = true;
        }else if(hitOrStay.equalsIgnoreCase("Stay")){
            stay();
            option = true;
        }else{
            option = false;
        }
        return option;
    }
}
