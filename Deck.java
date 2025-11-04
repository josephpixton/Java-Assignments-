//Name: Joe Pixton
//Class: CS 145
//File: Deck.java
//Source: W3/GPT
//Purpose: Deck class file for TexasHoldemGame 

import java.util.*;

public class Deck {
    private Stack<Card> cards;

    public Deck() {
        cards = new Stack<>();
        initializeDeck();
        shuffle();
    }

    // Create 52-card deck
    private void initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", 
                          "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (int i = 0; i < ranks.length; i++) {
                String rank = ranks[i];
                int value = i + 2; // 2 → 2, Ace → 14
                cards.push(new Card(suit, rank, value));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        if (cards.isEmpty()) {
            System.out.println("No more cards in the deck!");
            return null;
        }
        return cards.pop(); // Stack: LIFO → draw from top
    }

    public int size() {
        return cards.size();
    }
}
