package arrays;

public class Removeduplicatefromstring {
public static void main(String[] args) {
	String[] str= {"hii","bye","hello","woooow","hello","hii","hoooo","woooow"};
	for (int i = 0; i < str.length; i++) {
		for (int j = i+1; j < str.length; j++) {
			if(str[i].equals(str[j])) {
				str[j]="temp";
			}

			}
		}

	for (int k = 0; k < str.length; k++) {
		if(str[k]!="temp") {
			System.out.println(str[k]);
		}
	}
	
}
}
