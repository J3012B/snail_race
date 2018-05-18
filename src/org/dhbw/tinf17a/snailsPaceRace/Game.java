package org.dhbw.tinf17a.snailsPaceRace;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	
	private static ArrayList<Snail> snails;
	private static boolean gameIsRunning;
	
	public static void main(String args[]) {
		
		Dice dice = new Dice();
		
		snails = new ArrayList<>();
		gameIsRunning = true;
		int round = 1;
		
		for (Color color : Color.values()) {
			Snail snail = new Snail(color);
			
			snails.add(snail);
		}
		
				
		while (gameIsRunning) {
			printBoard(round);
			
			awaitEnterKey("\n-- Press Enter to roll the dices! --");
			
			rollDices(dice);
			
			awaitEnterKey("\n-- Press Enter to show the board --");
			
			// check if snail has won
			for (int i = 0; i < snails.size(); i++) {
				Snail snail = snails.get(i);
				
				if (snail.getPosition() >= 9) {
					System.out.println(Symbols.heartForColor(snail.getColor()) + " " + Symbols.SNAIL + " has won!\n");
					snail.setPosition(9);
					gameIsRunning = false;
				}
			}
			
			round++;
		}
		
		// prints final board
		printBoard(round);
		
	}
	
	// Rolls the dices and lets snails walk
	private static void rollDices(Dice dice) {
		// roll dices
		int randomColor1 = dice.roll();
		int randomColor2 = dice.roll();
		
		System.out.println("The Colors are " + Symbols.heartForColor(Color.values()[randomColor1]) + " and " + Symbols.heartForColor(Color.values()[randomColor2]) + "!");
		
		Snail snail1 = snails.get(randomColor1);
		Snail snail2 = snails.get(randomColor2);
		
		snail1.walk();
		snail2.walk();
	}
	
	/* Prints current board */
	private static void printBoard(int round) {
		System.out.printf("Current round: %d\n\n", round);
		
		for (int i = 0;  i < snails.size(); i++) {
			Snail snail = snails.get(i);
			
			Output.printSnail(snail);
		}
	}
	
	/* Wait for a enter key press */
	private static void awaitEnterKey(String message) {
		System.out.println(message);
		
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
	
	}
	
	
}
