//Name: Joe Pixton
//Class: CS 145
//File: Player.java
//Source: W3/GPT
//Purpose: Player class file for TexasHoldemGame

import java.util.LinkedList;

public class Player {
    private String name;
    private LinkedList<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public LinkedList<Card> getHand() {
        return hand;
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public void clearHand() {
        hand.clear();
    }

    public void showHand() {
        System.out.println(name + "'s hand:");
        for (Card card : hand) {
            System.out.println("  " + card);
        }
    }
}
