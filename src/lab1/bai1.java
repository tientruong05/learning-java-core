package lab1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        // Bài 1: Viết chương trình cho phép nhập tên sinh viên, điểm trung bình từ bàn phím.
        // In ra màn hình với định dạng: <tên_sinh_viên> có điểm = <điểm>
        // Ví dụ: "Tiến" có điểm = 6.9

        Scanner scanner = new Scanner(System.in);

        // Nhập vào tên sinh viên
        System.out.print("Nhập vào tên sinh viên: ");
        String studentName = scanner.nextLine();

        // Nhập vào điểm của sinh viên
        System.out.print("Nhập vào điểm của sinh viên: ");
        double studentScore = scanner.nextDouble();

        // In ra màn hình với định dạng: <tên_sinh_viên> có điểm = <điểm>
        System.out.printf(studentName + " có điểm = %.1f", studentScore);

        scanner.close();
    }
}
