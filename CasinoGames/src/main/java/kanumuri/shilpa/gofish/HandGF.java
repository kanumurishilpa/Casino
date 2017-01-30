package kanumuri.shilpa.gofish;

import kanumuri.shilpa.casino.Card;
import kanumuri.shilpa.casino.CardGame;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by shilpakanumuri on 1/29/17.
 */
public class HandGF extends CardGame{
    {
        cardDeck.shuffleDeck();
    }

    public Card playerCard;
    public Card dealerCard;

    Map<String, Integer> playerHand = new HashMap<String, Integer>();
    Map<String, Integer> dealerHand = new HashMap<String, Integer>();


    public void dealSevenRounds(){
        for(int i =0; i < 7 ; i++){
            playerCard = cardDeck.getNextCard();
            addCardToPlayerHand(playerCard);
            dealerCard = cardDeck.getNextCard();
            addCardToDealerHand(dealerCard);
        }
    }

    public void addCardToPlayerHand(Card playerCard){
        if(playerHand.get(playerCard.getRank().name()) == null){
            playerHand.put(playerCard.getRank().name(),0);
        }
        this.playerHand.put(playerCard.getRank().name(), playerHand.get(playerCard.getRank().name())+1);
    }

    public void addCardToDealerHand(Card dealerCard){
        if(dealerHand.get(dealerCard.getRank().name()) == null){
            dealerHand.put(dealerCard.getRank().name(),0);
        }
        this.dealerHand.put(dealerCard.getRank().name(), dealerHand.get(dealerCard.getRank().name())+1);
    }

    public void showHand(Map<String, Integer> hand){
        for (String card: hand.keySet()){
            String key = card.toString();
            String value = hand.get(card).toString();
            System.out.println(value + " cards of "+ key);

        }
    }

    public Card goFishCardFromStack(){
        Card fishCard = cardDeck.getNextCard();
        return fishCard;
    }




}
