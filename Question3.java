package assignments.assignments6_nestedForLoops;

public class Question3 {

	public static void main(String[] args) {
	
		
/*		Write a Java program to print the following pattern

		1 2 3 4 5 6 7
		 2 3 4 5 6 7
		  3 4 5 6 7
		   4 5 6 7
		    5 6 7
		     6 7
		      7
		     6 7
		    5 6 7
		   4 5 6 7
		  3 4 5 6 7
		 2 3 4 5 6 7
		1 2 3 4 5 6 7             */
		 		
	
	
		
		for (int row=1;  row<=6 ; row++) {
			
			for (int i=1; i<row; i++) {
				System.out.print(" ");
			}
			
			for (int col=row; col<=7  ; col++) {
				System.out.print(col+" ");
			}
			System.out.println();
			
		}
			
			for (int row=7;  row>=1 ; row--) {
				
				for (int i=1; i<row; i++) {
					System.out.print(" ");
				}
				
				for (int col=row; col<=7  ; col++) {
					System.out.print(col+" ");
				}
				System.out.println();
				
			
				
				}
			
			 
			
			
			
	
			
			
		
	}

}
