package lab1;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        // Bài 3: Viết chương trình nhập vào bàn phím cạnh của một khối lập phương.
        // Tính và xuất ra thể tích của khối lập phương.

        Scanner scanner = new Scanner(System.in);

        // Nhập vào độ dài cạnh của khối lập phương
        System.out.print("Nhập vào độ dài cạnh khối lập phương: ");
        int edgeLength = scanner.nextInt();

        // Tính và xuất ra thể tích của khối lập phương theo công thức V = edge × edge × edge
        // int volume = edgeLength * edgeLength * edgeLength;
        // System.out.println("Thể tích của khối lập phương là: " + volume);

        // Tính và xuất ra thể tích của khối lập phương theo công thức V = edge³ và ép kiểu sang int
        // int volume = (int) Math.pow(edgeLength, 3);
        // System.out.println("Thể tích của khối lập phương là: " + volume);

        // Như trên nhưng ghi cùng 1 dòng
        // System.out.println("Thể tích của khối lập phương là: " + (int) Math.pow(edgeLength, 3));

        // Sử dụng Math.pow vì công thức tính thể tích là edge^3 (lũy thừa bậc 3)
        // Math.pow yêu cầu cả hai tham số phải là kiểu double, nên không dùng int trực tiếp được
        // Nếu cần kết quả là số nguyên, có thể ép kiểu (int), nhưng ở đây dùng định dạng in ra số không có phần thập phân %.0f
        System.out.printf("Thể tích của khối lập phương là: %.0f", Math.pow(edgeLength, 3));

        scanner.close();
    }
}
