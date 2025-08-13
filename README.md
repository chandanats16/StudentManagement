# 📚 Student Management System (Java Collection Framework)

A **Java console-based application** to manage student records using the **Collection Framework**.  
It supports adding, updating, displaying, and deleting student details — all stored in memory using `ArrayList`.

## 📖 Project Flow :

┌──────────────────────────┐
│  Start Application       │
└───────────────┬──────────┘
                │
                ▼
     ┌─────────────────────┐
     │ Display Menu         │
     └───────┬─────────────┘
             │
     ┌───────▼─────────────┐
     │ User Selects Option │
     └───────┬─────────────┘
             │
   ┌─────────▼──────────┐
   │ Add / Update /      │
   │ Display / Delete    │
   └─────────┬──────────┘
             │
      ┌──────▼───────┐
      │ Repeat Menu? │
      └──────┬───────┘
             │Yes
             ▼
        (Back to Menu)
             │
             │No
             ▼
     ┌─────────────────────┐
     │ Exit Application    │
     └─────────────────────┘
📂 Project Structure :

StudentManagement/
│
├── Student.java          # POJO for student details (ID, name, age)
├── StudentUtility.java   # CRUD operations using Collection Framework
├── StudentTest.java      # Main menu-driven application

✨ Key Features :

➕ Add Student – Store student details in an ArrayList.

✏️ Update Student – Modify student info by searching with ID.

📜 Display All Students – View all records in a readable format.

❌ Delete Student – Remove a record by ID.

⚠ Validation – Handles invalid choices and missing IDs.

🛠️ Technologies Used :

☕ Java SE

📚 Java Collection Framework (List, ArrayList, Iterator)

⌨ Scanner for user input

💡 Concepts Applied :

Encapsulation – Student class fields are private with getters & setters.

Abstraction – Utility class (StudentUtility) to separate logic from UI.

Collection Framework – Efficient data storage using ArrayList.

Iterators – Safe traversal & removal of elements.

Control Flow & Loops – Menu-driven program with validation.
