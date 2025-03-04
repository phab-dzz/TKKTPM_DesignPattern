package iuh.fit.edu.vn.DesignPattern;

public class NoDPEmployee implements  DesignPatternEmployee{

    private String chucVu;

    public NoDPEmployee(String chucVu) {
        this.chucVu = chucVu;
    }
    @Override
    public void execute() {
        if (chucVu.equals("Doi truong")) {
            System.out.println("Di tuan, Gan viec nhan vien");
        } else if (chucVu.equals("Giam đoc")) {
            System.out.println("Quan ly cong ty");
        } else if (chucVu.equals("Nhan vien VP")) {
            System.out.println("Xu ly ho so, Phe duyet ho so");
        } else {
            System.out.println("Khong co cong viec xac dinh");
        }

    }
}
