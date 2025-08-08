package lab2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        // Bài 2: Cho phương trình: ax^2 + bx + c = 0 Viết chương trình nhập vào 3 số nguyên a, b, c.
        // Tính toán nghiệm của phương trình trên

        Scanner scanner = new Scanner(System.in);

        // Nhập vào 3 số a, b và c
        System.out.println("Tính phương trình bậc ax^2 + bx + c = 0");
        System.out.print("Nhập vào a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập vào b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập vào c: ");
        double c = scanner.nextDouble();

        // Tính delta
        double delta = Math.pow(b, 2) - 4 * a * c;

        // Tính nghiệm và kiểm tra trường hợp a = 0 để đưa về phương trình bậc nhất
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm!");
            } else {
                System.out.println("Phương trình vô nghiệm!");
            }
        } else if (delta < 0) {
            System.out.println("Phương trình vô nghiệm!");
        } else if (delta == 0) {
            double x1 = -b / (2 * a);
            double x2 = x1;
            System.out.printf("Vậy phương trình có nghiệm kép là: x1 = x2 = %.2f", x1);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("Vậy phương trình có 2 nghiệm phân biệt là x1 = %.2f, x2 = %.2f", x1, x2);
        }

        scanner.close();
    }
}
