
public class Card {
	private int suit;
	/*
	 * 1, 2, 3, 4: spade, diamond, heart, club 
	 */
	private int val;
	Card() {
		suit = (int) (Math.random()*4);
		val = (int) (Math.random()*13) + 1;
	}
	Card(int suit, int val){
		this.suit = suit;
		this.val = val;
	}
	Card(Card other){
		suit = other.suit;
		val = other.val;
	}
	public String stats() {
		String a = "";
		if(val > 10 || val == 1) {
			if(val == 1)
				a +=  "A of ";
			else if(val == 11)
				a +=  "J of ";
			else if(val == 12)
				a +=  "Q of ";
			else
				a += "K of ";
		}
		else
			a += val + " of ";
		
		if(suit == 1)
			a+= "Spades";
		else if(suit == 2)
			a+= "Diamonds";
		else if(suit == 3)
			a+= "Hearts";
		else
			a+= "Clubs";
		return a;
	}
}
