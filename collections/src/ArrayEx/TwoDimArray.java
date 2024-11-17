package ArrayEx;
import java.util.Scanner;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=3;
		int m=3;
		int[][] a=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println();
			for(int j=0;j<m;j++) {
				System.out.print(a[i][j]+" ");
				
			}
		}
		for(int i=0;i<n;i++){
			a[i][i]=0;
			a[i][a.length-1-i]=0;
		}
		System.out.println("\ndiagonal as zeros:");
		for(int i=0;i<n;i++) {
			System.out.println();
			for(int j=0;j<m;j++) {
				System.out.print(a[i][j]+" ");
				
			}
		}
		System.out.println("\n to 1 d Array");
		int[] res=new int[n*m];
        int index=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[index++]=a[i][j];
            }
        }
        for(int i:res){
            System.out.print(i+ " ");
        }
		
	}

}
