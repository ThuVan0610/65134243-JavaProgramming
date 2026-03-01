package lab3;
import java.util.Arrays;
import java.util.Scanner;
public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new Scanner(System.in);
		
		// nhập số phần tử
		System.out.print("Nhập số phần tử của mảng: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		// nhập mảng
		for(int i=0; i<n; i++) {
			System.out.print("Nhập phần tử a[" +i+ "]: ");
			a[i] = sc.nextInt();
		}
		//  sắp xếp mảng
		Arrays.sort(a);
		
		// xuất mảng sau khi sắp xếp
		System.out.println("Mảng sau khi sắp xếp: ");
		for(int i=0; i<n; i++) {
			System.out.print(a[i] + " ");
		}
		// tìm phần tử nhỏ nhất
		int min = a[0]; // sau khi sort thì a[0] là nhỏ nhất
		for(int i=0; i<n; i++) {
			min = Math.min(min, a[i]);
		}
		System.out.println("\nPhần tử nhỏ nhất: " + min);
		// tính trung bình cộng các phần tử chia hết cho 3
		int tong = 0;
		int dem = 0;
		
		for(int i=0; i<n; i++) {
			if(a[i] % 3 == 0) {
				tong += a[i];
				dem++;
			}
		}
		if(dem>0) {
			double tb = (double) tong/dem;
			System.out.println("\nTrung bình cộng các số chia hết cho 3: " + tb);	
		}else {
			System.out.println("Không có số nào chia hết cho 3");
		}
		sc.close();
	}
}
