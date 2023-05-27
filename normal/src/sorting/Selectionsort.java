package sorting;

import java.util.Arrays;

public class Selectionsort {
public static void main(String[] args) {
	int[] arr= {3,4,2,5,1};
	for (int i = 0; i < arr.length; i++) {
		int min=i; 
		for (int j = i+1; j < arr.length; j++) {
			if(arr[j]<arr[min] ) {
				 min=j;
			}
		}
		if(min!=i) {
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
	}
	System.out.println(Arrays.toString(arr));
}
}
