import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            //Get the user input
            Scanner in = new Scanner (System.in);


//Make the score
int wins = 0;
int losses = 0;

//loop and ask the player
while(true){
    System.out.print("Type Rock, Paper, Scissiors or quit");
    String myMove = in.nextLine();
    
    
    //check if user quits
    if(myMove.equals("quit"))
        break;
    
    // MAke my move valid
    if (!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissors")) {
        System.out.println("Your Input is INVALID!");
    
    } else {
     //Randomly generate the bots move
    int rand = (int)Math.random() * 3;
    String botMove = "";
    if(rand == 0) {
        botMove = "Rock";
    } else if(rand == 1){
        botMove = "Paper";
    }else if (rand == 2){
        botMove = "Scissors";
    }
    System.out.println("Bot Move: " + botMove);
    
    //Calculate win, lose and tie
    if(myMove.equals(botMove)) {
        System.out.println("You think like the bot!");
    } else if((myMove.equals("rock") && botMove.equals("scissors")) || (myMove.equals("scissors") && botMove.equals("paper")) || (myMove.equals("paper") && botMove.equals("rock"))) {
        System.out.println("Congrats you beat a bot!");
        wins++;
    } else {
        System.out.println("Imagine losing to a bot!");
        losses++;
    }
    
    }
System.out.println("Bro won " + wins + "games");
System.out.println("Bro lost " + losses + "games");
}

//Check win/loss ratio
if(wins>losses) {
    System.out.println("Looks like bro has a high win rate");
} else if(wins < losses) {
System.out.println("Looks like bro has taking L's enchanted to max");
} else {
    System.out.println("Bro has a tie");
}


System.out.println("Bro could not handle the bot");

    }
}