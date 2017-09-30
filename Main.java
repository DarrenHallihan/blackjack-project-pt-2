import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        Random randGen = new Random();
        int userInput = 0; // number user puts in scanner
        int numGames = 0;
        int firstCard = 0; // value of the first card dealt
        int anotherHit = randGen.nextInt(13) + 1; // value of another card dealt
        int currentHand = 0;
        int dealerHand = randGen.nextInt(11) + 16; // value of the dealer's hand, ranging from 16 to 26


        while(userInput != 4) // will repeat as long as user doesn't input 4
        {
            numGames = numGames + 1;
            System.out.println("START GAME #" + numGames + "!");
            System.out.println();
            System.out.print("Your card is a ");
            System.out.print(firstCard = randGen.nextInt(13) + 1);
            System.out.println("!");
            System.out.print("Your hand is: " + firstCard);
            System.out.println();
            System.out.println("1. Get another card");
            System.out.println("2. Hold hand");
            System.out.println("3. Print statistics");
            System.out.println("4. Exit");
            System.out.println();

            try {
                System.out.print("Choose an option : ");
                System.out.println(userInput = scnr.nextInt());
                if (userInput > 4) {
                    throw new Exception("Invalid input!");
                }
                if (userInput < 1){
                    throw new Exception("Invalid input!");
                    }
            }
            catch(Exception excpt){
                    System.out.println(excpt.getMessage());
                    System.out.println("Please enter an integer value between 1 and 4");

                }
            if (userInput == 1){
                System.out.println("Your card is a " + anotherHit);
                currentHand = firstCard + anotherHit;
                System.out.println("Your hand is: " + currentHand);
                System.out.println();
                if (currentHand == 21) {
                    System.out.print("BLACKJACK! You win!");
                    continue;
                }
                if (currentHand > 21){
                    System.out.print("You exceeded 21! You lose :(");
                    continue;
                    }
                }
                System.out.println("1. Get another card");
                System.out.println("2. Hold hand");
                System.out.println("3. Print statistics");
                System.out.println("4. Exit");




            }


             }











                    }









