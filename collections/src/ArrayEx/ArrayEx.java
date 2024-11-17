package ArrayEx;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30,40,50,60};
		int replace=2;
		int newele=90;
		if(replace>=0 && replace<a.length) {
			a[replace]=newele;
		}
		else {
			System.out.println("Not replaced");
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		int[] b= {87,98,56,34,43};
		int[] c=new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[a.length+i]=b[i];
		}
		System.out.println("\n");
		for(int i=0;i<(a.length+b.length);i++) {
			System.out.print(c[i]+" ");
		}
		System.out.println("\nAfter sorting");
		for(int i=0;i<(a.length+b.length)-1;i++) {
			for (int j = 0; j < (a.length+b.length)-1 - i; j++)
			if(c[j]>c[j+1]) {
				int temp=c[j];
				c[j]=c[j+1];
				c[j+1]=temp;
			}
		}
		for(int i=0;i<(a.length+b.length);i++) {
			System.out.print(c[i]+" ");
		}

	}

}
