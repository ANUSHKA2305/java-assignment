package sample;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int m=n;
		int lastdigit,rev=0;
		while(n!=0)
		{lastdigit=n%10;
		rev=rev*10+lastdigit;
		n/=10;}
		if(rev==m) {
			System.out.println("it is a palindrome");
		}
		else
		{System.out.println("it is not a palindrome");}

	}

}
