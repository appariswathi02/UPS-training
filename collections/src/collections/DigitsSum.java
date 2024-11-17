package collections;

public class DigitsSum {
	
	public static void sum(int n) {
		int sum=0;
		while(n!=0) {
			int d=n%10;
			sum=sum+d;
			n/=10;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123;
		sum(num);
	}

}
