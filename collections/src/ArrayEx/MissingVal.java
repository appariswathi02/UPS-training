package ArrayEx;

public class MissingVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {0,1,3,4,5};
//		int sum=0;
//		int n=a[a.length-1];
//		int res=(n*(n+1))/2;
//		for(int i=0;i<a.length;i++) {
//			sum=sum+a[i];
//		}
//		System.out.println(res-sum);
		
		int ans=1;
		for(int i=0;i<a.length;i++) {
			if (a[i]>0)
				if(a[i]==ans)
					ans++;
		}
		System.out.println(ans);

	}

}
