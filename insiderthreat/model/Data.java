package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Cangaceiros, Inc.
 * @version 1.0
 * @see model.Activity
 * @see java.io.BufferedReader
 * @see java.io.File
 * @see java.io.FileReader
 * @see java.io.IOException
 * @see java.util.ArrayList
 * @see java.util.List
 * 
 * Classe responsável por ler a base de dados e os arquivos de logs de atividades
 * que alimentam o sistema.
 * */
public class Data {
	
	private List<Http> https; /** Lista de atividades http. */
	private List<MFlash> mflashs; /** Lista de atividades mflash. */
	private List<Logon> logons; /** Lista de atividades logon. */
	private List<User> users; /** Lista de usuários do sistema. */

	/**
	 * Construtor padrão da classe Data responsável por 
	 * inicializar as listas de atividades e usuários.
	 * */
	public Data() {
		https = new ArrayList<Http>();
		mflashs = new ArrayList<MFlash>();
		logons = new ArrayList<Logon>();
		users = new ArrayList<User>();
	}
	

	/**
	 * Método responsável por ler e carregar no sistema os dados dos logs das
	 * atividades de acesso à páginas web.
	 * @deprecated
	 **/
	public void loadFileHttp() {
	
		try {
			// instancia leitor de arquivo
			FileReader file = new FileReader( "/home/bruno/Documentos/BTI/LP2/projetoUnid3/http.csv" );
			BufferedReader readFile = new BufferedReader( file );
			// instancia objeto http
			Http http = new Http();
			// captura primeira linha (cabeçalho)
			String line = readFile.readLine();
			// quebra linha em partes separadas pela vírgula
			String[] peaces = line.split( "," );
			
			/* inicia a estrutura de repetição a fim de percorrer todo o arquivo,
			   coletando as strings linha a linha.
			*/
			do {
				// lê a próxima linha
				line = readFile.readLine();
				/* verifica se o arquivo chegou ao final, ou seja, line recebe null.
				   caso contrário, quebra string em partes separadas por ','.
				*/
				if( line != null ) {
					peaces = line.split( "," );
				}
				
				/* Muda status dos campos do objeto Http, adicionando as partes
				   da String lida.
				*/
				http.setId( peaces[0] );
				http.setDate( peaces[1] );
				http.setUser( peaces[2] );
				http.setPc( peaces[3] );
				http.setUrl( peaces[4] );
				
				// http.printInfo();
				
				// adiciona o objeto Http em sua respectiva lista (https).
				https.add( http );
				
				//https.get( 0 ).printInfo();
				//index++;
				
			} while ( line != null );
			
			// Imprime na saída padrão a quantidade de itens da lista
			System.out.println( https.size() );
			
			// fecha o arquivo para evitar problemas de memória e segurança.
			readFile.close();
		} catch ( IOException e ) { // Para alguma falha na leitura do arquivo trata exceção IOException
			System.err.printf("Erro ao tentar abrir o arquivo: %s.\n,"
					+ e.getMessage());
		}
	}
	
	/**
	 * Método responsável por ler e carregar no sistema os dados dos logs das
	 * atividades de utilização de dispositivos flashdrives. 
	 * @deprecated
	 * */
	public void loadFileMflash() {
		
		try {
			// instancia leitor de arquivo
			FileReader file = new FileReader( "/home/bruno/Documentos/BTI/LP2/projetoUnid3/device.csv" );
			BufferedReader readFile = new BufferedReader( file );
			// instancia objeto mflash
			MFlash mflash = new MFlash();
			// captura primeira linha (cabeçalho)
			String line = readFile.readLine();
			
			// quebra linha em partes separadas pela vírgula
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
	
	/**
	 * Método responsável por ler e carregar no sistema os dados dos logs das
	 * atividades de logon. 
	 * @deprecated
	 * */
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
	
	/**
	 * Método responsável por ler e carregar no sistema os dados dos logs dos
	 * usuários. 
	 * @deprecated
	 * */
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
				
				//users.get( 0 ).printInfo();
				//index++;
				
			} while ( line != null );
			
			System.out.println( users.size() );
			
			readFile.close();
		} catch (IOException e) {
			System.err.printf("Erro ao tentar abrir o arquivo: %s.\n,"
					+ e.getMessage());
		}
	}

	/**
	 * Método responsável por ler e carregar no sistema os dados de logs das
	 * atividades ou usuários.
	 * 
	 * @param file Objeto File que recupera informações do arquivo de log
	 * @see java.io.File 
	 **/
	public void loadFile( File file ) throws Exception {
		// recupera o nome do arquivo desconsiderando o caminho absoluto
		String fileName = file.getName();
		//geram objetos Activity e User para serem usados posteriormente
		Activity act = null;
		User usr = null;
		
		/*
		/* identifica qual o arquivo de log será executado e inicializa os
		   objetos act ou usr.
		   Lança uma exceção caso o arquivo não exista
		
		if( fileName.equalsIgnoreCase( "http.csv" ) ) {
			act = new Http();
		} else if( fileName.equalsIgnoreCase( "device.csv" ) ) {
			act = new MFlash();
		} else if( fileName.equalsIgnoreCase( "logon.csv" ) ) {
			act = new Logon();
		} else if( fileName.equalsIgnoreCase( "LDAP.csv" ) ) {
			usr = new User();
		} else {
			//throw( new Exception() );
		}
		*/
	
		try {
			
			/* instancia leitor de arquivo passando como parâmetro o caminho
			   absoluto de file.
			*/
			FileReader reader = new FileReader( file.getAbsolutePath() );
			// instancia um buffer de stream-string para ler as linhas do arquivo
			BufferedReader readFile = new BufferedReader( reader );
			
			// captura primeira linha (cabeçalho)
			String line = readFile.readLine();
			// quebra linha em partes separadas pela vírgula
			String[] peaces = line.split( "," );
			
			/* inicia a estrutura de repetição, a fim de percorrer todo o arquivo,
			   coletando a string linha a linha.
			*/
			do {
				
				/* identifica qual o arquivo de log será executado e inicializa os
				   objetos act ou usr.
				   Lança uma exceção caso o arquivo não exista
				*/
				if( fileName.equalsIgnoreCase( "http.csv" ) ) {
					act = new Http();
				} else if( fileName.equalsIgnoreCase( "device.csv" ) ) {
					act = new MFlash();
				} else if( fileName.equalsIgnoreCase( "logon.csv" ) ) {
					act = new Logon();
				} else if( fileName.equalsIgnoreCase( "LDAP.csv" ) ) {
					usr = new User();
				} else {
					//throw( new Exception() );
				}
				
				// lê a próxima linha
				line = readFile.readLine();
				/* verifica se o arquivo chegou ao final, ou seja, line recebe null.
				   caso contrário, quebra string em partes separadas por ','.
				*/
				if( line != null ) {
					peaces = line.split( "," );
				}
				
				/* Muda status dos campos do objeto act ou usr, de acordo com o arquivo
				 * lido atualmente, adicionando as partes da String lida.
				*/				
				if( usr != null && act == null ) {
					// muda status dos campos de um objeto User
					usr.setName( peaces[0] );
					usr.setId( peaces[1] );
					usr.setDomain( peaces[2] );
					usr.setEmail( peaces[3] );
					usr.setRole( peaces[4] );
					
					// adiciona a lista de Usuários
					users.add( usr );
				} else if( usr == null && act != null ) {
					// muda status dos campos de um objeto Activity
					act.setId( peaces[0] );
					act.setDate( peaces[1] );
					act.setUser( peaces[2] );
					act.setPc( peaces[3] );
					
					/* identifica a instancia do objeto Activity, a fim de alterar
					   o conteúdo específico da classe e adiconar o objeto
					   a sua respectiva lista.
					*/
					if( act instanceof Http ) {
						((Http) act).setUrl( peaces[4] );
						https.add( (Http) act );
					} else if( act instanceof MFlash ) {
						((MFlash) act).setConect( peaces[4] );
						mflashs.add( (MFlash) act );
					} else {
						((Logon) act).setAccess( peaces[4] );
						logons.add( (Logon) act );
					}
				}
				
			} while ( line != null );
			
			// Imprime na saída padrão a quantidade de itens das listas
			System.out.println( "Tamanho Listas: \n"
					+ "HTTP: " + https.size() + "\n"
					+ "LOGON: " + logons.size() + "\n"
					+ "MFLASH: " + mflashs.size() + "\n"
					+ "USER: " + users.size());
			
			
			
			// fecha o arquivo para evitar problemas de memória e segurança.
			readFile.close();
		} catch ( IOException e ) { // Para alguma falha na leitura do arquivo trata exceção IOException
			System.err.printf("Erro ao tentar abrir o arquivo: \n"
					+ e.getMessage());
		}
	}

	/**
	 * Obtém a lista de atividades de acesso à páginas.
	 * @return <code>Http</code> especificando a lista de atividades Http.
	 */
	public List<Http> getHttps() {
		return https;
	}

	/**
	 * Obtém a lista de atividades de uso de dispositivos flashdrive.
	 * @return <code>MFlash</code> especificando a lista de atividades MFlash.
	 */
	public List<MFlash> getMflashs() {
		return mflashs;
	}

	/**
	 * Obtém a lista de atividades de logon de acesso.
	 * @return <code>Logon</code> especificando a lista de atividades Logon.
	 */
	public List<Logon> getLogons() {
		return logons;
	}

	/**
	 * Obtém a lista de usuários do sistema.
	 * @return <code>User</code> especificando a lista de usuário cadastrados no sistema.
	 */
	public List<User> getUsers() {
		return users;
	}
}
