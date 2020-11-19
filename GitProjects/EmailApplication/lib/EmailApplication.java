package lib;
import java.util.Scanner;

public class EmailApplication {
	//fields
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private String company;
	private String email;
	
	//constructors
	public EmailApplication()
	{
		firstname = null;
		lastname = null;
		password = null;
		department = null;
		company = null;
		email = null;
	}
	public EmailApplication(String firstname, String lastname, String password, String department, String company, String email)
	{
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.department = department;
		this.company = company;
		this.email = email;
	}
	
	//methods
	public void defineEmail()
	{
		if(department == null) {
		System.out.println("Select department for " + this.firstname + " " + this.lastname + "\nComputer, Photography, Accounting");
		Scanner in = new Scanner(System.in);
		String choice = in.nextLine();
		switch(choice)
		{
		case "Computer" : 
			department = "Computer";
			break;
		case "Photography" : 
			department = "Photography";
			break;
		case "Accounting" : 
			department = "Accounting";
			break;
		default:			
			break;
		}
		in.close();
		}
		if(department == "Computer")
			company = "Microsoft";
		else if (department == "Photography")
			company = "Canon";
		else if (department == "Accounting")
			company= "BPC";
		String dot = ".";
		String at = "@";
		String ending = "com";
		email = firstname + dot + lastname + at + department + dot + company + dot + ending;
		
	}
	public void setDepartment(String department)
	{
		this.department = department;
	}
	public String generatePassword(int passwordlength)
	{
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		char[] passwordchar = new char[passwordlength];
		for(int i=0;i<passwordlength;i++) {
			int rand = (int) (Math.random() * alphabet.length());
			passwordchar[i] = alphabet.charAt(rand);
		}
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<passwordlength;i++)
			sb.append(passwordchar[i]);
		password = sb.toString();
		return password;
	}
	public void setFirstName(String firstname)
	{
		this.firstname = firstname;
	}
	public void setLastName(String lastname)
	{
		this.lastname = lastname;
	}
	public void setFullName(String firstname, String lastname)
	{
		
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public String getFirstName()
	{
		return firstname;
	}
	public String getLastName()
	{
		return lastname;
	}
	public String getfullName()
	{
		return firstname + " " + lastname;
	}
	public String getPassword()
	{
		return password;
	}
	public String getEmail()
	{
		
		return email;
	}
	public String getAlternateEmail()
	{
		return firstname + "." + lastname + "@email.com";
	}
	@Override
	public String toString()
	{
		return "EmailApplication[FirstName: " + firstname + ", LastName: " + lastname + ", Password: " + password +
				", Department: " + department + ", Work Email: " + email + ", Personal Email: " + getAlternateEmail() + "]";
	}
	
}
