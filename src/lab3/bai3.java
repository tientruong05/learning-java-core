package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        // Bài 3: Viết chương trình nhập vào 1 mảng số nguyên bất kỳ:
        // - Sắp xếp và xuất mảng vừa nhập ra màn hình
        // - Xuất phần tử có giá trị nhỏ nhất
        // - Xuất phần tử có giá trị lớn nhất

        Scanner scanner = new Scanner(System.in);

        // Nhập vào mảng số nguyên
        System.out.println("Nhập vào một mảng số nguyên");
        System.out.print("Nhập số phần tử bạn muốn có trong một mảng: ");
        int s = scanner.nextInt();

        int [] arrays = new int[s];

        for (int i = 0; i <= s - 1; i++) {
            System.out.printf("Nhập vào số thứ " + (i + 1) + " của mảng " + s + " số: ");
            arrays[i] = scanner.nextInt();
        }

        // Sắp xếp và xuất mảng
        Arrays.sort(arrays);
        System.out.println("Mảng có thứ tự từ bé đến lớn là :" + Arrays.toString(arrays));

        // Lấy giá trị bé nhất
        System.out.println("Phần tử có giá trị bé nhất là: " + arrays[0]);

        // Lấy giá trị lớn nhất
        System.out.println("Phần tử có giá trị lớn nhất là: " + arrays[arrays.length -1]);

        scanner.close();
    }
}
