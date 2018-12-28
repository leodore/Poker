import java.util.ArrayList;

public class Deck {
	ArrayList<Card> a;
	Card[] board = new Card[5];
	int turn = 0;
	Deck() {
		a = new ArrayList<Card>();
		for(int i = 0; i < 4; i++) {
			for(int x = 1; x < 14; x++) {
				a.add(new Card(i, x));
			}
		}
	}
	Deck(Deck other){
		a = new ArrayList<Card>();
		for(int i = 0; i < other.a.size(); i++) {
			a.add(other.a.get(i));
		}
	}
	public Card card(int val) {
		Card card = new Card(a.get(val));
		return card;
	}
	public void shuffle() {
		ArrayList<Card> b = new ArrayList<Card>();
		for(int i = 0; i < 52; i++) {
			int num = (int) (Math.random()*a.size());
			b.add(a.remove(num));
		}
		a.clear();
		for(Card card : b) {
			a.add(card);
		}
	}
//	public void deal() {
//		Hand P1 = new Hand();
//		Hand P2 = new Hand();
//		P1.add(a.remove(0));
//		P2.add(a.remove(0));
//		P1.add(a.remove(0));
//		P2.add(a.remove(0));
//	}
	public void board() {
		
		if(turn == 0) { //flop
			for(int i = 0; i < 3; i++) {
				a.remove(0); //burn
				board[i] = a.remove(0); //show flop
				turn++;
			}
		}
		else if(turn == 1) { //turn
			a.remove(0); //burn
			board[3] = a.remove(0); //show turn
			turn++;
		}
		else { //river
			a.remove(0); //burn
			board[4] = a.remove(0); //
			turn++;
		}
	}
	
}
