package org.dhbw.tinf17a.snailsPaceRace;

public class Snail {

	private Color color;
	private int position;
	
	public Snail(Color color) {
		this.color = color;
		this.position = 0;
	}
	
	public Color getColor() {
		return this.color;
	}
	public int getPosition() {
		return this.position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	
	
	public void walk() {
		this.position++;
	}
	
	
	
}
