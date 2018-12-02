package control;

import java.io.File;
import java.io.FileFilter;
import java.nio.file.DirectoryStream.Filter;
import java.util.List;

import model.Data;
import model.User;

public class HandlerDate {
	
	Data data;

	public HandlerDate() {
		data = new Data();
	}
	
	public void readDate() throws Exception{
		File path = new File("./logs");
		File[] files = path.listFiles();
		for( File f : files ) {
			if( f.getName().contains(".csv") ) {
				System.out.println( "Executando " + f.getName() );
				data.loadFile( f );
				System.out.println( "Arquivo " + f.getName() + " carregado com sucesso" );
			}
		}
		//System.out.println(data.getUsers().indexOf("BMS0001"));
		//System.out.println(findUser("BMS0001"));
	}
	
	public void buildTree() {
		
		System.out.println(data.getLogons().get(0).getUser());
		System.out.println(data.getLogons().get(0).getPc());
		
	}
	
	private int findUser( String codeUser ) {
		int index = -1;
		List<User> users = data.getUsers(); 
		for( User u : users ) {
			System.out.println(u.getId() + " = " + codeUser +"?");
			if( u.getId().equals(codeUser) ){
				
				index = data.getUsers().indexOf(u);
			}
		}
		return index;
	}

	/**
	 * @return the data
	 */
	public Data getData() {
		return data;
	}
	
	

}
