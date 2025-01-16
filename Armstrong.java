package sample;

import java.util.Scanner;
import java.math.*;

public class Armstrong {
	public static void main(String[] args) {
		System.out.println("enter the no");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int m=n;
		int sum=0;
		while(n!=0)
		{
		int temp=n%10;
		sum+= Math.pow(temp,3);
		n=n/10;
		}
		if(sum==m) {
			System.out.println("it is an armstrong no.");
		}
		else {
			System.out.println("it is not an armstrong no.");
		}sc.close();
	}
	
}
