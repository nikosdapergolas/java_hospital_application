package basicClasses;


/**
 * This class is the child of the Father class "Users" and its 
 * purpose is mainly to create new Admins and giving them a nickName
 * as well as being able to use all of the charachteristics of the class
 * "Users". That means that it can take take such characteristics as:
 * username, password, name, surname. Finally, this class also contains
 * its own constructor for his own variables. By now this variables are:
 * nickname. Also there is a method in this class that for now it just
 * greets the user
 */
public class Admin extends Users
{
	private String adminID; //  This is an ID that all admins will have to write down in the specified textbox
							//(besides the username and passord) in order to be able to login as an admin
							// ***endexetai na to allaksw na einai apla mia statherh metavliti kai oxi na thn dinei  xrhsths***

	public String getMyNickName() 
	{
		return adminID;
	}

	public void setMyNickName(String myName) 
	{
		this.adminID = myName;
	}
	
	public Admin(String name)
	{
		this.setMyNickName(name);
	}
	
	public static void administratorMethod()
	{
		System.out.println("Hello from the administrator method!");
	}
	
}
