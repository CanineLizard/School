public class Deck {
    Card[] card = new Card[52];



    public Deck() {
        int count = 0;
        String suit[] = {"Club", "Hearts", "Diamonds", "Spades"};
        String face[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int value[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i = 0; i < suit.length; i++) {
            for(int j = 0; j < face.length; j++) {

                card[count] =  new Card(face[j], suit[i], j);



                count++;
            }
        }

    }


}
