package activities;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {4, 2, 7, 1, 10, 9};

        System.out.println("Original array:");
        printArray(numbers);

        // Insertion sort logic
        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;

            // Move elements that are greater than key one position ahead
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = key;
        }

        System.out.println("Sorted array (ascending):");
        printArray(numbers);
    }

    // Helper method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
		}
		
	}

	
	

