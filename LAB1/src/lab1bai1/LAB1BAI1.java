package lab1bai1;
import java.util.Scanner;
public class LAB1BAI1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//nhap du lieu
		System.out.print("Họ và tên: ");
		String hoTen = scanner.nextLine();
		
		System.out.print("Điểm trung bình: ");
		double diemTB = scanner.nextDouble();
		
		// xuất dữ liệu
		System.out.printf("%s %.f điểm", hoTen, diemTB); // %s chuỗi 
		
		scanner.close();
	}

}
