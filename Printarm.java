package sample;

public class Printarm {

	public static void main(String[] args) {
		for(int i=1;i<1000;i++) {
			int sum=0;
			int t=i,cnt=0,t2=i;
			while(t2!=0) {
				cnt++;
				t2=t2/10;
			}
			while(t!=0)
			{
			int temp=t%10;
			sum+= Math.pow(temp,cnt);
			t=t/10;
		}
			if(i==sum) {
				System.out.println(i);

	        }

}
}
	}