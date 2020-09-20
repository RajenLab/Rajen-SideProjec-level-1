package emailapp;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
    private String department;
	private String email;
	private int mailboxCapacity=500;
	private int defaultPasswordLength =10;
	
	
	public Email(String firstName, String lastName,String department) {
		this.firstName= firstName;
		this.lastName= lastName;
		this.department= department;
				
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your Password is " + this.password );
		
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + ".com";
		//System.out.println("your Email is:" + email);
	}
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJJKLMNOPQRSTUVWXYZ12345667890!@#$%";
		char[] password = new char[length];
		for(int i=0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
		    password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	public void ChangePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() {return mailboxCapacity;}
	public String getPassword() { return password; }
 
	public String showInfo() {
		return "DISPLAY NAME: " + firstName  + " " + lastName  +
			   "\nYOUR EMAIL: " + email +
			   "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
	}
}
