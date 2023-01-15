package lab02;

import java.util.*;

//class name starts with uppercase and noun a/c to naming convention

public class GPA extends Main_Method { 
	
	Scanner sc=new Scanner(System.in);
	double gpa;
	
	//method name starts with lowercase  and adjective a/c to naming convention
	public  void calculate_gpa() { 
		
		int numOfSubjects= 5;
		double[] marks=new double[numOfSubjects];
		 
	     System.out.println("Enter marks of All Subjects");
	 
	     for(int i=0;i<numOfSubjects;i++)
	     {
	        marks[i]=sc.nextInt();
	     }
	 
	     double grade[]=new double[numOfSubjects];
	     double sum=0;
	     for(int i=0;i<numOfSubjects;i++)
	     {
	        grade[i]=(marks[i]/10) ;
	     }
	 
	     for(int i=0;i<numOfSubjects;i++)
	     {
	       sum+=grade[i];
	     }
	 
	     gpa=sum/numOfSubjects;
		
		
	}

}



