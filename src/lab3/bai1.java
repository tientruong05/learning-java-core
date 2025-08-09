package lab3;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        // Bài 1: Viết chương trình nhập vào 1 số nguyên từ bàn phím. Hiển thị kết quả số đấy là số nguyên tố hay không?

        Scanner scanner = new Scanner(System.in);

        // Nhập vào số muốn kiểm tra
        System.out.println("Kiểm tra số nguyên tố");
        System.out.print("Nhập vào số: ");
        int number = scanner.nextInt();

        // Tạo biến count để kiểm tra
        int count = 0;

        // Nếu number chia hết cho 2 thì count > 0 thì không phải số nguyên tố vì lúc này
        for (int i = 2; i < number -1; i++) {
            if (number % 2 == 0) {
                count++;
                break;
            }
        }

        // Nếu count = 0 thì number là số nguyên tố
        if (count == 0) {
            System.out.println(number + " là số nguyên tố");
        } else {
            System.out.println(number + " không phải số nguyên tố");
        }
    }
}
