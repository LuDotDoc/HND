package Pontoon;

import java.util.Scanner;

/*************************************************************************
 *                           Luke Docwra 17019043                         *
 *                             2020 HND Tutorial                          *
 *                               Pontoon                          *
 *************************************************************************/

public class Game {

    private Player player;
    private Deck deck;

    /**
     * Create a new game.
     */
    public Game() {
        this.player = new Player(); // Init player field.
    }

    /**
     * Ask for a new card from the user.
     * @return
     */
    public boolean askNewCard() {
        System.out.println(this.deck);

        System.out.print("Do you want another card? (Y)es (N)o : ");
        String input = this.player.getInput();

        return input.equalsIgnoreCase("y");
    }

    /**
     * Runs the game.
     */
    public void run() {
        this.deck = new Deck();

        // Add two new cards
        this.deck.addCard(new Card());
        this.deck.addCard(new Card());

        boolean choice = this.askNewCard();

        while(choice)
        {
            Card newCard = new Card();
            deck.addCard(newCard);

            System.out.println("You drew " + newCard);
            System.out.println("Card total is " + this.deck.getTotal());
            System.out.print("Do you want another card? (Y)es (N)o : ");

            if (this.deck.getTotal() > 21)
            {
                break; // break the loop if we've lost already
            }

            String input = this.player.getInput();
            choice = input.equalsIgnoreCase("y");
        }

        System.out.println("Total is " + this.deck.getTotal());

        if (this.deck.getTotal() > 21)
        {
            System.out.println("You're bust");
        }
        if (this.deck.getTotal() > 19 && this.deck.getTotal() <= 21)
        {
            System.out.println("You have won!");
        }
        else
        {
            System.out.println("You have lost");
        }
    }
}

                                                                           
