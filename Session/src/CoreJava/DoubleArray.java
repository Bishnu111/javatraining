package CoreJava;

public class DoubleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		//first array symbol represents row
		//second array symbol represents column
	
		String flights [][]=new String [4][4];
		
	  //first row
		flights [0][0]= "Dallas";
		flights [0][1]= "NYC";
        flights [0][2]= "Miami";
        flights [0][3]= "chicago";
        
       //Second row
        flights [1][0]= "New Mexico";
		flights [1][1]= "San Diego";
        flights [1][2]= "DC";
        flights [1][3]= "Newark";
        
        //Third row
        flights [2][0]= "New orleans";
		flights [2][1]= "Baton rouge";
        flights [2][2]= "Kansas";
        flights [2][3]= "toronto";
        
	   //fourth row
        flights [3][0]= "Denver";
		flights [3][1]= "Honolulu";
        flights [3][2]= "Harrisburg";
        flights [3][3]= "Houston";
        
      //  System.out.println(flights[3][1]);
      //  System.out.println(flights[3][3]);
        
    
        int rows =flights.length;
        int cols=flights[0].length;
        
        //argument for rows
        
        for (int rownum=0;rownum<rows; rownum+=2) {
        	//argument for column
        	for (int colnum=0; colnum<cols; colnum++ ) {
        		System.out.println(flights [rownum][colnum]);
        	}
        }
        
        
        
        
        
        
        
	
	
	
	
	    
	    
	    

	}	
	
}	
	


