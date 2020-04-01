import components.Deck;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.swap(deck.getCard(0), deck.getCard(1));
        deck.print();

    }
}
