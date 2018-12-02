package model;

import java.util.ArrayList;
import java.util.List;

public class Device {
	private String id;
	private List<Activity> activities;
	
	public Device() {
		activities = new ArrayList<Activity>();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void addActivity ( Activity activity ) {
		this.activities.add( activity );
	}

	public List<Activity> getActivitys() {
		return activities;
	}
}
