package src.view;

import src.model.Device;
import src.model.Http;
import src.model.Observant;
import src.model.User;
import src.model.Activity;
import src.model.Data;
import src.model.Logon;

public class Main {

	public static void main(String[] args) {
		Data dat = new Data();
		dat.loadFileHttp();
		dat.loadFileLogon();
		dat.loadFileMflash();
		dat.loadFileUser();
		
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
