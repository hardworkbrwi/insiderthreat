package view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import control.HandlerDate;

public class SandBox {

	public SandBox() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		HandlerDate hd = new HandlerDate();
		try {
			hd.readDate();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		hd.buildTree();
		
		
		File arq = new File("./logs");
		File arqManip = new File("./http.csv");
		
		try {
			
			FileReader readFile = new FileReader(arqManip.getAbsolutePath());
			BufferedReader bf = new BufferedReader(readFile);
			File temp = File.createTempFile("teste_arquivo_temp", ".cvs", arq);
			System.out.println(temp.getAbsolutePath());
			
			//List<String> linhas = Files.
			
			temp.delete();
			bf.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
