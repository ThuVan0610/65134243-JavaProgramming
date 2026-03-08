package lab4;

public class Bai2  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SanPham sp1 = new SanPham();
		 SanPham sp2 = new SanPham();
		 
		 System.out.print("Nhập sản phẩm 1: ");
		 sp1.Nhap();
		 System.out.print("Nhập sản phẩm 2: ");
		 sp2.Nhap();
		 System.out.println("Thông tin sản phẩm 1: ");
		 sp1.Xuat();
		 System.out.println("Thông tin sản phẩm 2: ");
		 sp2.Xuat();
	}

}
