package finalProjectBasedOnTheLessonsCovere;

import java.util.Objects;

public class Employee {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private int department;
    private final int id;
    private static int idGenerator = 1;
    private double salary;

    public Employee(String firstName, String middleName, String lastName, int department, double salary) {
        id = idGenerator++;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printShortInfo(){
        System.out.println("ФИО: " + getFirstName() + " " + getMiddleName() + " "
        + getLastName() + " зарплата: " + getSalary());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && id == employee.id && salary == employee.salary && Objects.equals(firstName, employee.firstName) && Objects.equals(middleName, employee.middleName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, middleName, lastName, department, id, salary);
    }

    @Override
    public String toString() {
        return "id: " + getId() + " ФИО: " + getFirstName() + " " + getMiddleName() + " " + getLastName()
                + " отдел: " + getDepartment() + " зарплата: " + String.format("%.2f", getSalary());
    }
}
