package arrays;

import java.util.Iterator;

public class Smallestarray {
public static void main(String[] args) {
	int [] arr= {2,4,6,1,9,5,7};
	int small=arr[0];
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]<small) {
			small=arr[i];
		}
	}
	System.out.println("smallest array is "+small);
}
}
