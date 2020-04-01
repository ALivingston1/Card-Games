package components;

import util.Reference;

import java.util.ArrayList;
import java.util.Stack;

public class Deck implements IDeck {
    private ArrayList<Card> deck;
    private boolean allowJokers;

    public Deck() {
        deck = new ArrayList<>();
        addNewCards();
    }

    /**
     * Clears deck, adds new cards to the deck.
     * Faster than actually sorting.
     */
    @Override
    public void sort() {
        deck.clear();
        addNewCards();
    }

    @Override
    public void shuffle() {

    }

    @Override
    public void divide(int divisor) {

    }

    @Override
    public void insertCard(Card card) {

    }

    @Override
    public void insertCard(Card card, int index) {

    }

    @Override
    public void insertCardAtTop(Card card) {

    }

    @Override
    public void insertCardAtBottom(Card card) {

    }

    @Override
    public int getCard(Card card) {
        return deck.indexOf(card);
    }

    @Override
    public Card getCard(int index) {
        return deck.get(index);
    }

    @Override
    public Card getTopCard() {
        return deck.get(0);
    }

    @Override
    public Card getBottomCard() {
        return deck.get(deck.size() - 1);
    }

    public void print() {
        for (int i = 0; i < deck.size(); i++) {
            System.out.println("Card " + (i + 1) + ": " + "suit: " + deck.get(i).getSuit() + " value: " + deck.get(i).getValue());
        }
    }

    /**
     * Swaps Cards.
     * Creates temp card to store values being overwritten.
     * Sets new values.
     * @param x
     * @param y
     */
    public void swap(Card x, Card y) {
        Card temp = new Card(x.getSuit(), x.getValue());
        x.set(y.getSuit(), y.getValue());
        y.set(temp.getSuit(), temp.getValue());
    }

    /**
     * Adds all 52 cards to deck.
     * Adds Jokers if allowed.
     */
    private void addNewCards() {
        for (int i = 0; i < Reference.suits.length; i++) {
            for (int j = 0; j < Reference.values.length; j++) {
                deck.add(new Card(Reference.suits[i], Reference.values[j]));
            }
        }

        if (allowJokers) {
            for (int i = 0; i < Reference.joker.length(); i++) {
                deck.add(new Card("", ""));
            }
        }
    }
}
