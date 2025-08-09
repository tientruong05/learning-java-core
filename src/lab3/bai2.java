package lab3;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        // Bài 2: Viết bảng cửu chương của 1 số nguyên bất kỳ

        Scanner scanner = new Scanner(System.in);

        // Nhập vào bảng cửu chương cần tính
        System.out.println("Bảng cửu chương");
        System.out.printf("Nhập vào bảng cửu chương bạn cần: ");
        int n = scanner.nextInt();

        // In ra bảng cửu chương
        for (int i = 1; i <= 10; i++) {
            int j = n * i;
            System.out.println(n + " * " + i + " = " + j);
        }

        scanner.close();
    }
}
