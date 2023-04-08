package com.skilldistillery.blackjack.app;

import java.util.Collections;
import java.util.Scanner;

import com.skilldistillery.blackjack.entities.BlackjackHand;
import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Deck;
import com.skilldistillery.blackjack.entities.Player;

public class BlackjackApp {

	Deck deck = new Deck();
	Player player = new Player();
	Dealer dealer = new Dealer();
	Card card = new Card();
	BlackjackHand playerHand = new BlackjackHand();
	BlackjackHand dealerHand = new BlackjackHand();

	public static void main(String[] args) {
		BlackjackApp bja = new BlackjackApp();
		bja.launch();

	}

	public void launch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the game of blackjack!");
	
		deck.shuffle();
		dealingCards();
		System.out.println("Dealer top card: " + dealerHand.showOneCard() ) ;
		System.out.println(playerHand.toString());
		System.out.println("The value of your hand is: " + playerHand.getHandValue());
		System.out.println("Would you like to hit or stay? ");
		String input = sc.nextLine();
		if (input.equals("hit")) {
			playerHand.addCard(deck.dealCard());
			System.out.println(playerHand.getHand().toString());
			System.out.println("The value of your hand is: " + playerHand.getHandValue());
			System.out.println("Would you like to hit or stay? ");
			input = sc.nextLine();
			if (input.equals("stay")) {
				System.out.println(dealerHand.getHand().toString());
				System.out.println("The dealer has a value of " + dealerHand.getHandValue());
				if (dealerHand.getHandValue() < 17) {
					dealerHand.addCard(deck.dealCard());
					System.out.println(dealerHand.getHand().toString());
					System.out.println("The dealer has a value of " + dealerHand.getHandValue());
					
				}
			} else if (input.equals("hit")) {
				playerHand.addCard(deck.dealCard());
				System.out.println(playerHand.getHand().toString());
				System.out.println("The value of your hand is: " + playerHand.getHandValue());
				System.out.println("Would you like to hit or stay? ");
				input = sc.nextLine();
				if (input.equals("stay")) {
					System.out.println(dealerHand.getHand().toString());
					System.out.println("The dealer has a value of " + dealerHand.getHandValue());
					if (dealerHand.getHandValue() < 17) {
						dealerHand.addCard(deck.dealCard());
						System.out.println(dealerHand.getHand().toString());
						System.out.println("The dealer has a value of " + dealerHand.getHandValue());
				}
			}}
		// dealer will deallll
		// determine winner
		determineWinner();
	}


	}

	private void dealingCards() {
		playerHand.addCard(deck.dealCard());
		dealerHand.addCard(deck.dealCard());
		playerHand.addCard(deck.dealCard());
		dealerHand.addCard(deck.dealCard());
		
	}

	public String determineWinner() {
		if (dealerHand.getHandValue() > playerHand.getHandValue() && dealerHand.getHandValue() <= 21) {
			return "The dealer wins.";
		} else if (dealerHand.getHandValue() < playerHand.getHandValue() && playerHand.getHandValue() <= 21) {
			return "The player wins.";
		} else {
			return "You have tied with the dealer...";
		}
	}
}
