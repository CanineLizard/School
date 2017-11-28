public class Card {

    private String face;
    private String suit;
    private int value;

    public Card(String face, String suit, int value) {
        this.face = face;
        this.suit = suit;
        this.value = value;
    }

    public int compareTo(Card other) {
        return value - other.value;
    }

    public String toString() {
        return "Face: " + face + "\nSuit: " + suit + "\nValue: " + value;
    }

    public String getFace() {
        return face;
    }

    public String getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }


}
