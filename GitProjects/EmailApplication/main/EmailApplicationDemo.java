package main;

import lib.EmailApplication;

public class EmailApplicationDemo {

	public static void main(String[] args) {
		EmailApplication e = new EmailApplication("Savvas","Polydorou", null, null,null,null);
		e.setDepartment("Computer");
		e.defineEmail();//Modify the email to firstname.lastname@department.company.com format
		e.generatePassword(7);
		System.out.println(e.getFirstName());
		System.out.println(e.getLastName());
		System.out.println(e.getfullName());
		e.setDepartment("Computer"); //Since the field is initialized we do not access the switch statement
		System.out.println(e.getEmail());
		System.out.println(e.getAlternateEmail());
		System.out.println(e.getPassword());
		System.out.println(e.toString());
		System.out.println();
		EmailApplication e2 = new EmailApplication();
		e2.setFullName("Stavros", "Michael");
		e2.generatePassword(10);
		e2.defineEmail();
		e2.getEmail();
		e2.getAlternateEmail();
		System.out.println(e2.toString());
	}

}
