package model;
import java.util.ArrayList;
import java.util.List;


public class Observant extends Node {
	private int histogram[];
	private List<Node> device;
	
	public Observant() {
		this.histogram = new int[24];
		this.device = new ArrayList<Node>();
		
		this.left = null;
		this.right = null;
		this.down = null;
		
		for(int i = 0; i < 23; i++) {
			this.histogram[i] = 0;
		}
	}
	
	public void putDevice( Node device ) {
		this.device.add( device );
	}
}
