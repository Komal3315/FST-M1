package activities;

public class Activity2 {
	public static void main(String[] args)
	{
		int[] nos = {10, 77, 10, 54, -11, 10};
		int add = 0;
		for (int i = 0; i < nos.length; i++) 
		{
			if(nos[i] == 10)
			{
				add = add + nos[i];

			}
		}
        System.out.println("Sum of 10's is :"+add);

        boolean isSumCorrect = (add == 30);
        System.out.println("Is the sum of 10s equal to 30? " + isSumCorrect);
        
	}
}