package lab3;

import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số sinh viên: ");
        int n = sc.nextInt();
        sc.nextLine(); // bỏ enter

        String[] hoten = new String[n];
        double[] diem = new double[n];

        // ===== Nhập =====
        for (int i = 0; i < n; i++) {
            System.out.println("\nSinh viên thứ " + (i + 1));
            System.out.print("Họ tên: ");
            hoten[i] = sc.nextLine();

            System.out.print("Điểm: ");
            diem[i] = sc.nextDouble();
            sc.nextLine(); // bỏ enter
        }

        // ===== Xuất danh sách ban đầu =====
        System.out.println("\n===== DANH SÁCH SINH VIÊN =====");
        for (int i = 0; i < n; i++) {
            System.out.println("Họ tên: " + hoten[i]);
            System.out.println("Điểm: " + diem[i]);
            System.out.println("Học lực: " + xepLoai(diem[i]));
            System.out.println("-------------------");
        }

        // ===== Sắp xếp tăng dần theo điểm =====
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (diem[i] > diem[j]) {

                    // đổi điểm
                    double tempDiem = diem[i];
                    diem[i] = diem[j];
                    diem[j] = tempDiem;

                    // đổi họ tên tương ứng
                    String tempTen = hoten[i];
                    hoten[i] = hoten[j];
                    hoten[j] = tempTen;
                }
            }
        }

        // ===== Xuất danh sách sau khi sắp xếp =====
        System.out.println("\n===== DANH SÁCH SAU KHI SẮP XẾP =====");
        for (int i = 0; i < n; i++) {
            System.out.println("Họ tên: " + hoten[i]);
            System.out.println("Điểm: " + diem[i]);
            System.out.println("Học lực: " + xepLoai(diem[i]));
            System.out.println("-------------------");
        }

        sc.close();
    }

    // ===== Hàm xếp loại =====
    public static String xepLoai(double diem) {
        if (diem < 5) {
            return "Yếu";
        } else if (diem < 6.5) {
            return "Trung bình";
        } else if (diem < 7.5) {
            return "Khá";
        } else if (diem < 9) {
            return "Giỏi";
        } else {
            return "Xuất sắc";
        }
    }
}