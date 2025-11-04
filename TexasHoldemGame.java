//Name: Joe Pixton
//Class: CS 145
//File: TexasHoldemGame.java
//Source: W3/GPT
//Purpose: Master constructor file for TexasHoldemGame 

import java.util.*;

public class TexasHoldemGame {
    private Table table;

    public TexasHoldemGame() {
        table = new Table();
    }

    public void startGame() {
        System.out.println("=== Welcome to Texas Hold'em! ===");

        // Setup players
        addPlayers();

        // Deal hands
        System.out.println("\nDealing player hands...");
        table.dealToPlayers();
        table.showPlayersHands();

        // Deal community cards in phases
        pause("Dealing the Flop...");
        table.dealFlop();
        table.showCommunityCards();

        pause("Dealing the Turn...");
        table.dealTurn();
        table.showCommunityCards();

        pause("Dealing the River...");
        table.dealRiver();
        table.showCommunityCards();

        System.out.println("\nRound complete!");
        System.out.println("Now would come betting and hand evaluation (next step).");
    }

    private void addPlayers() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of players (2–6): ");
        int numPlayers = input.nextInt();
        input.nextLine(); // consume newline
        
        for (int i = 1; i <= numPlayers; i++) {
            System.out.print("Enter player " + i + " name: ");
            String name = input.nextLine();
            table.addPlayer(new Player(name));
        }
    }

    private void pause(String message) {
        System.out.println("\n" + message);
        try {
            Thread.sleep(1000); // small delay for realism
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        TexasHoldemGame game = new TexasHoldemGame();
        game.startGame();
    }
}
