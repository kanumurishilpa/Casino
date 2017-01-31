package kanumuri.shilpa.gofish;

import kanumuri.shilpa.casino.Card;
import kanumuri.shilpa.casino.CardDeck;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by shilpakanumuri on 1/30/17.
 */
public class HandOfGoFish extends HashMap<String, Integer>{

    public void addCard(CardDeck deck){
        Card tempCard = deck.getNextCard();
        if(this.get(tempCard.getRank().name()) == null){
            this.put(tempCard.getRank().name(),0);
        }
        this.put(tempCard.getRank().name(), this.get(tempCard.getRank().name())+1);
    }

    public void addSevenCards(CardDeck deck){
        for (int i = 0; i < 7; i++) {
            this.addCard(deck);
        }
    }

    public String toString(){
        String tempString ="";
        for(String card: this.keySet()){
            tempString += this.get(card) + " cards of " + card.toString()  + "\n" ;
        }
        return tempString;
    }

    public void transferCard(String requestedCard, HandOfGoFish otherHand){
        if(containsCard(requestedCard)){
            if(otherHand.containsCard(requestedCard)){
                int numberOfCards = otherHand.get(requestedCard);
                otherHand.put(requestedCard,0);
                this.put(requestedCard, this.get(requestedCard)+numberOfCards);
            }
        }
    }

    public boolean transferSuccessful(Integer oldValueOfKey, String selectedCard){
        return oldValueOfKey != this.get(selectedCard);
    }

    public boolean containsCard(String card){
        return this.containsKey(card);
    }

    public void goFishCardFromStack(CardDeck stack){
        System.out.println("Fishing");
        addCard(stack);
    }


}
