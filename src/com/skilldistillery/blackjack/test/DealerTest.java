package com.skilldistillery.blackjack.test;

import java.util.Scanner;

import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Deck;

public class DealerTest {

	public static void main(String[] args) {
		DealerTest dealer = new DealerTest();
		dealer.run();

	}
	public void run() {
		Deck deck = new Deck();
		deck.shuffle();
		System.out.println("Current number of cards in deck: " + deck.checkSize());
		Scanner sc = new Scanner(System.in);
		System.out.println("How many cards: ");
		int numCards = sc.nextInt();
		sc.nextLine();
		int sumOfCards = 0;
		for (int cardNumDealt = 0; cardNumDealt < numCards; cardNumDealt++) {
			Card dealtCard = deck.dealCard();
			sumOfCards += dealtCard.getRank().getValue();
			System.out.println("You now have: " + dealtCard + " sum of cards: " + sumOfCards + " " + deck.checkSize() + " cards left");
		}
		sc.close();
	}
	

}
