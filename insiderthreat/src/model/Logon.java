package model;

public class Logon extends Activity {

	String access;

	public Logon() {
		access = "";
	}	

	/**
	 * @return the access
	 */
	public String getAccess() {
		return access;
	}

	/**
	 * @param access the access to set
	 */
	public void setAccess(String access) {
		this.access = access;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Acessado:     " + access + "\n");
	}
}
