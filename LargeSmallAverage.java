public class LargeSmallAverage {
	public static void main (String[] args) {
		int [] arr = {28, 42, 37, 61, 55};
		int length = arr.length - 2;
		int sum = 0;
		int [] b = arr;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		
		int min = b[0];
		for (int i = 0; i < b.length; i++) {
			if(b[i] > max)
				max = b[i];
		}
		
		System.out.println("Smallest number:" + min);
		

		System.out.println("Largest number: " + max);
		
		double result = max = min;

		
		double average = (sum / length) - result;
		
		System.out.println("Average of array: " + average);
		
	}
}