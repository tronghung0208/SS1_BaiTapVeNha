package Modul_03_Buoi_01.baitap07;

import java.util.Scanner;

public class baitap07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số từ 0-9");
        int number = sc.nextInt();
        String readNumber="";
        switch (number) {

            case 0:
                readNumber = "Zero";
                break;
            case 1:
                readNumber = "One";
                break;
            case 2:
                readNumber = "Two";
                break;
            case 3:
                readNumber = "Three";
                break;
            case 4:
                readNumber = "Four";
                break;
            case 5:
                readNumber = "Five";
                break;
            case 6:
                readNumber = "Six";
                break;
            case 7:
                readNumber = "Seven";
                break;
            case 8:
                readNumber = "Eight";
                break;
            case 9:
                readNumber = "Nine";
                break;

            default:
                System.out.println("bạn phải nhập từ 0-9");
        }
        System.out.println(readNumber);
    }
}
