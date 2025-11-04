//Name: Joe Pixton
//Class: CS 145
//File: Card.java
//Source: W3/GPT
//Purpose: Card class file for TexasHoldemGame 

// Card.java
public class Card {
    private String suit;
    private String rank;
    private int value; // For comparing cards later

    public Card(String suit, String rank, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
