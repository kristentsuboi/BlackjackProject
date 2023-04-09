package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	List<Card> hand = new ArrayList<>();

	public Hand() {
	}

	public Hand(List<Card> hand) {
		this.hand = hand;
	}

	public void addCard(Card card) {
		hand.add(card);
	}

	public void clearHand() {
		hand.clear();
	}

	public abstract int getHandValue();

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("hand=");
		builder.append(hand);
		return builder.toString();
	}

	public String showOneCard() {
		String showOneCard = hand.get(0).toString();
		return showOneCard;
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
}
