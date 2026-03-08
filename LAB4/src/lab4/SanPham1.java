package lab4;

public class SanPham1 {
	String tenSp;
	double donGia;
	double giamGia;
	
	// có mã giảm. khác với khai báo thuộc tính. constructor không có void
	public SanPham1(String tenSp, double donGia, double giamGia) {
		this.tenSp = tenSp;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
	
	// không có mã giảm
	public SanPham1(String tenSp, double donGia) {
		this(tenSp, donGia, 0);
	}
	
	// phương thức tính thuế 
	private double getThueNhapKhau() {
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
		
		// sản phẩm có giảm giá
        SanPham1 sp1 = new SanPham1("Laptop", 20000, 1000);

        // sản phẩm không giảm giá
        SanPham1 sp2 = new SanPham1("Chuột", 500);

        System.out.println("Thông tin sản phẩm 1:");
        sp1.Xuat();

        System.out.println("\nThông tin sản phẩm 2:");
        sp2.Xuat();
	}

}
