package lap2;
import java.util.Scanner;
public class LAB2BAI1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// phương trình bậc nhất: ax + b = 0
		System.out.print("Nhập a: ");
		double a = sc.nextDouble();
		System.out.print("Nhập b: ");
		double b = sc.nextDouble();
		
		if(a==0) {
			if(b==0) {
				System.out.print("Phương trình vô số nghiệm");
			}else {
				System.out.print("Phương trình vô nghiệm");
			}
		}else {
			double x = -b/a;
			System.out.println("Nghiệm của phương trình: " + x);
		}
		
		sc.close();
	}

}
