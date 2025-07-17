package javaassignment;

import java.util.Scanner;

public class MiniProjectDriver 
{
	  public static void main(String[] args)
	  {
		 Scanner scn = new Scanner (System.in);
		 
		 System.out.println("Enter the Tutorial Name :");
		 String name1 = scn.next();
		 System.out.println("Enter the Tutorial Location :");
	     String loc1 = scn.next();
	     System.out.println("Enter the Tutorial Teacher Name :");
	     String teachname1 = scn.next();
	     System.out.println("Enter the Subject Handled :");
	     String sub1 = scn.next();
	     
	     Tutorial t = new Tutorial(name1, loc1, teachname1, sub1);  // another class object
	    
	     boolean control = true;
	     
	     while(control)
	      {
	    	 System.out.println("Enter the option : \n 1 ==> ADMIT STUDENT \n 2 ==> REMOVE STUDENT \n 3 ==> STUDENT DETAILS \n 4 ==> TUTORIAL DETAILS \n 5 ==> EXIT");
	    	 int option = scn.nextInt();
	    	
	    	 switch(option)
	    	 {
	    	 case 1:
	    	 {
	    		 t.admitStudent();
	    	 }
	    	 break;
	    	 case 2:
	    	 {
	    		 t.removeStudent();
	    	 }
	    	 break;
	    	 case 3:
	    	 {
	    		 t. stu.StudentDetails();	 
	    	 }
	    	 break;
	    	 case 4:
	    	 {
	    		 t.TutorialDetails();
	    	 }
	    	 break;
	    	 case 5:
	    	 {
	    		 control = false; // terminating the loop
	    		 System.out.println("EXIT");
	    	 }
	    	 break;
	    	 default:
	    	 {
	    		 System.out.println("Please Enter the Valid Option!");
	    	 }
	        }  	 
	 	 }
	   }
	 }
	class Tutorial // another class
	{
	String name;
	String location;
	String teachername;
	String subject;
	Student stu; // dependent class variable
	                                            // Creating a place for the student with in the tutorial
	Tutorial(String name, String location, String teachername, String subject)
	{
		this.name = name;
		this.location = location;
		this.teachername = teachername;
		this.subject = subject;
	}
	// helper method  // non static method // no argument method
	public void admitStudent()
	{
		// Verification and Validation
		if (stu == null)
		{
			Scanner s = new Scanner (System.in);
			System.out.println("Enter the student name :");
			String sname1 = s.next();
			System.out.println("Enter the student ID :");
			int id1 = s.nextInt();
			System.out.println("Enter the percentage secured :");
	      	float per1 = s.nextFloat();
	      	System.out.println("Enter the student contact number :");
	      	long cno1 = s.nextLong();
	      	
	      	stu = new Student(sname1, id1, per1, cno1);
	      	
	      	System.out.println("Student got the addmition! ");
		}
		else
		{
			System.out.println("Addmision Closed!");
		}
	}
	public void removeStudent()
	{
	 //Verification and Validation 
		if (stu != null)
		{
			stu = null;
			System.out.println("Student got removed!");
		}
		else
		{
			System.out.println("No Student Exists! ");
	}
	}
	public void TutorialDetails()
	{
		System.out.println("***************** TUTORIAL DETAILS *****************");
		System.out.println("The name of the tutorial is :"+name);
		System.out.println(" The location of the tutorial is :"+location);
		System.out.println("The teacher name is :"+teachername);
		System.out.println("The subjec handled is :"+subject);
		System.out.println("****************************************************");
	}
	}	
	class Student
	{
		private String sname;
	    private int sid;
	    private float percentage;
	    private long cno;
	      
	    public String getSname()
	    {
	    	return sname;
	    }
	    public int getSid()
	    {
	    	return sid;
	    }
	    public float getPercentage()
	    {
	    	return percentage;
	    }
	    public long getCno()
	    {
	    	return cno;
	    }

	 Student(String sname, int sid, float percentage, long cno)
	 {
		 this.sname = sname;
		 this.sid = sid;
		 this.percentage = percentage;
		 this.cno = cno;
	 }
	 
	 public void StudentDetails()
	 {
		 System.out.println("**************** STUDENT DETAILS ****************");
		 System.out.println("Enter the name of the student :"+sname);
		 System.out.println("Enter the ID if the student :"+sid);
		 System.out.println("Enter the percentage of the student :"+percentage);
		 System.out.println("Enter the contact number of the student :"+cno);
		 System.out.println("*************************************************");
	 }
	}

