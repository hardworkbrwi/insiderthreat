package model;

import java.util.ArrayList;
import java.util.List;

public class Device {
	private String id;
	private List<Activity> activitys;
	
	public Device() {
		activitys = new ArrayList<Activity>();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void addActivity ( Activity activity ) {
		this.activitys.add( activity );
	}

	public List<Activity> getActivitys() {
		return activitys;
	}
}
