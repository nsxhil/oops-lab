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
            throw new MarkOutOfBoundsException("Invalid mark. Mark should be between 0 and 100.");
        }
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }
}

public class MarkValidationDemo {
    public static void main(String[] args) {
        try {
            Student student1 = new Student("Alice", 95);
            System.out.println(student1.getName() + "'s mark is " + student1.getMark());

            Student student2 = new Student("Bob", 110); // This will throw a MarkOutOfBoundsException
        } catch (MarkOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
