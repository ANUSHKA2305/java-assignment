package sample;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		System.out.println("enter the no");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int tot=0;
		while(n!=0)
		{
		int temp=n%10;
		tot+=temp;
		n=n/10;
		}
		
		System.out.println(tot);
		
sc.close();
	}

}
