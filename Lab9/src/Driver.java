import java.util.Arrays;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dice die1 = new Dice();
        Dice die2 = new Dice();

        int player[] = new int[6];
        int computer[] = new int[6];
        int amountPlayerWon = 0;
        int amountComputerWon = 0;


        String user;

        do {
            int playerPoints = 0;
            int computerPoints = 0;

            while (playerPoints < 100 && computerPoints < 100) {
                for (int i = 0; i < player.length; i++) {
                    die1.roll();
                    player[i] = die1.getFace();
                }



                for (int i = 0; i < computer.length; i++) {
                    die1.roll();
                    computer[i] = die1.getFace();
                }


                player = sort(player);
                computer = sort(computer);



                if(contains(player, "1 1 1")) {
                    playerPoints = 0;
                } else {
                    if(contains(discard(player), "1 2 3 4 5 6")) {
                        playerPoints += 35;
                    } else if(contains(discard(player), "1 2 3 4 5")) {
                        playerPoints += 25;
                    } else if(contains(discard(player), "1 2 3 4 ")) {
                        playerPoints += 20;
                    }else if(contains(discard(player), "1 2 3")) {
                        playerPoints += 15;
                    } else if(contains(discard(player), "1 2 ")) {
                        playerPoints += 10;
                    } else if(contains(discard(player), "1")) {
                        playerPoints += 5;
                    }
                }

                if(contains(computer, "1 1 1")) {
                    computerPoints = 0;
                } else {

                    if(contains(discard(computer), "1 2 3 4 5 6")) {
                        computerPoints += 35;
                    } else if(contains(discard(computer), "1 2 3 4 5")) {
                        computerPoints += 25;
                    } else if(contains(discard(computer), "1 2 3 4 ")) {
                        computerPoints += 20;
                    }else if(contains(discard(computer), "1 2 3")) {
                        computerPoints += 15;
                    } else if(contains(discard(computer), "1 2 ")) {
                        computerPoints += 10;
                    } else if(contains(discard(computer), "1")) {
                        computerPoints += 5;
                    }

                }


                System.out.print("\nplayer: ");
                for(int i = 0; i < player.length; i++) {
                    System.out.print(player[i] + " ");
                }

                System.out.print("\nComputer:");

                for(int i = 0; i < computer.length; i++) {
                    System.out.print(computer[i] + " ");
                }

                System.out.println("\nYour Points: " + playerPoints);
                System.out.println("Computer Points: " + computerPoints + "\n");
            }

            if(playerPoints > computerPoints ) {
                System.out.println("You win!");
                amountPlayerWon++;
            } else {
                System.out.println("computer wins");
                amountComputerWon++;
            }

            System.out.println("you have won " + amountPlayerWon +" times");
            System.out.println("Computer has won " + amountComputerWon + " times");

            System.out.println("Would you like to play again?");
            user = input.next();
        } while (user.toLowerCase().equals("y"));
    }

    public static int[] sort(int[] dice) {

        for(int i = 0; i < dice.length; i++) {
            for(int j = i + 1; j < dice.length; j++) {

               if(dice[j] < dice[i]) {
                    int temp = dice[i];
                    dice[i] = dice[j];
                    dice[j] = temp;
                }
            }
        }

        return dice;
    }

    public static int[] discard(int[] dice) {

        for(int i = 0; i < dice.length; i++) {
            for(int j = i + 1; j < dice.length; j++) {
                if(dice[j] == dice[i]) {
                    dice[j] = 0;
                }
            }
        }

        return sort(dice);
    }

    public static boolean contains(int[] dice, String contain) {
        String array = "";
        for(int i = 0; i < dice.length; i++) {
            array = array + dice[i] + " ";
        }

        if(array.contains(contain)) {
            return true;
        }

        return false;
    }

}
