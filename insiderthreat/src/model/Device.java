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
	
	public void putDevice( Device device ) {
		if( this.right == null ) {
			this.right = device;
		}else {
			Node next = this.right.right;
			while( next.getRight() != null ) {
				next = next.right;
			}
			next.setRight( device );
		}
	}
}
