package model;

/**
 * @author Cangaceiros, Inc.
 * @version 1.0
 * 
 * Classe que define as possíveis atividades executadas por um usuário no
 * sistema a partir do seu perfil.
 * */
public class Activity {
	
	protected String id; /** Identifica a atividade. */
	protected String date; /** Identifica a data e hora. */
	protected String user; /** Identifica o usuário. */
	protected String pc; /** Identifica o equipamento utilizado. */
	
	/**
	 * Construtor padrão da classe Activity responsável por 
	 * inicializar os atributos do objeto.
	 * */
	public Activity() {
		id = "";
		date = "";
		user = "";
		pc = "";
	}

	/**
	 * Obtém o id.
	 * @return o <code>String</code> especificando o id.
	 */
	public String getId() {
		return id;
	}

	/**
	 * Configura o id da atividade.
	 * @param id da atividade.
	 */
	public void setId( String id ) {
		this.id = id;
	}

	/**
	 * Obtém o data e hora do evento.
	 * @return o <code>String</code> especificando a data/hora.
	 */
	public String getDate() {
		return date;
	}

	/**
	 * Configura a data/hora da atividade.
	 * @param date data/hora da atividade.
	 */
	public void setDate( String date ) {
		this.date = date;
	}

	/**
	 * Obtém o usuário da atividade.
	 * @return o <code>String</code> especificando o usuário. 
	 */
	public String getUser() {
		return user;
	}

	/**
	 * Configura o usuário da atividade.
	 * @param user usuário da atividade.
	 */
	public void setUser( String user ) {
		this.user = user;
	}

	/**
	 * Obtém o equipamento utilizado na atividade.
	 * @return o <code>String</code> especificando o equipamento. 
	 */
	public String getPc() {
		return pc;
	}

	/**
	 * Configura o equipamento da atividade.
	 * @param pc equipamento da atividade.
	 */
	public void setPc( String pc ) {
		this.pc = pc;
	}
	
	/**
	 * Imprime na saída padrão as informações da atividade.
	 * */	
	protected void printInfo() {
		System.out.println("INFORMAÇÕES:\n"
				   + "ID:      " + id + "\n"
				   + "Data:    " + date + "\n"
				   + "Usuário: " + user + "\n"
				   + "PC:      " + pc);
	}
}
