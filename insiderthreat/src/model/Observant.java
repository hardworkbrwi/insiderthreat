package model;

public class Observant extends Node {
	private int histogram[];
	
	public Observant() {
		this.histogram = new int[24];
		this.left = null;
		this.right = null;
		this.down = null;
		
		for(int i = 0; i < 23; i++) {
			this.histogram[i] = 0;
		}
	}
}
