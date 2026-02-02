package lab1ba4;
import java.util.Scanner;
public class LAB1BAI4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// phương trình bậc hai: ac^2 + bx + c = 0
		System.out.print("Nhập hệ số a: ");
		double a = sc.nextDouble();
		System.out.print("Nhập hệ số b: ");
		double b = sc.nextDouble();
		System.out.print("Nhập hệ số c: ");
		double c = sc.nextDouble();
		
		double delta = Math.pow(b,2) - 4 * a * c;
		System.out.println("\nDelta: " + delta);
		if(delta >= 0) {
			double candelta = Math.sqrt(delta);
			System.out.println("\nCăn Delta: " + candelta);
		}else {
			System.out.println("Delta âm, không có căn bậc hai thực.");
		}
		sc.close();
	}

}
