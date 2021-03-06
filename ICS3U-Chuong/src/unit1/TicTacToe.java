package unit1;

/**
 * TicTacToe.java
 * @author Linda Chuong
 * Create a TicTacToeBoard application
 * Sept 30, 2021
 */
public class TicTacToe {
	
	/**
	 * @param args
	 */

	public TicTacToe() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.printf("%-20s %s\n", "         |", "|");
		System.out.printf("%-20s %s\n", "         |", "|");
		System.out.printf("%-20s %s\n", "         |", "|");
		System.out.println("--------------------------------");
		System.out.printf("%-20s %s\n", "         |", "|");
		System.out.printf("%-10s %s\n", "         |", "    X     |");
		System.out.printf("%-20s %s\n", "         |", "|");
		System.out.println("--------------------------------");
		System.out.printf("%-20s %s\n", "         |", "|");
		System.out.printf("%-20s %s\n", "         |", "|");
		System.out.printf("%-20s %s\n", "         |", "|");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Tic Tac Toe Rules");
		System.out.println();
		System.out.println("Tic Tac Toe is a game for 2 players.");
		System.out.println();
		System.out.println("1. A grid of 9 squares is drawn");
		System.out.println();
		System.out.println("2. The first player draws an X in an empty square.");
		System.out.println();
		System.out.println("3. The second player draws an O in an empty square.");
		System.out.println();
		System.out.println("4. Steps 2 and 3 are repeated until a Tic Tac Pattern is created:");
		System.out.println();
		System.out.println("	Patterns can be diagonal, horizontal, or vertical.");
		System.out.println();
		System.out.println("5. A winning pattern is completed by drawing a line through the pattern.");
	}

}
