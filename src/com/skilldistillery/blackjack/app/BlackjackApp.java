package com.skilldistillery.blackjack.app;

import java.util.Scanner;
import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Player;

public class BlackjackApp {
	Player player = new Player();
	Dealer dealer = new Dealer();
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BlackjackApp bja = new BlackjackApp();
		bja.launch();
	}

	public void launch() {
		System.out.println("Welcome to the game of blackjack!");
		System.out.println("The dealer will hit on anything below 17...");
		System.out.println("");
		dealer.shuffle();
		runGameLoop();
	}

	public void runGameLoop() {
		boolean isRunning = true;
		do {
			dealingCards();
			if (player.getHand().getHandValue() == 21) {
				System.out.println("Congrats, you have  blackjack!");
				determineWinner();
			} else if (dealer.getHand().getHandValue() == 21) {
				System.out.println("Dealer has blackjack!");
				determineWinner();
			} else {
				do {
					System.out.println("Would you like to hit or stay? enter 'quit' to quit");
					String input = sc.nextLine();
					if (input.equals("quit")) {
						System.out.println("You are exiting the program....");
						isRunning = false;
						break;
					} else if (input.equals("stay")) {
						dealer.dealerHandLogic();
						determineWinner();
						break;
					} else if (input.equals("hit")) {
						hit();
						if (player.getHand().isBust() == true) {
							System.out.println("You have busted....");
							determineWinner();
						} else if (player.getHand().isBlackjack() == true) {
							System.out.println("Blackjack!");
							determineWinner();
						}
					}
				} while (player.getHand().getHandValue() < 21);
			}
			player.getHand().clearHand();
			dealer.getHand().clearHand();
			if (dealer.getDeck().checkSize() < 7) {
				System.out.println("We have ran out of cards.... Thank you for playing...");
				break;
			}
		} while (isRunning == true);
	}

	private void dealingCards() {
		player.playersHand(dealer.dealCard());
		dealer.playersHand(dealer.dealCard());
		player.playersHand(dealer.dealCard());
		dealer.playersHand(dealer.dealCard());
		System.out.println("Dealer top card: " + dealer.getHand().showOneCard());
		System.out.println(player.getHand().toString());
		System.out.println("The value of your hand is: " + player.getHand().getHandValue());
	}

	public void determineWinner() {
		if (dealer.getHand().getHandValue() > player.getHand().getHandValue()
				&& dealer.getHand().getHandValue() <= 21) {
			System.out.println("The dealer wins.\n");
		} else if (dealer.getHand().getHandValue() < player.getHand().getHandValue()
				&& player.getHand().getHandValue() <= 21) {
			System.out.println("The player wins. \n");
		} else if (dealer.getHand().getHandValue() > 21) {
			System.out.println("Dealer has busted, player wins.\n");
		} else if (player.getHand().getHandValue() > 21) {
			System.out.println("Player has busted, dealer wins.\n");
		} else {
			System.out.println("You have tied with the dealer...\n");
		}
	}

	public void hit() {
		player.playersHand(dealer.dealCard());
		System.out.println(player.getHand().toString());
		System.out.println("The value of your hand is: " + player.getHand().getHandValue());
	}
}
