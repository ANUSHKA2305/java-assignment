package sample;

public class Floyd {

	public static void main(String[] args) {
		
		        int rows = 5; // Number of rows in Floyd's Triangle
		        int number = 1; // Starting number

		        // Outer loop for the number of rows
		        for (int i = 1; i <= rows; i++) {
		            // Inner loop to print numbers in each row
		            for (int j = 1; j <= i; j++) {
		                System.out.print(number + " ");
		                number++; // Increment the number after printing
		            }
		            // Move to the next line after each row
		            System.out.println();
		        }
		    }
		}


	
