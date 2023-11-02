class StudentDetail {
 
    String name;
    int id;
    String collegeName;

   
    public StudentDetail(String name, int id, String collegeName) {
        this.name = name;
        this.id = id;
        this.collegeName = collegeName;
    }

    
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("College Name: " + collegeName);
    }
}

public class StudentRecord {
    public static void main(String[] args) {
        
        StudentDetail student1 = new StudentDetail("Alice", 101, "MIT");
        StudentDetail student2 = new StudentDetail("Bob", 102, "MIT");
        StudentDetail student3 = new StudentDetail("Charlie", 103, "MIT");

        
        System.out.println("Student Record for MIT College:");
        System.out.println("");
        student1.displayDetails();
        System.out.println("");
        student2.displayDetails();
        System.out.println("");
        student3.displayDetails();
    }
}
