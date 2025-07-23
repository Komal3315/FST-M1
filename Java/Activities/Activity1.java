package activities;

public class Activity1 {
	public static void main(String[] args) {
		Car carname = new Car(4, 4);
		carname.color= "Black";
		carname.transmission = "Auto";
		carname.make = 2020;
		carname.displayCharacteristics();
		carname.accelarate();
		carname.brake();
	}

}
