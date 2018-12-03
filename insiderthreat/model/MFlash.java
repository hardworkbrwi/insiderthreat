package model;

/**
 * @author Cangaceiros, Inc.
 * @version 1.0
 * @see model.Activity
 * 
 * Classe que define o evento de inserção de flashdrive.
 * */
public class MFlash extends Activity {

	String conect; /** Identifica se o dispositivo foi conectado ou não. */

	/**
	 * Construtor padrão da classe MFlash responsável por 
	 * inicializar os atributos do objeto.
	 * */
	public MFlash() {
		conect = "";
	}	

	/**
	 * Obtém o status de conect.
	 * @return o <code>String</code> especificando o estado de conexão.
	 */
	public String getConect() {
		return conect;
	}

	/**
	 * Configura o status de conect.
	 * @param conect status de conect.
	 */
	public void setConect( String conect ) {
		this.conect = conect;
	}

	/**
	 * Imprime na saída padrão as informações da atividade, adivindas da
	 * super classe Activity, junta ao status de conexão do dispositivo.
	 * */
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Conectado:     " + conect + "\n");
	}

}
