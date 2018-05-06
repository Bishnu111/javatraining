package CoreJava;

public class NonStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

NonStatic x=new NonStatic(); // we just made instance of a class
x.car();
x.flower();
x.massaddition(5,6,7,8);
x.temperature();
	}


public void car() { //non static function
	
	System.out.println("Toyota");
	
	}


public void flower() {
	
	System.out.println("i like rose");
}

public void massaddition (int a, int b, int c, int d) {
	int massaddition= a+b+c+d;
	System.out.println(massaddition);
}
public void temperature () {
	System.out.println("it is chilly");
}

}