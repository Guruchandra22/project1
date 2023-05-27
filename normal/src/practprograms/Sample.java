package practprograms;

import java.util.Arrays;

public class Sample 
{
	 public static void main(String[] args) {
		 
		 
	 }
	 }
	 
	 
	 
	 
	 
	 
	 
//	    sirt method
//	 {
//		 int[] arr= {5,3,6,2,7};
//		 Arrays.sort(arr);
//		 for(int i=0;i<arr.length;i++){
//			 
//		 System.out.print(arr[i]);
//	}
//	 }
//	
//}
//	
	
	
	
	

//	sum of each array elwment
//	public static void main(String[] args) {
//		int [] arr= {1234,4554,4565,8767,3463,8745,6352};
//		for(int i=0;i<arr.length;i++) {
//			int no=arr[i];
//			int sum=0;
//			 while(no!=0)
//			 {
//				 int rem=no%10;
//				 sum =sum+rem;
//				 no=no/10;
//			 }
//			 System.out.println(sum);
//		}
//	}
//}







//      even and odd sum
//	public static void main(String[] args)
//	{
//		 int[] arr= {1,2,3,4,5,6,7,8,9};
//		 int evensum=0;
//		 int oddsum=0;
//		 for(int i=0;i<arr.length;i++) {
//			 if(arr[i]%2==0) {
//				 evensum=evensum+arr[i];
//			 }
//			 else
//			 {
//				 oddsum=oddsum+arr[i];
//			 }
//			
//		 }
//		 System.out.println("evensum is-->"+evensum);
//		 System.out.println("oddsum is-->"+oddsum);
//		
//	}
//	}
//	
//	
	
	
	
//	    factorial of number
//	{
//		int no=5;
//		int fact=1;
//		for(int i=no;i>=1;i--)
//		{
//			fact=fact*i;
//		}
//		System.out.println(fact);
//	}
//}




//     sum of given number until single digit of sum
//{
//
//	public static void main(String[] args) {
//		int no=6789;
//		while(no>9) {
//			 no=number(no);
//			 
//		}
//		System.out.println(no);
//	}
//
//	private static int number(int no) {
//		int sum=0;
//		while(no!=0) {
//			int rem=no%10;
//			 sum=sum+rem;
//			 no=no/10;
//		}
//		return sum;
//	}
//}
//	
	
	
	
	
	
	
	
//     palindrome number	
//	
//	{
//		 int num=1234;
//		 int rev=0;
//		 while(num!=0)
//		 {
//			 int rem=num%10;
//			 rev=(rev*10)+rem;
//			 num=num/10;
//			 
//		 }
//		if(num==rev) {
//			System.out.println("palindrome");
//	}
//		else
//		{
//			System.out.println("not palindrome");
//		}
//	}
//
//}
//}







//       rev number
//{
//	 int num=1234;
//	 int rev=0;
//	 while(num!=0)
//	 {
//		 int rem=num%10;
//		 rev=(rev*10)+rem;
//		 num=num/10;
//		 
//	 }
//	System.out.println(rev);
//}
//}










//   String palindrome
//{
//	String str="aabbaab";
//	String rev="";
//	for(int i=str.length()-1;i>=0;i--) {
//		rev=rev+str.charAt(i);
//	
//	}
//	if(rev.equals(str)) {
//		System.out.println("palindrome");
//	}
//	else
//	{
//		System.out.println("not palindrome");
//	}
//}
//}










//    reverse string
//{
//	String str="jaaava";
//	String rev="";
//	for(int i=str.length()-1;i>=0;i--) {
//		rev=rev+str.charAt(i);
//	
//	}
//	System.out.println(rev);
//}
//}











//    remove space
//{
//	String str="ka    yaka     vae kail      asa";	
//	System.out.println(str);
//	System.out.println(str.replaceAll("  +",""));
//	
//	
//}
//
//}





//    replace char
//{
//	String str="kayakavae kailasa";
//	System.out.println(str);
//	System.out.println(str.replace('a', 'o'));
//}
//}
