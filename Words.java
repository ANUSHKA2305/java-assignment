package sample;

import java.util.Scanner;

public class Words {

	public static void main(String[] args) {
		String str[]= {"zero","one","two","three","four","five","six","seven","eight","nine"};
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		int lastdigit,rev=0;
		while(n!=0)
		{lastdigit=n%10;
		rev=rev*10+lastdigit;
		n/=10;}
		
		int temp=0;
		while(rev!=0) {
			temp=rev%10;
			System.out.println(str[temp]);
			rev=rev/10;
		}
		 

}
}
