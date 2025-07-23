package activities;

public class Car {

	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	public Car(int tyre , int doors)
	{
		tyre = 4;
		doors = 4;
	}
	
	public void displayCharacteristics()
	{
	
		System.out.println("Color of the car is : "+color);
		System.out.println("Transmission of the car is : "+transmission);
		System.out.println("Make of the car is : "+make);
		
	}
	
	public void accelarate()
	{
		System.out.println("Car is moving forward.");
	}
	
	public void brake()
	{
		System.out.println("Car has stopped.");
	}
}
