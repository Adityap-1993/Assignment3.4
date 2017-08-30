package assignment3__4;

import java.util.*; 

public class Student {  //class definition
	
	private String name;            //declaring variables
	private String phoneno;
	private int rollno;
	private int Class_std;
	
  //Defining getters and setters for accessing variables
	
	public String getName() {
		return name; 
	}
	
	public void setName(String name) {
		this.name=name;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getClass_std() {
		return Class_std;
	}

	public void setClass_std(int class_std) {
		Class_std = class_std;
	}

	
	public boolean result(int rollno) {   //defining method for result
		
		double sub1,sub2,sub3,avg;
		
		String res;                          
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter the marks");   //taking mark for subjects
		sub1=sc.nextInt();
		sub2=sc.nextInt();
		sub3=sc.nextInt();
		
		
		avg=(sub1+sub2+sub3)/3.0d;            //calculating average
		
		
		
		
		if(avg<35)          //condition for fail
			return false;
		else 
			return true;
		
		

		
		
	}
	
}//class end
