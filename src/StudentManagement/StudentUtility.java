package StudentManagement;
import java.util.Scanner;
import java.util.Iterator;
import java.util.List;

public class StudentUtility {
	static Scanner sc=new Scanner(System.in);
     //1. Add student
	public static Student addStudent() {
		
		Student s=new Student();
		System.out.println("Enter student id: ");
		s.setSid(sc.nextInt());
		System.out.println("Enter student name: ");
		s.setSname(sc.next());
		System.out.println("Enter student age: ");
		s.setAge(sc.nextInt());
		return s;
	}
	
	//2. Update student
	public static void updateStudent(List<Student> students) {
		System.out.println("Please enter update details");
		System.out.println("Enter sid: ");
		int id=sc.nextInt();
		System.out.println("Enter sname: ");
		String name=sc.next();
		System.out.println("Enter sage: ");
		int age=sc.nextInt();
		
		int count=0;
		for(Student s:students) {
			if(id==s.getSid()) {
			      break;
		    }
			count++;
		}
		students.get(count).setSname(name);
		students.get(count).setAge(age);
	}
	
	//3. Display student
	public static void displayStudent(List<Student> students) {
		Iterator<Student> studentIterator = students.iterator();
		while(studentIterator.hasNext()) {
			System.out.println(studentIterator.next().toString());
		}
	}
	
	//4. Delete student
	public static void deleteStudent(List<Student> students, int sid) {
		Iterator<Student> studentIterator = students.iterator();
		while(studentIterator.hasNext()) {
			Student s =studentIterator.next();
			if(s.getSid()==sid) {
				studentIterator.remove();
			}
		}
	}
	
}
