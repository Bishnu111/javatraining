package CoreJava;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader= new Scanner(System.in); //instance of a scanner reader object
		System.out.println("what number you want to add");
		int num1=reader.nextInt();
		System.out.println("what is your next number");	
		int num2=reader.nextInt();
		System.out.println("what number you want to add next");
		int num3= reader.nextInt();
		
		
		
		add(num1,num2,num3);
		
		Calculator cal=new Calculator();
		cal.sub(23, 20);
		
		System.out.println("complete");
	}
	

public void sub(int a, int b) {
	int result=a-b;
System.out.println(result);	
}


public static void add (int a,int b, int c) {
	int result=a+b+c;
	
	System.out.println (result);
}

public static void add (int a,int b) {
	int result=a+b;
	
	System.out.println (result);
}


}
