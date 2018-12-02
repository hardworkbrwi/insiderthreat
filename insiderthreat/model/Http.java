package model;

/**
 * @author Cangaceiros, Inc.
 * @version 1.0
 * @see model.Activity
 * 
 * Classe que define o evento de acesso à páginas web.
 * */
public class Http extends Activity {

	String url; /** Identifica a url da página acessada. */
	
	/**
	 * Construtor padrão da classe Http responsável por 
	 * inicializar os atributos do objeto.
	 * */
	public Http() {
		url = "";
	}	

	/**
	 * Obtém a url.
	 * @return o <code>String</code> especificando a url.
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Configura a url da página web.
	 * @param url da página web.
	 */
	public void setUrl( String url ) {
		this.url = url;
	}
	
	/**
	 * Imprime na saída padrão as informações da atividade, adivindas da
	 * super classe Activity, junta a url da página web acessada.
	 * */
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("URL:     " + url + "\n");
	}

}
