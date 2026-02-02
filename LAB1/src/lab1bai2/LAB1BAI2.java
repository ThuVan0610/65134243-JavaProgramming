package lab1bai2;
import java.util.Scanner;
public class LAB1BAI2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập chiều dài hình chữ nhật: ");
		double cdai = scanner.nextDouble();
		System.out.print("Nhập chiều rộng hình chữ nhật: ");
		double crong = scanner.nextDouble();
		
		double chuvi = (cdai + crong) *2;
		double dientich = cdai * crong;
		double canhnhonhat = Math.min(cdai, crong);
		
		System.out.println("--- Kết quả---");
		System.out.println("Chu vi hình chữ nhật: " + chuvi);
		System.out.println("Diện tích hình chữ nhật: " + dientich);
		System.out.println("Cạnh nhỏ nhất của hình chữ nhật: " + canhnhonhat);
		
		scanner.close();
	}

}
