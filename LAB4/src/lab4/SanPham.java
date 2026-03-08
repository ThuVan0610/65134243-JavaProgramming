package lab4;
import java.util.Scanner;
public class SanPham {
	// khai báo thuộc tính
	String tenSp;
	double donGia;
	double giamGia;
	// khai bao phương thức
	Scanner sc = new Scanner(System.in);
	public void Nhap() {
		System.out.print("Nhập tên sản phẩm: ");
		tenSp = sc.nextLine();
		
		System.out.print("Nhập đơn giá: ");
		donGia = sc.nextDouble();
		
		System.out.print("Nhập giảm giá: ");
		giamGia = sc.nextDouble();
	}
	
	public double getThueNhapKhau() {
		return donGia*0.1;
	}
	
	public void Xuat() {
		System.out.println("Tên sản phẩm: " + tenSp);
		System.out.println("Đơn Giá: " + donGia);
		System.out.println("Giảm giá: " + giamGia);
		System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SanPham sp = new SanPham();
		
		sp.Nhap();
		System.out.println("--- Thông tin sản phẩm ---");
		sp.Xuat();
	}
}
