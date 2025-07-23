package activities;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double seconds = 1000000000;

		double EarthSeconds = 31557600;
		double MercurySeconds = 0.2408467;
		double VenusSeconds = 0.61519726;
		double MarsSeconds = 1.8808158;
		double JupiterSeconds = 11.862615;
		double SaturnSeconds = 29.447498;
		double UranusSeconds = 84.016846;
		double NeptuneSeconds = 164.79132;
		
		//age = seconds / (60 × 60 × 24 × 365)
				
		double ageOnEarth = seconds / EarthSeconds;
        double ageOnMercury = ageOnEarth / MercurySeconds;
        double ageOnVenus = ageOnEarth / VenusSeconds;
        double ageOnMars = ageOnEarth / MarsSeconds;
        double ageOnJupiter = ageOnEarth / JupiterSeconds;
        double ageOnSaturn = ageOnEarth / SaturnSeconds;
        double ageOnUranus = ageOnEarth / UranusSeconds;
        double ageOnNeptune = ageOnEarth / NeptuneSeconds;

        System.out.printf("Age on Earth: %.2f years\n", ageOnEarth);
        System.out.printf("Age on Mercury: %.2f years\n", ageOnMercury);
        System.out.printf("Age on Venus: %.2f years\n", ageOnVenus);
        System.out.printf("Age on Mars: %.2f years\n", ageOnMars);
        System.out.printf("Age on Jupiter: %.2f years\n", ageOnJupiter);
        System.out.printf("Age on Saturn: %.2f years\n", ageOnSaturn);
        System.out.printf("Age on Uranus: %.2f years\n", ageOnUranus);
        System.out.printf("Age on Neptune: %.2f years\n", ageOnNeptune);
    }
}
