package model;
import java.util.ArrayList;
import java.util.List;


public class Observant {
	private int histogram[];
	private List<Device> devices;
	
	public Observant() {
		this.histogram = new int[24];
		this.devices = new ArrayList<Device>();
				
		for(int i = 0; i < 23; i++) {
			this.histogram[i] = 0;
		}
	}
	
	public void putDevice( Device device ) {
		this.devices.add( device );
	}
}
