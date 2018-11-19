package model;

public class MFlash extends Activity {

	String conect;

	public MFlash() {
		conect = "";
	}	

	/**
	 * @return the conect
	 */
	public String getConect() {
		return conect;
	}

	/**
	 * @param conect the conect to set
	 */
	public void setConect(String conect) {
		this.conect = conect;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Conectado:     " + conect + "\n");
	}

}
