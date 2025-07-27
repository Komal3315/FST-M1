package activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> s = new HashSet<>();
		s.add("Komal");
		s.add("Bhushan");
		s.add("More");
		s.add("Usha");
		s.add("Suresh");
		s.add("Simran");
		System.out.println(s);
		
		System.out.println(s.size());
		s.remove("Simran");
		s.remove("Rajan");
		s.contains("Bhushan");
		
		System.out.println(s);

	}

}
