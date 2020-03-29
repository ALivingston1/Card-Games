package components;

import util.Reference;

import java.util.Stack;

public class Deck implements IDeck {
    public Stack<Card> cardStack;

    public Deck() {
        cardStack = new Stack<>();
        for (int i = 0; i < Reference.suits.length; i++) {
            for (int j = 0; j < Reference.values.length; j++) {
                cardStack.add(new Card(Reference.suits[i], Reference.values[i]));
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
        return cardStack.indexOf(card);
    }

    @Override
    public Card getCard(int index) {
        return cardStack.get(index);
    }

    @Override
    public Card getTopCard() {
        return cardStack.firstElement();
    }

    @Override
    public Card getBottomCard() {
        return cardStack.lastElement();
    }
}
