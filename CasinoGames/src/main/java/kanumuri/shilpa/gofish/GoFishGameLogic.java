package kanumuri.shilpa.gofish;

import kanumuri.shilpa.casino.Card;
import kanumuri.shilpa.casino.Player;

import java.util.Map;

/**
 * Created by shilpakanumuri on 1/29/17.
 */
public class GoFishGameLogic{

    Player player = new Player();
    HandGF handGF = new HandGF();

    public void play( Map<String, Integer> playerHand,  Map<String, Integer> dealerHand){
        String choice = "player";
        while(true){
            if(choice.equalsIgnoreCase("Player")){
                String card = player.giveMeYourCard();
                if(transferCard(card, dealerHand, playerHand) == true){
                    choice = "player";
                }else {
                    Card addCard = handGF.goFishCardFromStack();
                    if(addCard == null) break;
                    addCardToHand(addCard,playerHand);
                    choice = "dealer";
                }
            }else if (choice.equalsIgnoreCase("Dealer")){
                String card = dealerPlay(dealerHand);
                if(transferCard(card, playerHand, dealerHand) == true){
                    choice = "dealer";
                }else {
                    Card addCard = handGF.goFishCardFromStack();
                    if(addCard == null) break;
                    addCardToHand(addCard,dealerHand);
                    choice = "player";
                }
            }
        }

    }

    public boolean transferCard(String key, Map<String, Integer> fromHand, Map<String, Integer> toHand){
        if(fromHand.get(key) == null || fromHand.get(key) == 0 ){
            return false;
        }else{
            int numberOfCards = fromHand.get(key);
            fromHand.put(key,0);
            toHand.put(key, toHand.get(key)+ numberOfCards);
            return true;
        }
    }

    public void addCardToHand(Card card, Map<String, Integer> toHand){
        if(toHand.get(card.getRank().name()) ==null){
            toHand.put(card.getRank().name(),0);
        }
        toHand.put(card.getRank().name(), toHand.get(card.getRank().name())+1);
    }

    public String dealerPlay(Map<String, Integer> hand){
        String firstKey = hand.keySet().iterator().next();
        return firstKey;
    }

    public void Winner(Map<String, Integer> playerHand, Map<String, Integer> winnerHand){
        int playerBooks;
        int winnerBooks;



        // iterate through both and get the maximum books of four card

    }



}
