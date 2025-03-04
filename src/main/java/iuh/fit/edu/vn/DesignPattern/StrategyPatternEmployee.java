package iuh.fit.edu.vn.DesignPattern;

public class StrategyPatternEmployee implements DesignPatternEmployee{
    private JobStrategy jobStrategy;

    public void setJobStrategy(JobStrategy jobStrategy) {
        this.jobStrategy = jobStrategy;
    }
    @Override
    public void execute() {
        if (jobStrategy != null) {
            jobStrategy.execute();
        } else {
            System.out.println("Khong co cong viec xac dinh");
        }
    }
    public interface JobStrategy {
        void execute();
    }

    // Các chiến lược cụ thể
    public static class DoiTruongJob implements JobStrategy {
        @Override
        public void execute() {
            System.out.println("Di tuan, Gan viec nhan vien");
        }
    }

    public static class GiamDocJob implements JobStrategy {
        @Override
        public void execute() {
            System.out.println("Quan ly cong ty");
        }
    }

    public static class NhanVienVPJob implements JobStrategy {
        @Override
        public void execute() {
            System.out.println("Xu ly cong viec,Phe duyet ho so");
        }
    }
}
