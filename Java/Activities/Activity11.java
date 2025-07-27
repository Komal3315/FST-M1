package activities;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> s = new HashMap<Integer, String>();
		s.put(1, "Black");
		s.put(2, "Green");
		s.put(3, "Yellow");
		s.put(4, "White");
		
		System.out.println(s);
		s.remove(4);
		s.containsValue("Green");
		System.out.println(s.size());
		
	}

}
