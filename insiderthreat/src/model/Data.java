package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Data {
	private List<Http> https;
	private List<MFlash> mflashs;
	private List<Logon> logons;
	private List<User> users;

	public Data() {
		https = new ArrayList<Http>();
		mflashs = new ArrayList<MFlash>();
		logons = new ArrayList<Logon>();
		users = new ArrayList<User>();
	}
	
	public void loadFileHttp() {
	
		try {
			// instancia leitor de arquivo
			FileReader file = new FileReader( "/home/bruno/Documentos/BTI/LP2/projetoUnid3/http.csv" );
			BufferedReader readFile = new BufferedReader( file );
			// instancia objeto http
			Http http = new Http();
			// captura primeira linha (cabeçalho)
			String line = readFile.readLine();
			String[] peaces = line.split( "," );
						
			do {
				// próxima linha
				line = readFile.readLine();
				// quebra string em partes baseada em ','
				if(line != null) {
					peaces = line.split( "," );
				}
				
				// Muda status do campos de um objeto Http
				http.setId( peaces[0] );
				http.setDate( peaces[1] );
				http.setUser( peaces[2] );
				http.setPc( peaces[3] );
				http.setUrl( peaces[4] );
				
				// http.printInfo();
				
				// adiciona a lista de URLs
				https.add( http );
				
				//https.get( 0 ).printInfo();
				//index++;
				
			} while ( line != null );
			
			System.out.println( https.size() );
			
			readFile.close();
		} catch (IOException e) {
			System.err.printf("Erro ao tentar abrir o arquivo: %s.\n,"
					+ e.getMessage());
		}
	}
	
	public void loadFileMflash() {
		
		try {
			// instancia leitor de arquivo
			FileReader file = new FileReader( "/home/bruno/Documentos/BTI/LP2/projetoUnid3/device.csv" );
			BufferedReader readFile = new BufferedReader( file );
			// instancia objeto mflash
			MFlash mflash = new MFlash();
			// captura primeira linha (cabeçalho)
			String line = readFile.readLine();
			String[] peaces = line.split( "," );
						
			do {
				// próxima linha
				line = readFile.readLine();
				// quebra string em partes baseada em ','
				if(line != null) {
					peaces = line.split( "," );
				}
				
				// Muda status dos campos de um objeto MFlash
				mflash.setId( peaces[0] );
				mflash.setDate( peaces[1] );
				mflash.setUser( peaces[2] );
				mflash.setPc( peaces[3] );
				mflash.setConect( peaces[4] );
				
				// adiciona a lista de Dispositivos
				mflashs.add( mflash );
				
				//mflashs.get( 0 ).printInfo();
				//index++;
				
			} while ( line != null );
			
			System.out.println( mflashs.size() );
			
			readFile.close();
		} catch (IOException e) {
			System.err.printf("Erro ao tentar abrir o arquivo: %s.\n,"
					+ e.getMessage());
		}
	}
	
	public void loadFileLogon() {
			
			try {
				// instancia leitor de arquivo
				FileReader file = new FileReader( "/home/bruno/Documentos/BTI/LP2/projetoUnid3/logon.csv" );
				BufferedReader readFile = new BufferedReader( file );
				// instancia objeto Logon
				Logon logon = new Logon();
				// captura primeira linha (cabeçalho)
				String line = readFile.readLine();
				String[] peaces = line.split( "," );
							
				do {
					// próxima linha
					line = readFile.readLine();
					// quebra string em partes baseada em ','
					if(line != null) {
						peaces = line.split( "," );
					}
					
					// Muda status dos campos de um objeto Logon
					logon.setId( peaces[0] );
					logon.setDate( peaces[1] );
					logon.setUser( peaces[2] );
					logon.setPc( peaces[3] );
					logon.setAccess( peaces[4] );
					
					// adiciona a lista de Dispositivos
					logons.add( logon );
					
					//logons.get( 0 ).printInfo();
					//index++;
					
				} while ( line != null );
				
				System.out.println( logons.size() );
				
				readFile.close();
			} catch (IOException e) {
				System.err.printf("Erro ao tentar abrir o arquivo: %s.\n,"
						+ e.getMessage());
			}
		}
	
	public void loadFileUser() {
		
		try {
			// instancia leitor de arquivo
			FileReader file = new FileReader( "/home/bruno/Documentos/BTI/LP2/projetoUnid3/LDAP.csv" );
			BufferedReader readFile = new BufferedReader( file );
			// instancia objeto User
			User user = new User();
			// captura primeira linha (cabeçalho)
			String line = readFile.readLine();
			String[] peaces = line.split( "," );
						
			do {
				// próxima linha
				line = readFile.readLine();
				// quebra string em partes baseada em ','
				if(line != null) {
					peaces = line.split( "," );
				}
				
				// Muda status dos campos de um objeto User
				user.setName( peaces[0] );
				user.setId( peaces[1] );
				user.setDomain( peaces[2] );
				user.setEmail( peaces[3] );
				user.setRole( peaces[4] );
				
				// adiciona a lista de Dispositivos
				users.add( user );
				
				users.get( 0 ).printInfo();
				//index++;
				
			} while ( line != null );
			
			System.out.println( users.size() );
			
			readFile.close();
		} catch (IOException e) {
			System.err.printf("Erro ao tentar abrir o arquivo: %s.\n,"
					+ e.getMessage());
		}
	}
}
