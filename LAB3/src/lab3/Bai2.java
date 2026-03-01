package lab3;

public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// vòng lặp ngoài chạy từ 1 - 9 ( 9 bảng cửu chương)
		for(int i=1; i<=9; i++) {
			System.out.println("==== BẢNG CỬU CHƯƠNG " + i + " ====");
			
			// vòng lặp trong chạy từ 1 - 10 ( nhân từ 1 - > 10)
			for(int j=1; j<=10; j++) {
				System.out.printf("%d x %d = %d", i, j, i*j);
				System.out.println();
			}
			System.out.println(""); // dùng để xuống dòng
		}
	}	
}
