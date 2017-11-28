public class GameLogic {
    public static void main(String[] args) {
        Deck deck = new Deck();

        for(int i = 0; i < deck.card.length; i++) {
            System.out.println(deck.card[i]);
            System.out.println();
        }
    }
}
