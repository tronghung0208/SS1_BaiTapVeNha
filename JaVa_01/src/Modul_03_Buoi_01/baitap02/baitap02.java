package Modul_03_Buoi_01.baitap02;

import java.util.Scanner;

public class baitap02 {
    public static void main(String[] args) {

        double rate = 23000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập đơn vị tiền tệ bạn muốn chuyển đổi");
        String donViTienTeMuonChuyen = sc.nextLine();

        System.out.println("Nhập số tiền bạn muốn chuyển đổi");
        double tien = sc.nextDouble();

        if (donViTienTeMuonChuyen.equals("USD")) {

            System.out.println("VND= " + tien * rate + " đ");

        } else if (donViTienTeMuonChuyen.equals("VND")) {
            System.out.println("USD= " + tien / rate + " usd");
        }else{
            System.out.println("Không có đơn vị tiền tệ bạn yêu cầu");
        }
    }

}
