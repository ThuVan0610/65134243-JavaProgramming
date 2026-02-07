package lap2;

import java.util.Scanner;

public class LAB2BAI4 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			while (true) {
				menu();
			}
	}
	
	// MENU
	public static void menu() {
		System.out.println("+-----------------------------------+");
		System.out.println("1. Giải phương trình bậc nhất");
		System.out.println("2. Giải phương trình bậc 2 ");
		System.out.println("3. Tính tiền điện");
		System.out.println("4. Kết thúc");
		System.out.println("+-----------------------------------+");
		System.out.println("Chọn chức năng");
		
		int chon = sc.nextInt();
		
		switch (chon) {
		case 1:
			GPTB1();
			break;
		case 2:
			GPTB2();
			break;
		case 3:
			Tinhtiendien();
			break;
		case 4:
			System.out.println("Thoát chương trình");
			System.exit(0);
			break;
		default:
			System.out.println("Chọn sai chức năng, vui lòng chọn lại");
		}
	}
	// BAI 1
	public static void GPTB1() {
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
	// BAI 2
	public static void GPTB2() {
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
	}

	// BAI 3
	public static void Tinhtiendien() {
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
		
	}
}
