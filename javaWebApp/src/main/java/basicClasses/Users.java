package basicClasses;
/**
 * This is the Father class which contains the following charachteristics:
 * username, password, name, surname and also a user counter which goes up
 * by one every time the main constructor of this class is called.
 * The classes: Doctor, Patient and Admin extend this Father class.
 * It contains 2 constructors. One that sets the charachteristics of the 
 * Users, and one that is used whenever a child class tries to use its own
 * constructor. For that reason alone there is a blank constructor only for this
 * purpose
 */
public class Users {
	
	private String username;
	private String password;
	private String name;
	private String surname; 
	static int usercount = 0;
	
	public String getUsername() 
	{
		return username;
	}
	
	public void setUsername(String username) 
	{
		this.username = username;
	}
	
	public String getPassword() 
	{
		return password;
	}
	
	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getSurname() 
	{
		return surname;
	}
	
	public void setSurname(String surname) 
	{
		this.surname = surname;
	}
	
	
	public static void login()
	{
		System.out.println("login method is working fine");
	}
	
	public static void logout()
	{
		System.out.println("logging out through the method... ");
	}
	
	public Users(String userName, String password, String firstName, String surName) 
	{
		this.setUsername(userName);
		this.setPassword(password);
		this.setName(firstName);
		this.setSurname(surName);
		this.usercount++;
	}
	
	public Users()
	{
		this.usercount++;
	}
	
//-----------------------------------------------------------------------------------------------
	public Users(String s) 
	{
		
		this.usercount++;
	}
	
	
}
