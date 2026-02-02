package lab1bai3;
import java.util.Scanner;
public class LAB1BAI3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập cạnh của hình lập phương: ");
		double canh = sc.nextDouble();
		
		double thetich = canh * canh * canh;
		
		System.out.println("Thể tích của hình lập phương là: " + thetich);
		
		sc.close();
	}

}
