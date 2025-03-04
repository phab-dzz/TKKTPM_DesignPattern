package iuh.fit.edu.vn.DesignPattern;

public class DecoratorPatternEmployee implements  DesignPatternEmployee{
    private EmployeeComponent component;

    public DecoratorPatternEmployee(EmployeeComponent component) {
        this.component = component;
    }

    @Override
    public void execute() {
        if (component != null) {
            component.work();
        } else {
            System.out.println("Khong co cong viec xac dinh");
        }
    }
    public interface EmployeeComponent {
        void work();
    }

    // Lớp nhân viên cơ bản
    public static class BaseEmployee implements EmployeeComponent {
        @Override
        public void work() {
            System.out.println("Nhan vien lam viec co ban");
        }
    }

    // Decorator thêm chức năng cho nhân viên
    public static class DoiTruongDecorator implements EmployeeComponent {
        private EmployeeComponent employee;

        public DoiTruongDecorator(EmployeeComponent employee) {
            this.employee = employee;
        }

        @Override
        public void work() {
            employee.work();
            System.out.println("Đi tuan, Gan viec nhan vien");
        }
    }
}
