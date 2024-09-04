public class Main8 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.work();  // Output: The employee is working.

        HRManager hrManager = new HRManager();
        hrManager.work();         // Output: The HR manager is managing human resources.
        hrManager.addEmployee();  // Output: The HR manager is adding a new employee.  

        hrManager.setSalary(5000.0);
        System.out.println("Salary: " + hrManager.getSalary());  // Output: Salary: 5000.0
    }
}

