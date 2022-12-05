package org.scanner;

public class Constructor {
	
	public Constructor() {
		System.out.println("welcome");
	}
	public Constructor(int a,int b) {
		this();
		int c;
		c=a+b;
		System.out.println(c);
}
	public Constructor(int d,int e,int f) {
		this(d, e);
		System.out.println(f);
	}
	//public static void main(String[] args) {
	//	Constructor con=new Constructor();
	//	Constructor con2=new Constructor(10, 20);
	//	Constructor con3=new Constructor(60, 80, 90);
		
	//}

}
