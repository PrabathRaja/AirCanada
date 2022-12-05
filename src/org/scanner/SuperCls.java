package org.scanner;

public class SuperCls extends Constructor {
	
	public SuperCls() {
		super(20, 10);
		System.out.println("hello");
		
	}
	public SuperCls(int s) {
		super(2, 1, 2);
		System.out.println(s);
	}
	public static void main(String[] args) {
		SuperCls s=new SuperCls();
		SuperCls s2=new SuperCls(10);
	   Constructor c =new Constructor(10, 60);
	    Constructor c1=new Constructor(10, 10, 10);
	
	}

}
