package lab2;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        // Bài 3: Viết chương trình tính số tiền điện (in kết quả ra console)
        // Yêu cầu: nhập vào số điện, sau đấy tính số tiền dựa vào quy luật sau:
        // - Nếu số điện sử dụng từ 0 tới 100, giá mỗi số điện là 1000 - Từ số điện 101 (tức là > 100), giá mỗi số điện là 1500

        Scanner scanner = new Scanner(System.in);

        // Nhập vào số điện
        System.out.println("Chương trình tính số tiền điện");
        System.out.print("Nhập vào số điện: ");
        int electricityNumber = scanner.nextInt();

        // Tính số tiền điện và in ra màn hình
        if (electricityNumber > 0 && electricityNumber <= 100) {
            electricityNumber *= 1000;
            System.out.print("Số tiền điện phải trả là: " + electricityNumber);
        } else if (electricityNumber > 100) {
            electricityNumber *= 1500;
            System.out.print("Số tiền điện phải trả là: " + electricityNumber);
        } else {
            System.out.println("Số điện không được phép âm, nhập vào số điện đúng!");
        }

        scanner.close();
    }
}
