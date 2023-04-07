package com.skilldistillery.blackjack.entities;

public enum Rank {
TWO(2, "Two"), 
THREE(3, "Three"), 
FOUR(4, "Four"), 
FIVE(5, "Five"), 
SIX(6, "Six"), 
SEVEN(7, "Seven"), 
EIGHT(8, "Eight"), 
NINE(9, "Nine"), 
TEN(10, "Ten"), 
JACK(10, "Jack"), 
QUEEN(10, "Queen"), 
KING(10, "King"), 
ACE(11, "Ace");
	private int rank;
	private String nickName;
	
	Rank(int rank){
		this.rank = rank;	
	}
	
	Rank(int rank, String nickName){
		this.rank= rank;
		this.nickName = nickName;
	}
	@Override
	public String toString() {
		return nickName;
	}
	public int getValue() {
		return rank;
	}
}
