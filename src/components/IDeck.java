package components;

public interface IDeck {
    public void sort();

    public void shuffle();

    public void divide(int divisor);

    public void insertCard(Card card);

    public void insertCard(Card card, int index);

    public void insertCardAtTop(Card card);

    public void insertCardAtBottom(Card card);

    public int getCard(Card card);

    public Card getCard(int index);

    public Card getTopCard();

    public Card getBottomCard();
}