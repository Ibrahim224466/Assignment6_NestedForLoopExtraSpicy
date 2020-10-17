package assignments.assignments6_nestedForLoops;

public class Question5 {

	public static void main(String[] args) {
		
/* Write a Java program to print the following pattern
	1111111
	1111122
	1111333
	1114444
	1155555
	1666666
	7777777		       */
		
	
		
		
		
		for(int row=1; row<=7; row++ ) {
			int i= 7-row;
		  for(int col=1; col<=i; col++) 
			System.out.print(1);
		  for(int col=i; col<7; col++) 
				System.out.print(row);
		  System.out.println();
	 }
		
	}

}
