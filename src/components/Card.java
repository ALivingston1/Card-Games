package components;

/**
 * Simple card class, with suit and values.
 * Includes setters and getters for deck manipulation.
 */
public class Card {
    private String suit;
    private String value;

    /**
     * Constructor, initial suit and value.
     * @param suit
     * @param value
     */
    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    public void set(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    /**
     * Sets suit of card
     * @param suit
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * Gets suit of card
     * @return String suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * Sets value of card
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets value of card
     * @return String value
     */
    public String getValue() {
        return value;
    }
}
