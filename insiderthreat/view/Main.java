package view;

import model.Device;
import model.Http;
import model.Observant;
import model.User;

import java.io.File;

import model.Activity;
import model.Data;
import model.Logon;

public class Main {

	public static void main(String[] args) throws Exception {
		File file = new File( "/home/bruno/Documentos/BTI/LP2/projetoUnid3/http.csv" );
		Data dados = new Data();
		dados.loadFile(file);
		
		Http http = new Http();
		http.setId("123");
		http.setUrl("www.google.com");
		
		Logon logon = new Logon();
		logon.setId("456");
		
		Device dev = new Device();
		dev.setId("7");
		dev.addActivity(http);
		dev.addActivity(logon);
		
		Observant obs = new Observant();
		obs.addDevice( dev );
		obs.getActivityInDevice("7");
		
		Device dev1 = new Device();
		dev1.setId("1");
		
		obs.addDevice(dev1);
		
		Http http1 = new Http();
		http1.setId("777");
		http1.setUrl("www.facebook.com");
		
		obs.addActivityInDevice( http1, "1" );
		obs.getActivityInDevice("1");
		System.out.println("------------");
		obs.getAllActivityInDevice();
	}
}
