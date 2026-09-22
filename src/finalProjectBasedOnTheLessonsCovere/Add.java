package finalProjectBasedOnTheLessonsCovere;

public class Add {
    public static void print(){
        System.out.println("=============================");
    }
    public static void main(String[] args){
        EmployeeBook employeeBook = new EmployeeBook();
        Employee employeeOne = new Employee("Елена", "Павлова", "Ивановна", 1, 210);
        Employee employeeTWo = new Employee("Светлана", "Николаева", "Николаевна", 2, 450);
        Employee employeeThree = new Employee("Павел", "Павлов", "Павлович", 3, 114);
        Employee employeeFour = new Employee("Петр", "Петров", "Петрович", 2, 450);
        Employee employeeFive = new Employee("Андрей", "Андреев", "Андреевич", 3, 116);
        Employee employeeSix = new Employee("Анна", "Макеева", "Андреевна", 1, 215);
        Employee employeeSeven = new Employee("Иван", "Иванов", "Иванович", 2, 354);
        System.out.println(employeeBook.addEmployee(employeeFive));
        System.out.println(employeeBook.addEmployee(employeeFour));
        System.out.println(employeeBook.addEmployee(employeeOne));
        System.out.println(employeeBook.addEmployee(employeeSeven));
        System.out.println(employeeBook.addEmployee(employeeThree));
        System.out.println(employeeBook.addEmployee(employeeSix));
        System.out.println(employeeBook.addEmployee(employeeTWo));
        employeeBook.printEmpAllEmployees();
        print();
        System.out.printf("Средняя зарплата сотрудников:  %.2f%n", employeeBook.calculateAverageSalary());
        print();
        employeeBook.printTaxes();
        print();
        employeeBook.increaseAllSalaries(2);
        employeeBook.printEmpAllEmployees();
        print();
        employeeBook.increaseSalariesInDepartment(2,2);
        employeeBook.searchEmployeesDepartment(2, 450);
        print();
        employeeBook.printFirstEmployeesWithSalaryBelow(2, 200);
        print();
        employeeThree.setDepartment(1);
        employeeBook.printEmpAllEmployees();
        print();
        System.out.println(employeeBook.hasEmployee(employeeFive));
        print();
        System.out.println(employeeBook.findById(3));
        print();
        employeeBook.printEmployeesDepartment(2);





    }
}
