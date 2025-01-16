package sample;

public class pyramid {

	public static void main(String[] args) {
		int rows = 5;
		for (int i = 1; i <= rows; i++) {
            // Inner loop for spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" "); // Print space
            }
            
            // Inner loop for printing increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j); // Print increasing numbers
            }
            
            // Inner loop for printing decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j); // Print decreasing numbers
            }
            
            // Move to the next line after each row
            System.out.println();
        }

	}

}
