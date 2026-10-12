package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}

public class Main {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<Employee>();

        employees.add(new Employee(103, "Aman", 35000));
        employees.add(new Employee(101, "Priya", 45000));
        employees.add(new Employee(105, "Rahul", 30000));
        employees.add(new Employee(102, "Neha", 50000));
        employees.add(new Employee(104, "Riya", 40000));

        System.out.println("CREATE / READ");
        display(employees);

        for (Employee e : employees) {
            if (e.id == 103) {
                e.name = "Aman Sharma";
                e.salary = 38000;
                break;
            }
        }

        System.out.println("\nAFTER UPDATE");
        display(employees);

        Iterator<Employee> itr = employees.iterator();

        while (itr.hasNext()) {
            Employee e = itr.next();

            if (e.id == 105) {
                itr.remove();
                break;
            }
        }

        System.out.println("\nAFTER DELETE");
        display(employees);

        System.out.println("\nITERATOR: FORWARD");
        Iterator<Employee> iterator = employees.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nLISTITERATOR: FORWARD");
        ListIterator<Employee> listIterator = employees.listIterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("\nLISTITERATOR: BACKWARD");

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        Collections.sort(employees, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return Integer.compare(e1.id, e2.id);
            }
        });

        System.out.println("\nINCREASING ORDER OF ID");
        display(employees);

        Collections.sort(employees, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return Integer.compare(e2.id, e1.id);
            }
        });

        System.out.println("\nDECREASING ORDER OF ID");
        display(employees);
    }

    static void display(ArrayList<Employee> employees) {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}

