package org.scanner;

import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Emp id is:");
	int empId = sc.nextInt();
	System.out.println("Emp id is:"+empId);
	
	System.out.println("emp phno is:");
	long empPhNo = sc.nextLong();
	System.out.println("emp phno is:"+empPhNo);
	
	System.out.println("salary:");
	float sal = sc.nextFloat();
	System.out.println("salary:"+sal);
	
	System.out.println("emp status:");
	boolean sts = sc.nextBoolean();
	System.out.println("status:"+sts);
	
	System.out.println("empp mail");
	String mail = sc.next();
	System.out.println("mail:"+mail);
	
	System.out.println("emp name:");
	String name = sc.nextLine();
	System.out.println("name:"+name);
	
	
	
	

	}

}
