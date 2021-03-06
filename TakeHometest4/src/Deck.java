import java.util.Random;

public class Deck {
    private Random rand = new Random();
    private Card[] card = new Card[52];
    private int referenceOfCard;



    public Deck() {
        int count = 0;
        String suit[] = {"Club", "Hearts", "Diamonds", "Spades"};
        String face[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int value[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i = 0; i < suit.length; i++) {
            for(int j = 0; j < face.length; j++) {


                if(face[j].equals("J") || face[j].equals("Q") || face[j].equals("K")) {
                    card[count] =  new Card(face[j], suit[i], 10);
                } else if(face[j].equals("A")) {
                    card[count] =  new Card(face[j], suit[i], 11);
                } else {
                    card[count] =  new Card(face[j], suit[i], j + 2);
                }
                count++;
            }
        }

    }

    public void shuffle() {
        for(int i = 0; i < 1000; i++) {
            for(int j = 0; j < card.length; j++) {
                int place1 = rand.nextInt(52);
                int place2 = rand.nextInt(52);

                Card tempCard = card[place1];
                card[place1] = card[place2];
                card[place2] = tempCard;
            }
        }
    }

    public Card getTopCard() {
        for(int i = 0; i < card.length; i++) {

            if(card[i] != null) {
                Card tempCard = card[i];
                card[i] =  null;
                return tempCard;
            }
        }
        return null;
    }

    public String toString() {

        String deck = "";
        for(int i = 0; i < card.length; i++) {
            deck += card[i].toString() + "\n\n";
        }

        return deck;
    }


}
