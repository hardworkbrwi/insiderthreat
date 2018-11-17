package model;

public class User extends Node {
	private String name;
	private String id;
	private String domian;
	private String email;
	private String role;
	
	public User (){
		this.down = new Observant();
		this.left = new Observant();
		this.right = new Observant();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDomian() {
		return domian;
	}

	public void setDomian(String domian) {
		this.domian = domian;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
}
