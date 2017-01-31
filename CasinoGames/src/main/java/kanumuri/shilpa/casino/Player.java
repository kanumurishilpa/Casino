package kanumuri.shilpa.casino;

/**
 * Created by shilpakanumuri on 1/28/17.
 */
public class Player extends InputOutput {

    private String name;
    private double balance;
    private String gameChoice;
    private String yesOrNO;
    private String cardChoice;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getGameChoice() {
        return gameChoice;
    }

    public void setGameChoice(String gameChoice) {
        this.gameChoice = gameChoice;
    }

    public String getYesOrNO() {
        return yesOrNO;
    }

    public void setYesOrNO(String yesOrNO) {
        this.yesOrNO = yesOrNO;
    }

    public String getCardChoice() {
        return cardChoice;
    }

    public void setCardChoice(String cardChoice) {
        this.cardChoice = cardChoice;
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
