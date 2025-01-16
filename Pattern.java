package sample;

public class Pattern {

	public static void main(String[] args) {
		 int rows = 5; // Number of rows in the pattern

	        // Outer loop for the number of rows
	        for (int i = 1; i <= rows; i++) {
	            // Inner loop to print numbers in each row
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j);
	            }
	            // Move to the next line after each row
	            System.out.println();
	        }
	        

	}

}
