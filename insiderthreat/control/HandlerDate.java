package control;

import java.io.File;
import java.io.FileFilter;
import java.nio.file.DirectoryStream.Filter;
import java.util.List;

import model.Activity;
import model.Data;
import model.Device;
import model.Http;
import model.Logon;
import model.MFlash;
import model.Observant;
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
		
		int indexUser;
		int time;
		String idDevice;
		int indexDevice;
		int lastDevice;
		
		// Captura a lista de atividades a ser processada
		List<Logon> acts = data.getLogons();
		
		
		
		for( Logon act : acts ) {
			
			// Busca o usuário pelo id contido na atividade a fim de encontrar sua posição na lista
			indexUser = findUser( act.getUser().split("/")[1] );
			// Captura a hora de execução da atividade
			time = Integer.parseInt(act.getDate().split(" ")[1].split(":")[0]);
			
			//System.out.println(time);
			// incrementa o contador de atividades do observador do usuário
			data.getUsers().get( indexUser ).getCurrent().addActivityHistogram( time );
			
			// Busca o dispositivo usado na atividade
			indexDevice = findDevice( indexUser , act.getPc() );
			if( indexDevice == -1 ) {
				// Se dispositivo ainda não foi cadastrado, adiciona um novo dispositivo
				Device dev = new Device();
				dev.setId( act.getPc() );
				data.getUsers().get( indexUser ).getCurrent().putDevice( dev );
				// Atribui o valor da última posição de dispositivo adicionada
				indexDevice = data.getUsers().get( indexUser ).getCurrent().getDevices().size() - 1;				
			}
			// Adiciona a atividade ao usuário baseado no índice do dispositivo
			data.getUsers().get( indexUser ).getCurrent().getDevices().get( indexDevice ).addActivity( act );			
		}
		
		int[] hist = data.getUsers().get(0).getCurrent().getHistogram();
		for(int val : hist) {
			System.out.print(val + " ");
		}
	}
	
	private int findUser( String codeUser ) {
		int index = -1;
		List<User> users = data.getUsers(); 
		for( User u : users ) {
			//System.out.println(u.getId() + " = " + codeUser +"?");
			if( u.getId().equals( codeUser ) ){
				
				index = data.getUsers().indexOf( u );
				break;
			}
		}
		return index;
	}
	
	private int changeTime( String time ) {
		
		if( time.charAt(0) == '0') {
			return (int) time.charAt(1);
		} else {
			return Integer.parseInt(time);
		}
	}
	
	private int findDevice( int idUser, String idDevice ) {
		
		int index = -1;
		List<Device> devices = data.getUsers().get(idUser).getCurrent().getDevices(); 
		for( Device d : devices ) {
			//System.out.println(u.getId() + " = " + codeUser +"?");
			if( d.getId().equals( idDevice ) ){
				
				index = data.getUsers().get( idUser ).getCurrent().getDevices().indexOf( d );
				break;
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
