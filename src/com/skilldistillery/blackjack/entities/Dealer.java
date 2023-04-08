package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public class Dealer extends Player {
//	private List<Card> deck = new ArrayList<>();
	private List<Card> dealerHand = new ArrayList<>();
	
	public Dealer() {
		
	}
	public Dealer(BlackjackHand hand) {
		super(hand);
		// TODO Auto-generated constructor stub
	}
	
	public String displayDealerHand() {
		String hiddenCard = "Hidden card: " + dealerHand.get(0).toString();
		return hiddenCard;
	}
	


	
}
