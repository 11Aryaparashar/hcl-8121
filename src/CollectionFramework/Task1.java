package CollectionFramework;
import java.util.*;

class Student {
    String name;
    int rollNo;
    int age;

    Student(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + ", Roll No: " + rollNo + ", Age: " + age;
    }
}

public class Task1{
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>(10);

        students.add(new Student("Arya", 101, 21));
        students.add(new Student("Rahul", 102, 19));
        students.add(new Student("Priya", 103, 20));
        students.add(new Student("Aman", 104, 18));

        Collections.sort(students,
                (s1, s2) -> Integer.compare(s1.age, s2.age));

        System.out.println("Students sorted by age:");

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
