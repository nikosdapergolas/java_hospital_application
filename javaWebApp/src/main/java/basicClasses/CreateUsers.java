package basicClasses;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;
import java.util.Vector;

import basicClasses.Appointment1.Apo2;


/**
 * This class is the class that contains the main() function
 * When the user starts the programm he is given the option to chose
 * from a list from activities and he is given the chance to interact
 * with methods of the Father class User, as well as with the child classes
 * like Doctor, Admin and Patient, all of which extend the superclass Users
 */
public class CreateUsers {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object	
		int answer;
		
		try 
		{
			System.out.println("hey there..Do you want to login?");
			System.out.println("press 1 to log in: ");
			
			
			answer = myObj.nextInt();  // Read user input	
			
			if(answer == 1)
			{
				Users.login();
				
				// Here's the menu that the user chooses his action
				System.out.println("Now that you are in, Here's a list of things that you can do:");
								
				System.out.println("1) Create an object of a Patient"); 
				System.out.println("2) Create an object of a Doctor");
				System.out.println("3) Create an object of an Admin");
				System.out.println("4) Make an apointment");
				System.out.println("5) enter a patient through a txt");
				System.out.println("Or type \"0\" to exit");
				Scanner myobj2 = new Scanner(System.in);
				int answer2 = myobj2.nextInt();
				
				
				/**
				 *This switch is the main "menu" of our program. THe user will get 
				 *to choose if he wants to login or not by pressing "1" 
				 */
				switch(answer2)
				{
					case(0):
						/**
						 *This choice is for when the user just wants to log out
						 *He logs out by using a method of the SuperClass Users 
						 */
						
						Users.logout();
						break;
					case(1):
						/**
						 *This choice is for when the user wants to create an new Patient 
						 *object. The user of the app will be asked to state the problem 
						 *of the Patient that will be set by the constructor of the class
						 *Also, he will be asked to fill in the inherited charachteristics
						 *of the superclass Users. These are the username, password, name
						 *and the surname 
						 */					
						
						//user inputs the problem and AMKA of the patient
						//Also the object Patient is being created
						System.out.println("Give the problem of the patient: ");
						Scanner problemObj = new Scanner(System.in);
						String problemGiven = problemObj.nextLine();
						
						System.out.println("Give the AMKA of the patient");
						Scanner amkaObj = new Scanner(System.in);
						String amkaGiven = amkaObj.nextLine();
						
						Patient p1 = new Patient(problemGiven, amkaGiven);
						System.out.println("Ok a new patient has been made with " + p1.getProblem());
						
						
						//user inputs the name of the Patient
						System.out.println("Give a name for the patient: ");
						Scanner nameObj = new Scanner(System.in); 
						String nameGiven = nameObj.nextLine();
						p1.setName(nameGiven);	
						System.out.println("Name of the patient: " + p1.getName());
						
						//user inputs the surname of the patient
						System.out.println("Give a surname of the patient");
						Scanner surnameObj = new Scanner(System.in);
						String surnameGiven = surnameObj.nextLine();
						p1.setSurname(surnameGiven);
						System.out.println("Surname of patient: " + p1.getSurname());
						
						//user inputs the username of the patient
						System.out.println("Enter a username for the patient");
						Scanner usernameObj = new Scanner(System.in);
						String usernameGiven = usernameObj.nextLine();
						p1.setUsername(usernameGiven);
						System.out.println("Username of the patient is: " + p1.getUsername());
						
						//user inputs the password of the patient
						System.out.println("Enter a password: ");
						Scanner passwordObj = new Scanner(System.in);
						String passwordGiven = passwordObj.nextLine();
						p1.setPassword(passwordGiven);
						System.out.println("password of the patient is: " + p1.getPassword());
						
						//final words about the new created object Patient
						System.out.println("New Patient made!");
						System.out.println("Now there are " + Users.usercount + " users");
						
						//Closing all the open Scanner objects
						passwordObj.close();
						usernameObj.close();
						surnameObj.close();
						problemObj.close();
						nameObj.close();
						break;
					case(2):
						/**
						 *This choice is for when the user wants to create an new Doctor 
						 *object. The user of the app will be asked to state the property 
						 *of the Doctor that will be set by the constructor of the class
						 *Also, he will be asked to fill in the inherited charachteristics
						 *of the superclass Users. These are the username, password, name
						 *and the surname 
						 */	
						
						//user inputs the property of the Doctor
						System.out.println("Give the property of the Doctor");
						Scanner propertyObj = new Scanner(System.in);
						String propertyGiven = propertyObj.nextLine();
						Doctor d1 = new Doctor(propertyGiven);
						System.out.println("Property of the Doctor is " + d1.getProperty());
						
												
						//user inputs the name of the doctor
						System.out.println("Enter the name of the doctor");
						Scanner nameObj2 = new Scanner(System.in);
						String givenName2 = nameObj2.nextLine();
						d1.setName(givenName2);
						System.out.println("Name of the doctor is: " + d1.getName());
						
						//user inputs the surname of the doctor
						System.out.println("ENter the surname of the doctor");
						Scanner surnameObj2 = new Scanner(System.in);
						String givenSurname2 = surnameObj2.nextLine();
						d1.setSurname(givenSurname2);
						System.out.println("Surname of the doctor now is: " + d1.getSurname());
						
						//user inputs the username of the doctor
						System.out.println("Enter a username for the doctor");
						Scanner usernameObj2 = new Scanner(System.in);
						String usernameGiven2 = usernameObj2.nextLine();
						d1.setUsername(usernameGiven2);
						System.out.println("Username of the doctor is: " + d1.getUsername());
						
						//user inputs the password of the doctor
						System.out.println("Enter a password: ");
						Scanner passwordObj2 = new Scanner(System.in);
						String passwordGiven2 = passwordObj2.nextLine();
						d1.setPassword(passwordGiven2);
						System.out.println("password of the doctor is: " + d1.getPassword());	
						
						//checking availability
						System.out.println("Checking the availability by using a method");
						d1.SetAvailabilityPerMonth();
						
						//Checking methods to see if they are working
						System.out.println("please give me an integer");
						Scanner myIntObject = new Scanner(System.in);
						int intGiven = myIntObject.nextInt();
						d1.checkEx(intGiven);
						
						//final words
						System.out.println("New Doctor made!");
						System.out.println("Now there are " + Users.usercount + " users");
						
						//Closing all the open Scanner objects
						passwordObj2.close();
						usernameObj2.close();
						surnameObj2.close();
						propertyObj.close();
						nameObj2.close();
						break;
					case(3):
						/**
						 *This choice is for when the user wants to create an new Admin 
						 *object. The user of the app will be asked to state the name 
						 *of the Admin that will be set by the constructor of the class
						 *Also, he will be asked to fill in the inherited charachteristics
						 *of the superclass Users. These are the username, password, name
						 *and the surname 
						 */
						
						//A greeting from the administrator method
						Admin.administratorMethod();
						
						//user inputs the adminID of the admin
						// mallon tha allaksei!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
						System.out.println("please enter the adminID of the admin");
						Scanner adminNameObj = new Scanner(System.in);
						String adminNameGiven = adminNameObj.nextLine();
						Admin a1 = new Admin(adminNameGiven);
						System.out.println("name of new admin is: " + a1.getMyNickName());
						
						//user inputs the name of the admin
						System.out.println("Enter the name of the admin");
						Scanner nameObj3 = new Scanner(System.in);
						String givenName3 = nameObj3.nextLine();
						a1.setName(givenName3);
						System.out.println("Name of the admin is: " + a1.getName());
						
						//user inputs the surname of the admin
						System.out.println("ENter the surname of the admin");
						Scanner surnameObj3 = new Scanner(System.in);
						String givenSurname3 = surnameObj3.nextLine();
						a1.setSurname(givenSurname3);
						System.out.println("Surname of the admin now is: " + a1.getSurname());
						
						//user inputs the username of the admin
						System.out.println("Enter a username for the admin");
						Scanner usernameObj3 = new Scanner(System.in);
						String usernameGiven3 = usernameObj3.nextLine();
						a1.setUsername(usernameGiven3);
						System.out.println("Username of the admin is: " + a1.getUsername());
						
						//user inputs the password of the admin
						System.out.println("Enter a password: ");
						Scanner passwordObj3 = new Scanner(System.in);
						String passwordGiven3 = passwordObj3.nextLine();
						a1.setPassword(passwordGiven3);
						System.out.println("password of the admin is: " + a1.getPassword());
						
						//final words
						System.out.println("New Admin made!");
						System.out.println("Now there are " + Users.usercount + " users");
						
						//Closing all the open Scanner objects
						passwordObj3.close();
						usernameObj3.close();
						surnameObj3.close();
						adminNameObj.close();
						nameObj3.close();
						
						break;
					case(4):
						
						Apo2 obj4 = new Apo2("");
						obj4.APP();
						
						break;
					case(5):
						System.out.println("Please state your problem ");
						Scanner nameTxtObj = new Scanner(System.in);
						String nameForTxt = nameTxtObj.nextLine();
						
						System.out.println("please enter your AMKA ");
						Scanner amkaTxtObj = new Scanner(System.in);
						String amkaForTxt = amkaTxtObj.nextLine();
						
						//writing in a txt file
						Writer wr1 = new FileWriter("create.txt");
			        	wr1.write(nameForTxt + " " + amkaForTxt);
			        	wr1.close();
			        	
			        	//Reading from a txt file
			        	
			        	Vector<String> vector = new Vector<>();
			        	
			        	Scanner s1 = new Scanner(new File("create.txt")).useDelimiter(" ");
			        	while (s1.hasNext()) {
			                vector.add(s1.next());
			            }
			        	
			        	String n1 = vector.get(0);
			        			        	
			        	String n2 = vector.get(1);
			        	
			        	Patient p2 = new Patient(n1,n2);
			        	
			        	System.out.println("name: " + p2.getProblem());
			        	System.out.println("AMKA " + p2.getAmka());
			        	
			        	amkaTxtObj.close();
			        	nameTxtObj.close();	
						break;
					default:
						System.out.println("hey..no such number in the list");					
				}
				myobj2.close();
			}
			else
			{
				System.out.println("Ok you dont want to login.");
			}
			
		}
		catch(java.util.InputMismatchException e)
		{
			System.out.println("Input MissMatch Exception occured");
			System.out.println("Programm is being terminated");
		}
		catch (NumberFormatException e) 
		{
			System.out.println("Number Format Exception occurred");
			System.out.println("Programm is being terminated");
		}
		catch(Exception e)
		{
			System.out.println("An unknown excepion has occured.");
			System.out.println("Programm is being terminated");
		}
		finally
		{
			//closing the object that oppened when i told the user
			//to enter the number 1 to log in
			myObj.close();
			System.out.println("Goodbye! thanks for using our program.");
		}	   
		
	}

}
