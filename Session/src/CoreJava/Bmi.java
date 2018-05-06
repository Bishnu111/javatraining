package CoreJava;

public class Bmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Bmi[]=new int[5];
		
		Bmi[0]= (10);
		Bmi[1]=	(20);
		Bmi[2]=(30);
		Bmi[3]=(40);
		Bmi[4]=(50);
String []value= {"underweight", "normal","normal","abnormal","overweight"};
	int x=0;
			for(int i=0;i<Bmi.length;i++) 
				
			{
				if (x<Bmi.length)
				{
				System.out.println("Bmi is " +value[x]);
				x++;
				}
			}
	}
}

