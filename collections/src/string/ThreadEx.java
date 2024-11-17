//package string;
//
//class A extends Thread{
//	public void run(){
//		for(int i=0;i<50;i++) {
//			System.out.println("Hi");
//			try {
//				Thread.sleep(5);
//				} catch (InterruptedException e) {
//				e.printStackTrace();
//				}
//		}
//		
//	}
//}
//class B extends Thread{
//	public void run() {
//		for(int i=0;i<50;i++) {
//			System.out.println("Hello");
//			try {
//				Thread.sleep(5);
//				} catch (InterruptedException e) {
//				((Object) e).printStackTrace();
//				}
//		
//		}
//			
//	}
//}
//
//public class ThreadEx {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		A obj1=new A();
//		B obj2=new B();
//		//obj2.setPriority(Thread.MAX_PRIORITY);
//		obj1.start();
////		obj1.run();
////		obj2.run();
//		try {
//			Thread.sleep(2);
//			} catch (InterruptedException e) {
//			e.printStackTrace();
//			}
//		obj2.start();
//
//	}
//
//}
