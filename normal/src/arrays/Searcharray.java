package arrays;

public class Searcharray {
public static void main(String[] args) {
	int arr []= {4,3,6,8,9};
	int find =6;
	for (int i = 0; i < arr.length; i++) {
		if(find==arr[i]) {
			System.out.println("6 is found in "+i+"th index");
		}
	}
}
}
