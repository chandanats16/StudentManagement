package StudentManagement;
import java.util.*;

public class StudentTest {
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<Student>();
		int count=0;
		while(true) {
			if(count!=0) {
				System.out.println("\n\n Do you want to continue, then press yes");
				String continues= sc.next();
				if(continues.equalsIgnoreCase("yes")) {
					
				}else {
					System.exit(0);
				}
			}
			count++;
			System.out.println("\t\tSTUDENT PROJECT MANAGEMENT");
			System.out.println("=======================================================");
			System.out.println("1.Add Student\n2.Update Student\n3.Display All Student\n4.Delete Student\n5.Exit\n");
			System.out.println("Select operation: ");
			int option=sc.nextInt();
			
			switch(option) {
			case 1:
				// Add student
				Student student=StudentUtility.addStudent();
				studentList.add(student);
				System.out.println("Student Added Successfully");
				break;
				
			case 2:
				// Update student
				StudentUtility.updateStudent(studentList);
				System.out.println("Student updated successfully");
				
			case 3:
				// Display student
				StudentUtility.displayStudent(studentList);
				break;
				
			case 4:
				// Delete student
				System.out.println("Delete student option is proceed?");
				System.out.println("Enter student id: ");
				int sid=sc.nextInt();
				StudentUtility.deleteStudent(studentList, sid);
				System.out.println("Student deleted successfully");
				break;
				
			case 5:
				// Stop the program execution 
				System.exit(0);  break;
				
			default:
				System.out.println("Please enter correct option");
				break;
			}
		}

	}

}
