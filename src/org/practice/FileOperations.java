package org.practice;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileOperations {

	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Practice");
		
		boolean mkdir = f.mkdir();
		System.out.println(mkdir);
		
		File c=new File("C:\\Practice\\File Operation");
		
		boolean mkdirs = c.mkdirs();
		System.out.println(mkdirs);
		
		File d=new File("C:\\Practice\\File Operation\\Inheritance.txt");
		
		//File e=new File("C:\\Practice\\File Operation\\Poly.png");
				
			
		FileUtils.write(d, "Java Selenium");
		
		FileUtils.write(d, "Python Testing", true);
		
		FileUtils.write(d, "Manual testing", false);
	
		
			File d1=new File("C:\\Practice\\File Operation\\Inheritance.txt");
		boolean createNewFile2 = d1.createNewFile();
		System.out.println(createNewFile2);
			
			FileUtils.copyFile(d, d1);
			
			List<String> readLines2 = FileUtils.readLines(d1);
			
			for (String x1 : readLines2) {
				System.out.println(x1);
				
			
		
		
		
		
		
		}
	

	
	
	}
	
	
	
}
