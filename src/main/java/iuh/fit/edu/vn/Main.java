package iuh.fit.edu.vn;

import iuh.fit.edu.vn.DesignPattern.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("-- No Design Pattern --");
        Employee emp1 = new Employee(new NoDPEmployee("Đội trưởng"));
        emp1.performJob();

        // State Pattern
        System.out.println("-- State Pattern --");
        StatePatternEmployee stateEmp = new StatePatternEmployee();
        stateEmp.setState(new StatePatternEmployee.DoiTruongState());
        Employee emp2 = new Employee(stateEmp);
        emp2.performJob();

        // Strategy Pattern
        System.out.println("-- Strategy Pattern --");
        StrategyPatternEmployee strategyEmp = new StrategyPatternEmployee();
        strategyEmp.setJobStrategy(new StrategyPatternEmployee.GiamDocJob());
        Employee emp3 = new Employee(strategyEmp);
        emp3.performJob();

        // Decorator Pattern
        System.out.println("-- Decorator Pattern --");
        DecoratorPatternEmployee.EmployeeComponent base = new DecoratorPatternEmployee.BaseEmployee();
        DecoratorPatternEmployee.EmployeeComponent decorated = new DecoratorPatternEmployee.DoiTruongDecorator(base);
        Employee emp4 = new Employee(new DecoratorPatternEmployee(decorated));
        emp4.performJob();
    }
}