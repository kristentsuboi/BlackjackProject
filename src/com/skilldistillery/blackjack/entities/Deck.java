package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> deck = new ArrayList<>();

	public Deck() {
		Rank[] ranks = Rank.values();
		Suit[] suits = Suit.values();

		for (Suit suit : suits) {
			for (Rank rank : ranks) {
				Card card = new Card(suit, rank);
				deck.add(card);
			}
		}

	}
	public List<Card> getDeck() {
		return deck;
	}



	public void shuffle() {
		Collections.shuffle(deck);
	}

	public Card dealCard() {
		Card dealtCard = deck.remove(0);
		return dealtCard;
		
	}
	public int checkSize() {
		return deck.size();
	}
}
