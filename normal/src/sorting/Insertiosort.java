package sorting;

import java.util.Arrays;

public class Insertiosort {
public static void main(String[] args) {
	int[] arr= {4,2,3,5,1};
	for (int i = 0; i < arr.length; i++) {
	int temp=arr[i];
	int j=i;
	while(j>0 && arr[j-1]>temp) {
		arr[j]=arr[j-1];
		j--;
	}
		arr[j]=temp;
	}
	System.out.println(Arrays.toString(arr));
}
}
