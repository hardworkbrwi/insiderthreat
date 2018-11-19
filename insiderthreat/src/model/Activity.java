package model;

public class Activity extends Node {
	
	protected String id;
	protected String date;
	protected String user;
	protected String pc;

	public Activity() {
		id = "";
		date = "";
		user = "";
		pc = "";
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return the pc
	 */
	public String getPc() {
		return pc;
	}

	/**
	 * @param pc the pc to set
	 */
	public void setPc(String pc) {
		this.pc = pc;
	}
	
	public void printInfo() {
		System.out.println("INFORMAÇÕES:\n"
				   + "ID:      " + id + "\n"
				   + "Data:    " + date + "\n"
				   + "Usuário: " + user + "\n"
				   + "PC:      " + pc);
	}
}
