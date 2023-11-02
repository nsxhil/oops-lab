import java.util.ArrayList;
import java.util.List;

class Stack<T> {
    private List<T> elements = new ArrayList<>();

    public void push(T item) {
        elements.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements.remove(elements.size() - 1);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String toString() {
        return "Student: " + name;
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

 
    public String toString() {
        return "Employee: " + name;
    }
}

public class stackclass {
    public static void main(String[] args) {
        Stack<Student> studentStack = new Stack<>();
        studentStack.push(new Student("Alice"));
        studentStack.push(new Student("Bob"));

        while (!studentStack.isEmpty()) {
            System.out.println(studentStack.pop());
        }

        Stack<Employee> employeeStack = new Stack<>();
        employeeStack.push(new Employee("John"));
        employeeStack.push(new Employee("Mary"));

        while (!employeeStack.isEmpty()) {
            System.out.println(employeeStack.pop());
        }
    }
}
