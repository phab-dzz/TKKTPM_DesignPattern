package iuh.fit.edu.vn.DesignPattern;

import javax.swing.plaf.nimbus.State;

public class StatePatternEmployee implements  DesignPatternEmployee{
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void execute() {
        if (state != null) {
            state.handleRequest();
        } else {
            System.out.println("Khong co cong viec xac dinh");
        }

    }
    public interface State {
        void handleRequest();
    }

    // Các trạng thái cụ thể
    public static class DoiTruongState implements State {
        @Override
        public void handleRequest() {
            System.out.println("Di tuan, Gan viec nhan vien");
        }
    }

    public static class GiamDocState implements State {
        @Override
        public void handleRequest() {
            System.out.println("Quan ly cong ty");
        }
    }

    public static class NhanVienVPState implements State {
        @Override
        public void handleRequest() {
            System.out.println("Xu ly cong viec, Phe duyet ho so");
        }
    }

}
