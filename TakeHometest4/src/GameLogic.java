import java.util.Scanner;

public class GameLogic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Deck deck = new Deck();

        int player = 0;
        int dealer = 0;

        String user;

             do {

                    System.out.println(deck.getTopCard().toString());
                    System.out.println(deck.getTopCard().getValue());

                 System.out.println("Would you like to continue?");
                 user = input.nextLine();
             }while(!user.toLowerCase().equals("quit"));


    }
}
