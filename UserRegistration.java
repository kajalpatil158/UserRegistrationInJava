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
			System.out.println("First Name Is Valid");
		else
			System.out.println("Please Enter A Valid First Name");
	}
}
