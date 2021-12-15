package basicClasses;

import javax.swing.JOptionPane;

/**
 * This class is the child of the Father class "Users" and its 
 * purpose is mainly to create new Patients and giving them a property
 * as well as being able to use all of the characteristics of the class
 * "Users". That means that it can take take such characteristics as:
 * username, password, name, surname. Finally, this class also contains
 * its own constructor for his own variables. By now this variables are:
 * problem (e.g. arthritis, pneumonia and other..)
 */
public class Patient extends Users
{
	private String problem;
	private String amka;

	public String getProblem() 
	{
		return problem;
	}

	public void setProblem(String problem) 
	{
		this.problem = problem;
	}
	
	public Patient(String myProblem, String AMKA)
	{
		this.setProblem(myProblem);
		this.setAmka(AMKA);
	}

	public String getAmka() 
	{
		return amka;
	}

	public void setAmka(String amka) 
	{
		this.amka = amka;
	}
	
//----------------------------------------------------------------------------------------------
	
	int registration(int xx) 
	{
		
		return xx;	
			
	}
	
	
	
	int AvailableAppointmentPro(int x) // analoga to x , tha ginete h epilogi tou giatrou 
	{
		return 0;
		
	}
	int AvailableAppointment(int s) // analoga to s , tha gineta kai h epilogi ths eidikotitas
	{
		return 0;
		
	}
	public static void ViewScheduledAppointments()
	{
		JOptionPane.showMessageDialog(null, "Thank you for using Java", "Yay, java", JOptionPane.PLAIN_MESSAGE);
	}
	void ViewAppointmentHistory()
	{
		
	}
	void AddImpliedIllnes() // den to exw valei akoma
	{
		System.out.println("implied illness method working ");
	}
	
}
