package org.dhbw.tinf17a.snailsPaceRace;

public class Symbols {
	
	public static String SNAIL = "🐌"; 
	public static String SALAD = "🥗";
	public static String ORANGE_HEART = "🧡";
	public static String BLUE_HEART = "💙";
	public static String PURPLE_HEART = "💜";
	public static String GREEN_HEART = "💚";
	public static String YELLOW_HEART = "💛";
	public static String BLACK_HEART = "🖤";
	
	public static String heartForColor(Color color) {
		switch (color) {
		case ORANGE: return ORANGE_HEART;
		case BLUE: return BLUE_HEART;
		case PURPLE: return PURPLE_HEART;
		case GREEN: return GREEN_HEART;
		case YELLOW: return YELLOW_HEART;
		default: return BLACK_HEART;
		}
	}
	
}
