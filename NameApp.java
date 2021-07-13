import java.util.Scanner;

public class NameApp //define class.  

	{  

	public static void main(String[] args) //define main method.  

	{  

	String First_Name,Last_Name,generate_username; //define Variables  

	Scanner obj = new Scanner(System.in); //creating Scanner class object.  

	System.out.print("Please Enter First Name: "); // first name.  

	First_Name=obj.next(); //input first name.  

	System.out.print("Please Enter Last Name: "); // last name.  

	Last_Name=obj.next(); //input Last name.  
	obj.close(); 

	System.out.println("Name you insert is:"+First_Name+" "+Last_Name); //Display First_Name and Last_Name.  

	int addnumber= 10 + (int)(Math.random()*99); //use random function for number (10-99).  

	generate_username=First_Name.substring(0,1)+Last_Name.substring(0,5)+addnumber; //First_Name+Last_Name+addnumber.  

	System.out.println("Your generated name is: "+generate_username); //display generated name..  

	}  

	}
