class MarkOutOfBoundsException extends Exception {
    public MarkOutOfBoundsException(String message) {
        super(message);
    }
}

class Student {
    private String name;
    private int mark;

    public Student(String name, int mark) throws MarkOutOfBoundsException {
        this.name = name;
        if (mark < 0 || mark > 100) {
            throw new MarkOutOfBoundsException("Mark is out of bounds (0-100): " + mark);
        }
        this.mark = mark;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Mark: " + mark);
    }
}

public class MarkValidation {
    public static void main(String[] args) {
        try {
            Student student1 = new Student("Alice", 95);
            student1.displayInfo();

            // Attempt to create a student with an out-of-bounds mark
            Student student2 = new Student("Bob", 110);
            student2.displayInfo();
        } catch (MarkOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
