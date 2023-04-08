package com.skilldistillery.blackjack.entities;

public class Player {

	BlackjackHand playerhand = new BlackjackHand();
	
	public Player() {
		
	}
	
	public Player(BlackjackHand hand) {
		this.playerhand = hand;
	}
}
