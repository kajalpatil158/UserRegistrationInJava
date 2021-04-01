package userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		System.out.println("well Come In User Registration....");
		Scanner scanner = new Scanner(System.in);
		// Checking validity of first name
		System.out.println("Enter First Name-");
		String firstName = scanner.next();
		Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]");
		Matcher matcher = pattern.matcher(firstName);
		boolean matches = matcher.find();
		if (matches)
			System.out.println("Its Valid First Name");
		else
			System.out.println("Its InValid First Name");
		
		// Checking validity of Last name
				System.out.println("Enter Last Name-");
				String lastName = scanner.next();
				Pattern pattern_lastName = Pattern.compile("[A-Z]{1}[a-z]");
				Matcher matcher_lastName = pattern.matcher(lastName);
				boolean matches_lastName = matcher_lastName.find();
				if (matches_lastName)
					System.out.println("Its Valid Last Name");
				else
					System.out.println("Its InValid Last Name");

	}
}
