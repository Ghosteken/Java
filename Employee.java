class Employee {
    private double salary;

    public void work() {
        System.out.println("The employee is working.");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class HRManager extends Employee {
    public void work() {
        System.out.println("The HR manager is managing human resources.");
    }

    public void addEmployee() {
        System.out.println("The HR manager is adding a new employee.");
    }
}

