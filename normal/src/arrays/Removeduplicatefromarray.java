package arrays;

public class Removeduplicatefromarray {
public static void main(String[] args) {
	int [] no= {2,4,6,8,9,8,6,5,4,3,2};
	for (int i = 0; i < no.length; i++) {
		for (int j = i+1; j < no.length; j++) {
			if(no[i]==no[j]) {
				no[j]=100;
			}

			}
		}

	for (int k = 0; k < no.length; k++) {
		if(no[k]!=100) {
			System.out.println(no[k]);
		}
	}
}
}
