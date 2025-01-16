package sample;

import java.util.Scanner;

public class Printpalin {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int temp=i;
			int lastdigit,rev=0;
			while(temp!=0)
			{lastdigit=temp%10;
			rev=rev*10+lastdigit;
			temp/=10;}
			if(rev==i) {
				System.out.println(i);
			
		}
	}

}
}
