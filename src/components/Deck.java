package components;

import util.Reference;

import java.util.ArrayList;
import java.util.Stack;

public class Deck implements IDeck {
    public ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<>();
        for (int i = 0; i < Reference.suits.length; i++) {
            for (int j = 0; j < Reference.values.length; j++) {
                deck.add(new Card(Reference.suits[i], Reference.values[j]));
            }
        }
    }

    @Override
    public void sort() {

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

    private swap(C)
}
