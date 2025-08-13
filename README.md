📚 **STUDENT MANAGEMENT SYSTEM** *(Java Collection Framework)*

📝 **PROJECT DESCRIPTION**
A **Java console-based application** for managing student records using the **Collection Framework**.  
This program allows you to **Add**, **Update**, **Display**, and **Delete** students,  
with all records stored in memory using `ArrayList` — no database required.

📂 **PROJECT STRUCTURE**
StudentManagement/
├── Student.java # POJO for student details (ID, Name, Age)
├── StudentUtility.java # CRUD operations using Collection Framework
├── StudentTest.java # Main menu-driven application

✨ **KEY FEATURES**
- ➕ **Add Student** – Store new student details.
- ✏️ **Update Student** – Modify existing student information by ID.
- 📜 **Display All Students** – Show all stored records in a clean format.
- ❌ **Delete Student** – Remove a student record by ID.
- ⚠ **Validation** – Handles invalid inputs and missing IDs.

🛠 **TECHNOLOGIES USED**
- ☕ **Java SE**
- 📚 **Java Collection Framework** (`List`, `ArrayList`, `Iterator`)
- ⌨ **Scanner** for user input

💡 **CONCEPTS APPLIED**
- **Encapsulation** – Private fields with getters & setters in `Student` class.
- **Abstraction** – Logic separated into `StudentUtility` class.
- **Collection Framework** – Efficient in-memory storage using `ArrayList`.
- **Iterators** – Safe traversal & deletion of elements.
- **Control Flow** – Menu-driven looping with conditional validation.

📸 SAMPLE OUTPUT

		STUDENT PROJECT MANAGEMENT
=======================================================
1. Add Student
2. Update Student
3. Display All Student
4. Delete Student
5. Exit

Select operation:

Enter student id: 101
Enter student name: John
Enter student age: 20
Student Added Successfully
