package activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myList = new ArrayList<>();
		myList.add("Komal");
		myList.add("Swamidnya");
		myList.add("More");
		
		for (String list : myList)
		{
			System.out.println("Names :"+list);
			
		}
		myList.get(2);
		myList.contains("Bhushan");
		myList.size();
		myList.remove("More");
		System.out.println(myList.size());
		
		
	}

}
