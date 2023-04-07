package com.skilldistillery.blackjack.entities;

public enum Suit {
	HEARTS("Hearts"), 
	SPADES("Diamonds"), 
	CLUBS("Clubs"), 
	DIAMONDS("Diamond");
	
	private String name;
	
	Suit(String theSuit) {
		this.name = theSuit;
	}
	@Override
	public String toString() {
		return name;
	}
	
	
	

}
