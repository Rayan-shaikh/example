package lab02;

public class Main_Method {
	
	
	public static void main(String args[]) {  
		
		Student std = new Student();
		std.student_details();
	    GPA gpa = new GPA();
	    gpa.calculate_gpa();
	    System.out.print("\n\n");
	    System.out.print("===========================================\n");
	    System.out.print("\n\n");
	    System.out.print("+++++ Marksheet +++++\n");
	    System.out.print("====Department:Software Engineering====\n");
	    System.out.print("Batch:2020F                 Semester: 5\n");
	    System.out.print("Name:"+ std.name+"\n");
	    System.out.print("GPA:"+ gpa.gpa);
	    System.out.print("\n\n");
	    System.out.print("===========================================");
	
		

		
		
		
		
	
			
		
		
		
		
		
		
		
		
	}
}
