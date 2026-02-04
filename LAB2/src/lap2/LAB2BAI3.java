package lap2;
import java.util.Scanner;
public class LAB2BAI3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập số điện đã sử dụng: ");
		int dien = sc.nextInt();
		
		int tien;
		if(dien <= 50) {
			tien = dien * 1000;
		}else {
			tien = 50 * 1000 + (dien - 50) * 1200;
		}
		
		System.out.println("Tổng tiền điện là: " + tien + " đồng");
		
		sc.close();
	}
}
