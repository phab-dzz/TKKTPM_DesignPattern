package iuh.fit.edu.vn.DesignPattern;

public class Employee {
    private DesignPatternEmployee dpEmployee;

    public Employee(DesignPatternEmployee dpEmployee) {
        this.dpEmployee = dpEmployee;
    }

    public void performJob() {
        dpEmployee.execute();
    }
}
