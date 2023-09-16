package Modul_03_Buoi_01.baitap05;

import java.util.Scanner;

public class baitap05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm toán (0 đến 10): ");
        double math = sc.nextDouble();
        System.out.println("Nhập điểm lý (0 đến 10): ");
        double physics = sc.nextDouble();
        System.out.println("Nhập điểm hóa (0 đến 10): ");
        double chemistry = sc.nextDouble();
        System.out.println("Nhập điểm văn (0 đến 10): ");
        double literature = sc.nextDouble();
        System.out.println("Nhập điểm English (0 đến 10): ");
        double english = sc.nextDouble();

        double averageScore = (math + physics + chemistry + literature + english) / 5;

        if (math < 0 | math > 10 | physics < 0 | physics > 10 | chemistry < 0 | chemistry > 10 | literature < 0 | literature > 10 | english < 0 | english > 10) {
            System.out.println("Bạn nhập điểm chưa đúng");
        } else {
            if (averageScore < 5) {
                System.out.println("Xếp loại yếu");
            } else if (averageScore < 6.5) {
                System.out.println("Xếp loại trung bình");
            } else if (averageScore < 8) {
                System.out.println("Xếp loại khá");
            } else if (averageScore < 9) {
                System.out.println("Xếp loại giỏi");
            } else {
                System.out.println("Xếp loại xuất sắc");
            }
        }


    }
}
