package lap2;
import java.util.Scanner;
public class LAB2BAI2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// phương trình bậc hai: ax^2 + bx + c = 0
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập a: ");
		double a = sc.nextDouble();
		System.out.print("Nhập b: ");
		double b = sc.nextDouble();
		System.out.print("Nhập c: ");
		double c = sc.nextDouble();
		
		if(a==0) { 
			// bx + c = 0
			if(b==0) {
				if(c==0) {
					System.out.println("Phương trình vô số nghiệm");
				}else {
					System.out.println("Phương trình vô nghiệm");
				}
			}else {
				double x = -c/b;
				System.out.println("Nghiệm của phương trình là x = " + x);
			}
		}else {
			// phương trình bậc hai 
			double delta = Math.pow(b,2) - 4*a*c;
			System.out.println("Delta = " + delta);
			if(delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			}else if(delta == 0) {
				double x = -b / (2*a);
				System.out.println("Phương trình có nghiệm kép x = " + x);
			}else {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("Phương trình có hai nghiệm phân biệt:");
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}
		sc.close();
	}

}
