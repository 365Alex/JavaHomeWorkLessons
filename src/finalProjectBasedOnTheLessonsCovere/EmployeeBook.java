package finalProjectBasedOnTheLessonsCovere;

public class EmployeeBook {
    private final Employee[] employees = new Employee[10];

    public void printEmpAllEmployees(){
        for (Employee employee : employees){
            if (employee != null){
                System.out.println(employee);
            }
        }
    }
    // Средняя зарплата
    public double calculateAverageSalary(){
        double sum = 0;
        double count = 0;
        for (Employee employee : employees){
            if (employee != null){
                sum += employee.getSalary();
                count++;
            }
        }
        if (count == 0){
            return 0;
        }
        return sum / count;
    }
    // налог 13%
    public void printTaxes(){
        for (Employee employee : employees){
            if (employee != null){
                double tax = employee.getSalary() * 0.13;
                System.out.println("Сотрудник: id: " + employee.getId() + " ФИО: " + employee.getFirstName() +
                        " " + employee.getMiddleName() + " " + employee.getLastName() + " отдел: " +
                        employee.getDepartment() + " зарплата: " + employee.getSalary() + " налог: " + tax);
            }
        }
    }
    // увеличиваем зарплату всех сотрудников на процент
    public void increaseAllSalaries(double percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                double newSalary = employee.getSalary() * (1 + percent / 100);
                employee.setSalary(newSalary);
            }
        }
    }
    // увеличиваем зарплату сотрудникам только одного отдела
    public void increaseSalariesInDepartment(int department, double percent){
        for (Employee employee : employees) {
            if (employee == null || employee.getDepartment() != department) {
                continue;
            }
            employee.setSalary(employee.getSalary() * (1 + percent / 100));
        }
    }
    /*
    Получить в качестве параметра номер отдела (1–5) и цифру зарплаты и вывести первого сотрудника
    этого отдела с зарплатой больше указанной вместе с порядковым номером в списке.
    Используйте цикл for и оператор break для поиска.
    В выводе используйте метод printShortInfo().
     */
    public void searchEmployeesDepartment(int department, double salary){
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() == department && employee.getSalary() > salary) {
                System.out.println("Порядковый номер: " + (i + 1));
                employee.printShortInfo();
                break;
            }
        }
    }
    /*
    Получить в качестве параметра цифру зарплаты wage и число сотрудников employeeNumber и вывести первые
    employeeNumber сотрудников с зарплатой меньше wage.
    Используйте для поиска цикл while и оператор break.
     */
    public void printFirstEmployeesWithSalaryBelow(int employeeNumber, double wage){
        int i = 0;
        int found = 0;
        while (i < employees.length) {
            if (employees[i] != null && employees[i].getSalary() < wage) {
                System.out.println(employees[i]);
                found++;
                if (found == employeeNumber) {
                    break;
                }
            }
            i++;
        }
    }
    /*
    Получить в качестве параметра объект сотрудника и вернуть boolean, есть ли такой сотрудник в массиве
    с точки зрения бухгалтерского учета (по зарплате) или нет.
    Сравнение проводится через equals.
     */
    public boolean hasEmployee(Employee employee){
        for (Employee emp : employees) {
            if (emp == null) {
                continue;
            }
            if (emp.equals(employee) ){
               return true;
            }
        }
        return false;
    }
    /*
   Добавьте метод наполнения EmployeeBook: метод должен найти свободную ячейку в массиве
    и положить в нее данные нового сотрудника. Поиск свободных ячеек происходит с начала массива.
    Если свободных мест для сотрудника нет, метод возвращает false.
    Если для сотрудника нашлось место, метод возвращает true.
     */
    public boolean addEmployee(Employee employee){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }
    /*
    Добавьте метод для получения сотрудника по id.
     */
    public Employee findById(int id){
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id){
                return employee;
            }
        }
        return null;
    }
    /*
    Получение сотрудников по отделу
     */
    public void printEmployeesDepartment(int department){
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department){
                System.out.println(employee);
            }
        }
    }


}
