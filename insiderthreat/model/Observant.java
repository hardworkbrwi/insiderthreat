package model;
import java.util.ArrayList;
import java.util.List;


public class Observant{
	private int histogram[];
	private List<Device> devices;
	
	public Observant() {
		this.histogram = new int[24];
		this.devices = new ArrayList<Device>();
		
		for(int i = 0; i < 23; i++) {
			this.histogram[i] = 0;
		}
	}
	
	public void addDevice( Device device ) {
		this.devices.add( device );
	}
	
	public void addDevice( String id ) {
		Device device = new Device();
		device.setId( id );
		this.devices.add( device );		
	}
	
	public void addActivityInDevice( Activity activity, String idDevice ) {
		for( Device device: devices ) {
			if( device.getId().equalsIgnoreCase( idDevice ) ){
				device.addActivity( activity );
			}
		}
	}
	
	public void getActivityInDevice( String idDevice ) {
		for( Device device: devices ) {
			if( device.getId().equalsIgnoreCase( idDevice ) ){
				System.out.println(idDevice);
				for( Activity ativ: device.getActivitys() ) {
					System.out.println( ativ.getId() );
					System.out.println( ativ.getDate() );
					System.out.println( ativ.getUser() );
					System.out.println( ativ.getPc() );
					
					if( ativ instanceof Http ) {
						System.out.println( ( (Http) ativ ).getUrl() );
					}else if( ativ instanceof Logon ) {
						System.out.println( ( (Logon) ativ ).getAccess() );
					}else if( ativ instanceof MFlash ) {
						System.out.println( ( (MFlash) ativ ).getConect() );
					}
				}
				break;
			}
		}
	}
	
	public void getAllActivityInDevice() {
		for( Device device: devices ) {
			for( Activity ativ: device.getActivitys() ) {
				System.out.println( ativ.getId() );
				System.out.println( ativ.getDate() );
				System.out.println( ativ.getUser() );
				System.out.println( ativ.getPc() );
				
				if( ativ instanceof Http ) {
					System.out.println( ( (Http) ativ ).getUrl() );
				}else if( ativ instanceof Logon ) {
					System.out.println( ( (Logon) ativ ).getAccess() );
				}else if( ativ instanceof MFlash ) {
					System.out.println( ( (MFlash) ativ ).getConect() );
				}
			}
		}
	}
}
