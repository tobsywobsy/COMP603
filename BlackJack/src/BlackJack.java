import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class BlackJack {
    private class Card {
        String value;
        String type;

        Card(String value, String type) {
            this.value = value;
            this.type = type;
        }
        
        public String toString() {
            return value+ "-" + type;
        }
    }

    ArrayList<Card> deck;
    Random random = new Random(); //Shuffles the deck randomly

    BlackJack() {
        startGame();
    }

    public void startGame() {
        //Deck
        buildDeck();
        shuffleDeck();
    }

    public void buildDeck() {
        deck = new ArrayList<Card>();
        String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] types = {"C", "S", "H", "D"};

        for (int i = 0; i < types.length; i++) {
            for (int j = 0; j < values.length; j++) {
                Card card = new Card(values [j], types[i]);
                deck.add(card);
            }
        }

        System.out.println("Building Deck:");
        System.out.println(deck);
    }

    public void shuffleDeck() {
        for (int i = 0; i < deck.size(); i++) {
            int j =random.nextInt(deck.size());
            Card currentCard = deck.get(i);
            Card randomCard = deck.get(j);
            deck.set(i, randomCard);
            deck.set(j, currentCard);
        }

        System.out.println("Shuffled Deck:");
        System.out.println(deck);
    }
}
