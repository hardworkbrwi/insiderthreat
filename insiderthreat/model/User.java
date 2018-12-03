package model;

public class User {
	private String name;
	private String id;
	private String domain;
	private String email;
	private String role;
	private Observant threat;
	private Observant normal;
	private Observant current;
	
	public User (){
		this.name = "";
		this.id = "";
		this.domain = "";
		this.email = "";
		this.role = "";
		this.role = "";
		this.threat = new Observant();
		this.normal = new Observant();
		this.current = new Observant();
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
	
	/**
	 * @return the threat
	 */
	public Observant getThreat() {
		return threat;
	}

	/**
	 * @return the normal
	 */
	public Observant getNormal() {
		return normal;
	}

	/**
	 * @return the current
	 */
	public Observant getCurrent() {
		return current;
	}

	/**
	 * @param threat the threat to set
	 */
	public void setThreat(Observant threat) {
		this.threat = threat;
	}

	/**
	 * @param normal the normal to set
	 */
	public void setNormal(Observant normal) {
		this.normal = normal;
	}

	/**
	 * @param current the current to set
	 */
	public void setCurrent(Observant current) {
		this.current = current;
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
