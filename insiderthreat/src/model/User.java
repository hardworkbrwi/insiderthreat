package model;

public class User extends Node {
	private String name;
	private String id;
	private String domain;
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

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
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
	
	public void printInfo() {
		System.out.println("INFORMAÇÕES:\n"
				   + "Nome:    " + name + "\n"
				   + "ID:      " + id + "\n"
				   + "Domínio: " + domain + "\n"
				   + "Email:   " + email + "\n"
				   + "Cargo:   " + role);
	}
	
}
