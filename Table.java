//Name: Joe Pixton
//Class: CS 145
//File: Table.java
//Source: W3/GPT
//Purpose: Talble class file for TexasHoldemGame

import java.util.*;

public class Table {
    private LinkedList<Card> communityCards;  // Flop, Turn, River
    private Queue<Player> players;            // Player turn order
    private Deck deck;

    public Table() {
        communityCards = new LinkedList<>();
        players = new LinkedList<>();
        deck = new Deck();
    }

    // Add players to the table
    public void addPlayer(Player player) {
        players.offer(player); // add to the queue (FIFO)
    }

    // Deal two cards to each player
    public void dealToPlayers() {
        for (Player player : players) {
            player.addCard(deck.drawCard());
            player.addCard(deck.drawCard());
        }
    }

    // Flop (3 cards)
    public void dealFlop() {
        communityCards.add(deck.drawCard());
        communityCards.add(deck.drawCard());
        communityCards.add(deck.drawCard());
        System.out.println("Flop dealt!");
    }

    // Turn (1 card)
    public void dealTurn() {
        communityCards.add(deck.drawCard());
        System.out.println("Turn dealt!");
    }

    // River (1 card)
    public void dealRiver() {
        communityCards.add(deck.drawCard());
        System.out.println("River dealt!");
    }

    public void showCommunityCards() {
        System.out.println("Community Cards:");
        for (Card card : communityCards) {
            System.out.println("  " + card);
        }
    }

    public void showPlayersHands() {
        for (Player player : players) {
            player.showHand();
        }
    }

    // Optional: Rotate player turns
    public void nextTurn() {
        Player current = players.poll();  // remove first player
        if (current != null) {
            players.offer(current);       // move them to the back
        }
    }

    public Deck getDeck() {
        return deck;
    }
}
