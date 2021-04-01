package userregistration;

import java.util.ArrayList;
import java.util.List;
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
		if (matches) {
			System.out.println("Its Valid First Name");
		} else {
			System.out.println("Its InValid First Name");
		}
		// Checking valid Last name
		System.out.println("Enter Last Name-");
		String lastName = scanner.next();
		Pattern pattern_lastName = Pattern.compile("[A-Z]{1}[a-z]");
		Matcher matcher_lastName = pattern.matcher(lastName);
		boolean matches_lastName = matcher_lastName.find();
		if (matches_lastName) {
			System.out.println("Its Valid Last Name");
		} else {
			System.out.println("Its InValid Last Name");
		}

		// Checking valid Mobile Number
		System.out.println("Enter Mobile Number-");
		int mobileNumber = scanner.nextInt();
		Pattern pattern_mobileNumber = Pattern.compile("[0-9]{2}[ ][0-9]{10}");
		Matcher matcher_mobileNumber = pattern.matcher(lastName);
		boolean matches_mobileNumber = matcher_mobileNumber.find();
		if (matches_mobileNumber) {
			System.out.println("Its Valid Mobile Number");
		} else {
			System.out.println("Its InValid Mobile Number");
		}
		// Checking valid Password
		System.out.println("Enter Password-");
		String password = scanner.next();
		Pattern pattern_password = Pattern.compile("(?=.*[A-Z])" + "(?=.*[0-9])" + "(?=.*\\W)" + "[a-z]{8,20}$");
		Matcher matcher_password = pattern.matcher(password);
		boolean matches_password = matcher_password.find();
		if (matches_password) {
			System.out.println("Its Valid Password");
		} else {
			System.out.println("Its InValid Password");
		}

		// Checking valid Email
		// System.out.println("Enter Email-");
		// String email = scanner.next();
		List<String> emails = new ArrayList<>();
		emails.add("abc@yahoo.com");
		emails.add("abc-100@yahoo.com");
		emails.add("abc.100@yahoo.com");
		emails.add("abc111@abc.com");
		emails.add("abc11@abc.net");
		emails.add("abc@1.com");
		emails.add("abc@gmail.com.com");
		emails.add("abc+100@gmail.com");

		String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		Pattern pattern_email = Pattern.compile(regex);

		for (String email : emails) {
			Matcher matcher_email = pattern_email.matcher(email);
			System.out.println(email + " : " + matcher_email.matches());
		}

	}
}
