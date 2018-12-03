package model;

/**
 * @author Cangaceiros, Inc.
 * @version 1.0
 * @see model.Activity
 * 
 * Classe que define o evento de logon em dispositivo.
 * */
public class Logon extends Activity {

	String access; /** Identifica foi acessado ou não. */

	/**
	 * Construtor padrão da classe Logon responsável por 
	 * inicializar os atributos do objeto.
	 * */
	public Logon() {
		access = "";
	}	

	/**
	 * Obtém o status de access.
	 * @return o <code>String</code> especificando o access.
	 */
	public String getAccess() {
		return access;
	}

	/**
	 * Configura o status de access.
	 * @param access status de acesso.
	 */
	public void setAccess( String access ) {
		this.access = access;
	}

	/**
	 * Imprime na saída padrão as informações da atividade, adivindas da
	 * super classe Activity, junta ao status de acesso ao dispositivo.
	 * */
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Acessado:     " + access + "\n");
	}
}
