package lab3;
import java.util.Scanner;
public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// So nguyên tố là số > 2 chia hết cho 1 và chính nó
		System.out.println("Nhập số nguyên N: ");
		int N = sc.nextInt();
		
		// đánh dấu N , nếu N chia cho số khác nó và khác 1 sẽ đổi thành false
		boolean ok = true;
		
		if (N < 2) {
			ok = false; // SNT phải lớn hơn 2
		}else {
			for(int i = 2; i <= N/2; i++) {
				if(N % i == 0) { //ko có số nguyên tố
					ok = false;
					break;
				}
			}
		}
		if (ok) {
			System.out.println(N + " là số nguyên tố"); // true
		}else {
			System.out.println(N + " không phải là số nguyên tố");
		}
		sc.close();
	}

}
