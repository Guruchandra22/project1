package sorting;

import java.util.Arrays;

public class Bubblesort {
public static void main(String[] args) {
	int[] x= {3,4,1,5,2};
	for (int i = 0; i < x.length; i++) {
		for (int j = 0; j < x.length-1; j++) {
			if(x[j]>x[j+1]) {
				int temp=x[j];
				x[j]=x[j+1];
				x[j+1]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(x));
}
}
