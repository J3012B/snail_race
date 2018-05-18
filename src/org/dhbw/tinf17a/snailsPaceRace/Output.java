package org.dhbw.tinf17a.snailsPaceRace;

/**
 * Utility class to "render" the game board.
 * @author Florian Krueger
 */
public class Output {

	/**
	 * Print one snail track to the console.
	 * @param position The current position of the snail.
	 * @param color The color of the snail.
	 */
	public static void printSnail(Snail snail) {
		System.out.print(Symbols.heartForColor(snail.getColor()) + " ");
		int i = 0;
		
		while (i < 10 && i < snail.getPosition()) {
			System.out.print("_ "); i++;
		}
		
		System.out.print(Symbols.SNAIL + " "); i++;
		
		while (i < 10) {
			System.out.print("_ "); i++;
		}
		
		System.out.println(Symbols.SALAD);
	}
	
}
