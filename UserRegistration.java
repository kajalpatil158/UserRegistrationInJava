package userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		System.out.println("well Come In User Registration....");
		Scanner scanner = new Scanner(System.in);
		// Checking valid first name
		System.out.println("Enter First Name-");
		String firstName = scanner.next();
		Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]");
		Matcher matcher = pattern.matcher(firstName);
		boolean matches = matcher.find();
		if (matches)
			System.out.println("Its Valid First Name");
		else
			System.out.println("Its InValid First Name");
		
		// Checking valid Last name
				System.out.println("Enter Last Name-");
				String lastName = scanner.next();
				Pattern pattern_lastName = Pattern.compile("[A-Z]{1}[a-z]");
				Matcher matcher_lastName = pattern.matcher(lastName);
				boolean matches_lastName = matcher_lastName.find();
				if (matches_lastName)
					System.out.println("Its Valid Last Name");
				else
					System.out.println("Its InValid Last Name");
				
				// Checking valid Email
				System.out.println("Enter Email-");
				String email = scanner.next();
				Pattern pattern_email = Pattern.compile(
						"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
				Matcher matcher_email = pattern.matcher(email);
				boolean matches_email = matcher_email.find();
				if (matches_email)
					System.out.println("Its Valid Email");
				else
					System.out.println("Its InValid Email");

	}
}
