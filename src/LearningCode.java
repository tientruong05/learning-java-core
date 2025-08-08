import java.util.Scanner;

public class LearningCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(">> Lựa chọn tính năng <<");
        System.out.println("++--------------------++");
        System.out.println("| 1. Phép cộng         |");
        System.out.println("| 2. Phép trừ          |");
        System.out.println("| 3. Kết thúc          |");
        System.out.println("++--------------------++");

        System.out.print("Lựa chọn của mày là: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Mày đã chọn phép cộng");
                break;
            case 2:
                System.out.println("Mày đã chọn phép trừ");
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("1 2 3 đéo chọn chọn ngu thế");
        }

        scanner.close();
    }
}
