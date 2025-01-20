package sample;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validation {
	

	    // Method to validate Name
	    public static boolean validateName(String name) {
	        
	        String nameRegex = "^[a-zA-Z0-9\\s]+$";
	        Pattern pattern = Pattern.compile(nameRegex);
	        Matcher matcher = pattern.matcher(name);
	        return matcher.matches();
	    }

	    // Method to validate Email 
	    public static boolean validateEmail(String email) {
	        
	        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
	        Pattern pattern = Pattern.compile(emailRegex);
	        Matcher matcher = pattern.matcher(email);
	        return matcher.matches();
	    }

	    
	    public static boolean validateDOB(String dob) {
	        
	        String dobRegex = "^([0-2][0-9]|3[01])\\s([0][1-9]|1[0-2])\\s(\\d{4})$";
	        Pattern pattern = Pattern.compile(dobRegex);
	        Matcher matcher = pattern.matcher(dob);
	        return matcher.matches();
	    }


public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);

   
    System.out.print("Enter your Name: ");
    String name = scanner.nextLine();
    
    System.out.print("Enter your Email ID: ");
    String email = scanner.nextLine();
    
    System.out.print("Enter your Date of Birth (dd mm yyyy): ");
    String dob = scanner.nextLine();

    // Validate Name
    if (!validateName(name)) {
        System.out.println("Invalid Name! It should contain only alphanumeric characters and spaces.");
    } else {
        System.out.println("Valid Name.");
    }

    // Validate Email
    if (!validateEmail(email)) {
        System.out.println("Invalid Email! Please enter a valid email like abc@domain.com.");
    } else {
        System.out.println("Valid Email.");
    }

    // Validate DOB
    if (!validateDOB(dob)) {
        System.out.println("Invalid Date of Birth! Please use the format dd mm yyyy.");
    } else {
        System.out.println("Valid Date of Birth.");
    }

    scanner.close();
}
}
	


