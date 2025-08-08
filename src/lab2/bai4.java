package lab2;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        // Bài 4: Viết chương trình tổ chức menu: System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
        // System.out.println("++ ----------------------------------------- ++");
        // System.out.println("| 1. Giải phương trình bậc nhất
        // System.out.println("| 2. Giải phương trình bậc hai
        // System.out.println("| 3. Tính số tiền điện
        // System.out.println("| 4. Kết thúc
        // System.out.println("++ ------------------ ++");
        // Yêu cầu: - Khi nhập vào "tính năng", sẽ thực hiện theo 3 bài tập đã làm ở trên

        Scanner scanner = new Scanner(System.in);

        // In ra màn hình bảng lựa chọn tính năng
        System.out.println(">>      LỰA CHỌN TÍNH NĂNG     <<");
        System.out.println("++ --------------------------- ++");
        System.out.println("| 1. Giải phương trình bậc nhất |");
        System.out.println("| 2. Giải phương trình bậc hai  |");
        System.out.println("| 3. Tính số tiền điện          |");
        System.out.println("| 4. Kết thúc chương trình      |");
        System.out.println("++ --------------------------- ++");

        // Nhập vào lựa chọn
        System.out.print("Nhập vào tính năng bạn muốn sử dụng: ");
        int choice = scanner.nextInt();

        // Process lựa chọn
        switch (choice) {
            case 1:
                bai1.main(new String[]{});
                break;
            case 2:
                bai2.main(new String[]{});
                break;
            case 3:
                bai3.main(new String[]{});
                break;
            case 4:
                System.exit(0);
            default:
                break;
        }

        scanner.close();
    }
}
