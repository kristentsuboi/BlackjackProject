package com.skilldistillery.blackjack.entities;

public class Player {

	protected BlackjackHand hand = new BlackjackHand();

	public Player() {
	}

	public void addCard(Card card) {
		hand.addCard(card);
	}

	public BlackjackHand getHand() {
		return hand;
	}

	public void setHand(BlackjackHand hand) {
		this.hand = hand;
	}

	@Override
	public String toString() {
		return "Player [hand=" + hand + "]";
	}

	public BlackjackHand playersHand(Card card) {
		hand.addCard(card);
		return hand;
	}
}
