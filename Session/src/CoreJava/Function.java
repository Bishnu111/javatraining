package CoreJava;

public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

country ();
state();
age();
addition(8,9);
sub(6,9);	
massaddition(5,6,7,8);	
	}


public static void country(){
	
	System.out.println("I am from mars");	
}

public static void state () {
	
 System.out.println("I am from texas");	
}

public static void age() {
	
	int x=9;
	System.out.println(x);

}

public static void addition (int a, int b) {

int add =a+b;
System.out.println(add);
}

public static void sub (int a, int b) {
	int sub= a-b;
	System.out.println(sub);
}

public static void massaddition (int a, int b, int c, int d) {
	int massaddition= a+b+c+d;
	System.out.println(massaddition);
}


}
