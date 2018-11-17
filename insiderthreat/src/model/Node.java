package model;

public abstract class Node {
	
	protected Node left;
	protected Node right;
	protected Node down;
	
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	public Node getDown() {
		return down;
	}
	public void setDown(Node down) {
		this.down = down;
	}
	
	
}
