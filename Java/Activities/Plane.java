package activities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Plane {
	private List<String> passengers;
	private int maxPassengers;
	private Date lastTimeTookOf;
	private Date lastTimeLanded;

	
	public Plane(int maxPassengers)
	{
		this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();

	}
	
	public void onboard()
	{
		passengers.add("Komal Wagh");
		passengers.add("Swamidnya More");
		passengers.add("Bhushan More");
	}
	
	public Date takeOff()
	{
		this.lastTimeTookOf = new Date(maxPassengers);
		return lastTimeTookOf;
	}
	
	public void land()
	{
		this.lastTimeLanded = new Date(maxPassengers);
		this.passengers.clear();
	}
	
	public Date getLastTimeLanded()
	{
		return lastTimeLanded;
		
	}
	
	public List<String> getPassesngers()
	{
		return passengers;
	}
	
	
}
