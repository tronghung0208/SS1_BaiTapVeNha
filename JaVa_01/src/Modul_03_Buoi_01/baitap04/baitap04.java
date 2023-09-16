package Modul_03_Buoi_01.baitap04;

import java.util.Scanner;

public class baitap04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài (cm): ");
        double length = sc.nextDouble();
        System.out.println("Nhập chiều rộng (cm): ");
        double width = sc.nextDouble();

        System.out.println("Chu vi HCN: "+(length+width)*2+" cm");
        System.out.println("Diện tích HCN: "+(length*width)+" cm2");
    }
}
