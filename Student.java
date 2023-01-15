package lab02;
import java.util.*;
//class name starts with uppercase and noun a/c to naming convention
public class Student extends Main_Method { 
	
	
	String name; 
	int rollnum;
	Scanner scan = new Scanner(System.in);
	
	//method name starts with lowercase  and adjective a/c to naming convention	
public  void student_details() { 
		
		
	    System.out.print("Enter Your Name: ");
		name = scan.nextLine();
		System.out.print("Enter Your Roll Number: ");
		rollnum = scan.nextInt();
	
		
	}


}
	


