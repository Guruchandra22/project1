package arrays;

public class Largestarray {
public static void main(String[] args) {
	int[] arr= {2,4,3,17,5,9,6};
	int large=arr[0];
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]>large) {
			 large=arr[i];
		}
	
	}
	System.out.println("largest array is "+large);
}
}
