package model;

public class Role {
	
	String nameRole;
	int [] histogram;
	int numberEmployees;

	public Role() {
		nameRole = "";
		numberEmployees = 0;
		histogram = new int[24];
	}	

	/**
	 * @return the nameRole
	 */
	public String getNameRole() {
		return nameRole;
	}
	
	/**
	 * @param nameRole the nameRole to set
	 */
	public void setNameRole( String nameRole ) {
		this.nameRole = nameRole;
	}

	/**
	 * @return the histogram
	 */
	public int[] getHistogram() {
		return histogram;
	}

	/**
	 * @param histogram the histogram to set
	 */
	public void setHistogram( int[] histogram ) {
		this.histogram = histogram;
	}
	
	public int getValueIndex( int index ) throws IndexOutOfBoundsException {
		if( index < 0 || index > 23 ) {
			throw new IndexOutOfBoundsException();
		} else {
			return histogram[ index ];
		}	
	}
	
	public void setValueIndex( int index ) throws IndexOutOfBoundsException {
		if( index < 0 || index > 23 ) {
			throw new IndexOutOfBoundsException();
		} else {
			histogram[ index ] = ( histogram[ index ] + 1 ) / numberEmployees;
		}		
	}

	/**
	 * @return the numberEmployees
	 */
	public int getNumberEmployees() {
		return numberEmployees;
	}
	
	public void addEmployee() {
		numberEmployees += 1;
	}

}
