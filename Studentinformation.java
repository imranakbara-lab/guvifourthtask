package quvitaskfor;

class AgenotwithinrangeExpection extends Exception {
	 
	 public AgenotwithinrangeExpection (String message) {
		 
		 super (message);
	 }
    }

class NamenotvalidExpection extends Exception {
	 
	 public NamenotvalidExpection (String message) {
		 super (message);
		 
	 }
    }

class Student {
	 
	 int rollno;
	 String name;
	 int age;
	 String course;
	 
	 Student(int rollno, String name, int age, String course )
	 
   throws AgenotwithinrangeExpection,NamenotvalidExpection {
		 
		 if (age < 15 || age>21) {
			 throw new AgenotwithinrangeExpection ("Age is not within the valid range (15–21)");
			  
			 
		 }
		 
		 if (!name.matches("[a-zA-Z ]+")) {
			 
			 throw new NamenotvalidExpection ("Names Contain number or spicial Charcter");
		 }
		 
	   this.rollno = rollno;
	   this.name = name;
	   this.age = age;
	   this.course = course;
	  }
	 
	 void display() {
		 
		 System.out.println("Roll No :" + rollno);
		 System.out.println("Name    :" + name);
		 System.out.println("Age     :" + age);
		 System.out.println("Course  :" + course);
		 
	 }
	 }

public class Studentinformation {
	
	public static void main (String args[]) {
		
		try {
			Student s1 = new Student (101,"Rames", 20, "Computer Science");
			s1.display();
			} catch (AgenotwithinrangeExpection | NamenotvalidExpection e) {
				
				System.out.println(e.getMessage());
				
			}
				
				
	}

}