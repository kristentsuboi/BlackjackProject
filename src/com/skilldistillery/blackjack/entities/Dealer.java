package com.skilldistillery.blackjack.entities;

public class Dealer extends Player {
//	private List<Card> deck = new ArrayList<>();

	private Deck deck = new Deck();

	public Dealer() {
	}

	public String displayHiddenCard() {
		String hiddenCard = "Hidden card: " + hand.getHand().get(1).toString();
		return hiddenCard;
	}

	public void dealerHandLogic() {
		while (hand.getHandValue() < 17) {
			hand.addCard(deck.dealCard());
		}
		System.out.println("The dealer hand: ");
		displayDealerHand();
		System.out.println("The value of the dealer's hand is: " + hand.getHandValue());
	}

	public void displayDealerHand() {
		System.out.println(hand.getHand().toString());
	}

	public void shuffle() {
		deck.shuffle();
	}

	public int checkSize() {
		return deck.checkSize();
	}

	public Card dealCard(Hand hand) {
		// TODO Auto-generated method stub
		return deck.dealCard(hand);
	}

	public Card dealCard() {
		return deck.dealCard();
	}

	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}

}
