package chuvidt;
import java.util.Scanner;
public class ChuViDT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập chiều dài: ");
        double chieuDai = sc.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double chieuRong = sc.nextDouble();
        double chuVi = (chieuDai + chieuRong) * 2;
        double dienTich = chieuDai * chieuRong;
        double canhNho = Math.min(chieuDai, chieuRong);
        System.out.println("\n--- KẾT QUẢ ---");
        System.out.println("Chu vi: " + chuVi);
        System.out.println("Diện tích: " + dienTich);
        System.out.println("Cạnh nhỏ: " + canhNho);
        sc.close();
	}

}
