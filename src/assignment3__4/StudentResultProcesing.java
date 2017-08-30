package assignment3__4;
import java.util.*;

public class StudentResultProcesing extends Student {      //Class definition extended from parent
	
	 
	public void showDetails(StudentResultProcesing s) {         //method for showing  details 
		 
		
		
		Scanner sc=new Scanner(System.in);
		
		//getting inputs from user
		
		System.out.println(" ");                                     
		
		System.out.println("Please Enter the name of student.");
		s.setName(sc.nextLine());
		
		System.out.println("Enter the phone no.");
		s.setPhoneno(sc.nextLine());
		
		System.out.println("Enter the rollno.");
		s.setRollno(sc.nextInt());
		
		System.out.println("Enter the Class standard.");
		s.setClass_std(sc.nextInt());
		
		
		boolean result=result(getRollno());
		
		//printing details
		
		System.out.println("The name of student is : "+getName());
		
		System.out.println("The Phone no of student is : "+getPhoneno());
		
		System.out.println("The Roll no of student is : "+s.getRollno());
		
		System.out.println("The Class of student is : "+getClass_std());	
		
		
		
		if(result) {
			System.out.println("The student is Pass");
		}		
		else {
			System.out.println("The Student is Fail");
		}
		
	}
	


}//class ends
