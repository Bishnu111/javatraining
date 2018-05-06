package CoreJava;

import java.util.Scanner;

public class Euro_usdollar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//declare variables
	double euro;
	double dollar;
	//create a scanner object
	Scanner input=new Scanner(System.in);
	
	//Recieve inputs from keyboard
	System.out.println("enter a euro amount");
	euro= input.nextDouble();
	
	//compute dollar
	//one euro is 1.2 us dollars
	
	dollar = euro*1.2;
	
	//Display result
	System.out.println(euro +"is" +dollar+ "dollar");
		
	
	System.out.println("enter a dollar amount");
	dollar= input.nextDouble();
	
	euro= dollar*0.83;
	
	System.out.println(dollar+"is" +euro+ "euro");
	
	}	
	}	
	
	