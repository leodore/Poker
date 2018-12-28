
public class Hand {
	Card[] a;
	Hand() {
		a = new Card[2];
	}
	public void add(Card card) {
		if(a[0] == null) {
			a[0] = card;
		}
		else
			a[1] = card;
	}
	public String toString() {
		String hand = "";
		String card1, card2;
		card1 = a[0].stats();
		card2 = a[1].stats();
		hand += card1 + ", " + card2;
		return hand;
	}
}
