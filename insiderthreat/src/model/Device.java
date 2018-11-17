package model;

public class Device extends Node {
	private String id;
	
	public Device() {
		this.left = null;
		this.right = null;
		this.down = null;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
