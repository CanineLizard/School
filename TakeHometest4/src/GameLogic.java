import java.util.Scanner;

public class GameLogic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Deck deck = new Deck();

        String user;

        do {


            user = input.nextLine();
        }while(user.toLowerCase().equals("q"));


    }
}
