
/**
 *This classs is the child of the father class Users , it inherits characteristics from Users,Doctors and Patients
 *This class contains 1 subclass and 
 */
package basicClasses;

import basicClasses.Doctor;

public class Appointment1 extends Patient
{
	Appointment1(String s)
	{
		
		super(s,s);
		
	}		

	static class Apo2 extends Doctor
	{
		Apo2(String s) 
		{
			super(s);
			
		}

		void APP()
		{
			System.out.println("appointment method working");
			System.out.println("New appointment has been made");
		}
		
	}
}
