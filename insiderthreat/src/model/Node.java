package model;

public abstract class Node {
	
	protected Node left;
	protected Node right;
	protected Node down;
	
	protected Node getLeft() {
		return left;
	}
	protected void setLeft(Node left) {
		this.left = left;
	}
	protected Node getRight() {
		return right;
	}
	protected void setRight(Node right) {
		this.right = right;
	}
	protected Node getDown() {
		return down;
	}
	protected void setDown(Node down) {
		this.down = down;
	}
	
	
}
