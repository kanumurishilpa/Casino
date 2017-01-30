package kanumuri.shilpa.casino;

/**
 * Created by shilpakanumuri on 1/28/17.
 */
public class Player extends InputOutput {

    public String name;
    public double balance;
    public String gameChoice;
    public String yesOrNO;
    public String cardChoice;

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getGameChoice() {
        return gameChoice;
    }

    public String getPlayerName(){
        System.out.println("What is your name");
        name = readStringValues();
        return name;

    }

    public double getPlayerBalanceScan(){
        System.out.println("How much balance do you want");
        balance = readDoubleValues();
        return balance;
    }

    public String getPlayerGameChoiceScan(){
        System.out.println("Which Game Do You want to play");
        gameChoice = readStringValues();
        return gameChoice;
    }

    public boolean doYouWantToPlay(){
        boolean temp;
        System.out.println("Enter Y to play and anythingelse to Quit");
        yesOrNO = readStringValues();
        return (yesOrNO.equalsIgnoreCase("Y")) ? true : false;
    }

    public String giveMeYourCard(){
        System.out.println("Enter a number you want the other player to give you");
        cardChoice = readStringValues();
        return cardChoice;
    }


}
