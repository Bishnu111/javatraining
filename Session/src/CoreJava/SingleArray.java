package CoreJava;

public class SingleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Rainbow []=new String [7];

 Rainbow[0]= "red";
 Rainbow[1]="orange";
 Rainbow[2]="yellow";
 Rainbow[3]="green";
 Rainbow[4]="violet";
 Rainbow[5]="indigo";
 Rainbow[6]="blue";

 //System.out.println(Rainbow[0]);

// System.out.println(Rainbow[5]);

for (int x=0;x<Rainbow.length;x+=2)
	
{
	System.out.println(Rainbow[x]);
}


String City[]= new String [10];

City[0]="fortworth";
City[1]="frisco";
City[2]="coppell";
City[3]="denton";
City[4]="austin";
City[5]="irving";
City[6]="las colinas";
City[7]="grand prarie";
City[8]="Arlington";
City[9]="main street";

 for (int x=0;x<City.length;x+=1)
 {
	System.out.println(City[x]); 
	
 }


 
	
	
	}	
	

}
