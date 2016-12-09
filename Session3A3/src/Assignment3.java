
public class Assignment3 {
	/*
	 * 6. Expected Output Should print the reverse of an Array.
	 * 
	 */
	public static void main(String[] args) {
		Assignment3 a3 = new Assignment3();
		int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] returnedArray;
		returnedArray = a3.printReverse(testArray);
		
		for(int i: returnedArray)
			System.out.println(i);
	}

	public int[] printReverse(int[] input) {
		int[] reversed = new int[input.length];
		int position = 0;
		for (int i = input.length; i > 0; i--) {		
			reversed[position] = input[i-1];
			position++;
		}
		return reversed;
	}

}
