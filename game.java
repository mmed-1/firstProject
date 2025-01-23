import java.util.Scanner;
import java.util.Random;

//? ROCK PAPER SCISSORS GAME

public class game {
    static Scanner scanner = new Scanner(System.in);
    static void gameFunction() {

        Random random = new Random();

        int robotChoice = random.nextInt(1, 4); //For [1,3]
        String userChoice;

        do{
            System.out.print("Enter your move (rock, paper or scissors): ");
            userChoice = scanner.nextLine();
        }while(userChoice.isEmpty()); //u must to enter a move
        
        switch(robotChoice) {
            case 1: System.out.println("Computer choice: paper");

                    if(userChoice.equalsIgnoreCase("paper")) {
                        System.out.println("No one win!");
                    } else if(userChoice.equalsIgnoreCase("rock")) {
                        System.out.println("Computer win!");
                    } else if(userChoice.equalsIgnoreCase("scissors")) {
                        System.out.println("You win!");
                    } else {
                        System.out.println("Bad choice");
                    }
                    break;

            case 2: System.out.println("Computer choice: rock");

                    if(userChoice.equalsIgnoreCase("paper")) {
                        System.out.println("You win!");
                    } else if(userChoice.equalsIgnoreCase("rock")) {
                        System.out.println("No one win!");
                    } else if(userChoice.equalsIgnoreCase("scissors")) {
                        System.out.println("Computer win!");
                    } else {
                        System.out.println("Bad choice");
                    }
                    break;
            
            case 3: System.out.println("Computer chice: scissors");
                    
                if(userChoice.equalsIgnoreCase("paper")) {
                    System.out.println("Computer win!");
                } else if(userChoice.equalsIgnoreCase("rock")) {
                    System.out.println("You win!");
                } else if(userChoice.equalsIgnoreCase("scissors")) {
                    System.out.println("No one win!");
                } else {
                    System.out.println("Bad choice");
                }
                break;
        }
        // scanner.close();
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Boolean play = true;
        String yesOrNo;
        while(play) {
            gameFunction();

            do{
                System.out.print("You want to play again?: ");
                yesOrNo = scanner.nextLine();
            }while(yesOrNo.isEmpty()); //u must to enter yes or no

            if(yesOrNo.equalsIgnoreCase("yes")) play = true;
            else play = false;
        }
        scanner.close();
    }
}
