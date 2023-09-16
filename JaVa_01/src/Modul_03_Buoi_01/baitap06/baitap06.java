package Modul_03_Buoi_01.baitap06;

import java.util.Scanner;

public class baitap06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập số nguyên bất kì: ");
        int number = sc.nextInt();

        if (number%3==0&&number%5==0){
            System.out.println("Chia hết cho cả 3 và 5");
        } else if (number%3==0&&number%5!=0) {
            System.out.println("Chỉ chia hết cho 3");
        } else if (number%3!=0&&number%5==0) {
            System.out.println("Chỉ chia hết cho 5");
        }else {
            System.out.println("Không chia hết cho cả 3 và 5");
        }
    }
}
