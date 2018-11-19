package model;

public class Http extends Activity {

	String url;

	public Http() {
		url = "";
	}	

	/**
	 * @return the activity
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param activity the activity to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("URL:     " + url + "\n");
	}

}
