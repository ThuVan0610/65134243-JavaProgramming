package thetich;
import java.util.Scanner;
public class TheTich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập cạnh của khối lập phương: ");
        double canh = sc.nextDouble();
        double theTich = Math.pow(canh, 3);
        System.out.println("\n--- KẾT QUẢ ---");
        System.out.println("Thể tích khối lập phương: " + theTich);
        sc.close();
	}

}
