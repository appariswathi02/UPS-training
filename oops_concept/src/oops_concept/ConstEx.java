package oops_concept;

class Vol{
	double wid,hei,bre;
	Vol(double w, double h,double b){
		this.wid=w;
		this.hei=h;
		this.bre=b;
	}
	Vol(){
		this(10,20,30);
	}
	Vol(double n){
		wid=hei=bre=n;
	}
	public void volume() {
		System.out.println(wid*hei*bre);
	}
}

public class ConstEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vol obj=new Vol();
		Vol obj2=new Vol(10);
		obj2.volume();
		obj.volume();
	}

}
