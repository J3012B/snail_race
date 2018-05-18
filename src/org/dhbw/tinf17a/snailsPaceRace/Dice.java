package org.dhbw.tinf17a.snailsPaceRace;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
	
	public int roll() {
		int randomNum = ThreadLocalRandom.current().nextInt(0, 5+1);
		
		return randomNum;
	}
}
