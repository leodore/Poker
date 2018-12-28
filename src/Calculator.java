import java.util.Scanner;

public class Calculator {
	public enum preflop {RAISE, CALL, FOLD}
	public enum postflop {RAISE, BET, CALL, CHECK, FOLD}
	public enum bb {RAISE, CHECK, FOLD}

	static Deck deck = new Deck();
	static Hand P1 = new Hand();
	static Hand P2 = new Hand();
	public static void deal() {
		P1.add(deck.a.remove(0));
		P2.add(deck.a.remove(0));
		P1.add(deck.a.remove(0));
		P2.add(deck.a.remove(0));
	}
	public static void start() {
		boolean valid = false;
		Scanner a = new Scanner(System.in);
		preflop move;
		int val;
		//dealer
		deck.shuffle();
		deal();
		
		//your move
		System.out.println("Your hand: " + P1);
		System.out.print("Your move? ");
		do {
			try {
				move = preflop.valueOf(a.next());
				if(move.equals(preflop.RAISE)) {
					System.out.println("How much? ");
					val = a.nextInt();
					System.out.println("You raised $" + val + ".");
				}
				else if(move.equals(preflop.CALL)) {
					System.out.println("You called.");
				}
				else if(move.equals(preflop.FOLD)) {
					System.out.println("You folded.");
				}
			} catch(Exception e) {
				System.out.println("Try again pls.");
				System.out.print("Your move? ");
			}
			
		}while(valid == false);
		
		

		a.close();
	}
	public static void main(String[] args) {	
		start();
	}
}
