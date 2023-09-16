package Modul_03_Buoi_01.baitap03;

import java.util.Scanner;

public class BaiTap03 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số: ");
        int number = sc.nextInt();

        if (number < 0) {
            return;
        } else if (number <= 10) {
            System.out.println(readNumber(number));
        } else if (number <= 19) {
            if (number % 10 == 5) {
                System.out.println("mười lăm");
            } else {
                System.out.println("mười " + readNumber(number % 10));
            }

        } else if (number < 100) {
            if (number % 10 == 0) {
                System.out.println(readNumber(number % 10) + "mươi ");
            } else if (number % 10 == 1) {
                System.out.println(readNumber(number / 10) + "mươi mốt");
            } else if (number % 10 == 5) {
                System.out.println(readNumber(number / 10) + "mươi lăm");
            } else {
                System.out.println(readNumber(number / 10) + "mươi " + readNumber(number % 10));
            }

        } else {

            int tram = number / 100;
            int chuc = (number % 100) / 10;
            int donVi = (number % 10);
            if (chuc == 0) {
                if (donVi == 0) {
                    System.out.println(readNumber(tram) + "trăm");
                } else {
                    System.out.println(readNumber(tram) + "trăm linh " + readNumber(donVi));
                }
            } else if (chuc == 1) {
                if (donVi == 0) {
                    System.out.println(readNumber(tram) + "trăm mười");
                } else {
                    System.out.println(readNumber(tram) + "trăm mười " + readNumber(donVi));
                }


            } else {
                if (donVi == 1) {
                    System.out.println(readNumber(tram) + "trăm " + readNumber(chuc) + "mươi mốt");
                } else if (donVi == 5) {
                    System.out.println(readNumber(tram) + "trăm" + readNumber(chuc) + "mươi lăm");
                }else{ System.out.println(readNumber(tram) + "trăm " + readNumber(chuc) + "mươi "+readNumber(donVi));}

            }

        }


    }

    public static String readNumber(int number) {
        switch (number) {
            case 0:
                return "không ";
            case 1:
                return "một ";
            case 2:
                return "hai ";
            case 3:
                return "ba ";
            case 4:
                return "bốn ";
            case 5:
                return "năm ";
            case 6:
                return "sáu ";
            case 7:
                return "bảy ";
            case 8:
                return "tám ";
            case 9:
                return "chín ";
            case 10:
                return "mười ";

            default:
                return null;
        }
    }
}
