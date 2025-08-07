package lab1;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        // Bài 2: Viết chương trình nhập từ bàn phím 2 cạnh của 1 hình chữ nhật.
        // Tính toán và in ra console: - chu vi hình chữ nhật - diện tích hình chữ nhật - cạnh nhỏ nhất của hình chữ nhật

        Scanner scanner = new Scanner(System.in);

        // Nhập vào chiều dài hình chữ nhật
        System.out.print("Nhập vào chiều dài hình chữ nhật: ");
        int length = scanner.nextInt();

        // Nhập vào chiều rộng hình chữ nhật
        System.out.print("Nhập vào chiều rộng hình chữ nhật: ");
        int width = scanner.nextInt();

        // Tính toán và in ra console: - chu vi hình chữ nhật - diện tích hình chữ nhật - cạnh nhỏ nhất của hình chữ nhật
        int perimeter = (length + width) * 2;
        int area = length * width;
        System.out.printf("Chu vi hình chữ nhật là %d - Diện tích hình chữ nhật là %d - Cạnh nhỏ nhất của hình chữ nhật là %d",
                perimeter, area, Math.min(length, width));

        scanner.close();
    }
}
