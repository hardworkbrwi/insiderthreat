package view;

import model.Device;
import model.Observant;
import model.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Device device = new Device();
		device.setId("1234");
		
		User user = new User();
		
		Observant obs = ( Observant ) user.getDown();
		obs.putDevice(device);
		
		Device divice1 = (Device) user.getDown().getDown();
		System.out.println(divice1.getId());;
	}
}
