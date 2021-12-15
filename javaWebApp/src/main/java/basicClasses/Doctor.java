package basicClasses;
/**
 * This class is the child of the Father class "Users" and its 
 * purpose is mainly to create new Doctors and giving them a property
 * as well as being able to use all of the charachteristics of the class
 * "Users". That means that it can take take such characteristics as:
 * username, password, name, surname. Finally, this class also contains
 * its own constructor for his own variables. By now this variables are:
 * property
 */
public class Doctor extends Users
{
	private String property;

	public String getProperty() 
	{
		return property;
	}

	public void setProperty(String property) 
	{
		this.property = property;
	}
	
	public Doctor(String myProperty)
	{
		this.setProperty(myProperty);
	}
	
//--------------------------------------------------------------------------------------------
	
	void SetAvailabilityPerMonth()
	{
		System.out.println("seting availability method working"); 
	}
	void ViewAppointmentSchedule()
	{
		
	}
	
	int checkEx(int a) 
	{
		System.out.println("the int u inputed is " + a);
		return 0;
	}
	
}
