package arrays;

public class Removeduplicatecharfromstring {
public static void main(String[] args) {
	String str="karnataka";
	char [] ch=str.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		for (int j = i+1; j < ch.length; j++) {
			if(ch[i]==ch[j]) {
				ch[j]='z';
			}
		}
	}
	for (int k = 0; k < ch.length; k++) {
		if(ch[k]!='z')
		System.out.println(ch[k]);
	}
}
}
