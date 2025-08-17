package lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> soluong = new ArrayList<>();

        while (true) {
            System.out.print("Nhập vào số thực: ");
            Double x = scanner.nextDouble();
            soluong.add(x);
            scanner.nextLine();

            System.out.print("Bạn có muốn nhập thêm số? (Y/N): ");
            if (scanner.nextLine().equals("N")) {
                break;
            }
        }

        double total = 0;
        for (int i = 0; i < soluong.size(); i++) {
            total += soluong.get(i);
        }

        System.out.println("Danh sách mảng: " + soluong);
        System.out.println("Tổng các số trong mảng: " + total);
    }
}
