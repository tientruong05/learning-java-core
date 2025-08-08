package lab2;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        // Bài 1: Cho phương trình ax + b = 0 Viết chương trình nhập vào 2 số nguyên a và b.
        // Tính toán nghiệm của phương trình trên

        //- Đối với phân thức, đầu tiên ta phải quy đồng phân số sau đó đưa phương trình về dạng ax+b=0
        //- Với các phương trình chưa có sẵn dạng ax+b=0 thì trước hết ta phải đưa phương trình về dạng ax+b=0
        //=======> Với a = 0
        //TH1: Nếu b != 0
        //=> phương trình trở thành 0.x + b = 0
        //=> phương trình vô nghiệm
        //TH2: Nếu b = 0
        //=> phương trình có dạng 0.x = 0
        //=> phương trình vô số nghiệm
        //=======> Với a != 0
        //Phương trình là: ax+b=0
        //=> phương trình có nghiệm duy nhất x =
        //Ví dụ: Giải phương trình 2x – 8 = 0
        //Ta xác định a = 2  0, b = -8 => x = 4
        //Vậy phương trình có nghiệm duy nhất x = 4

        Scanner scanner = new Scanner(System.in);

        // Nhập vào 2 số a và b
        System.out.println("Tính phương trình ax + b = 0");
        System.out.print("Nhập vào a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập vào b: ");
        double b = scanner.nextDouble();

        // Tính phương trình bậc nhất
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm!");
            } else {
                System.out.println("Phương trình vô nghiệm!");
            }
        } else if (a > 0 && b > 0) {
            double c = -b / a;
            System.out.printf("Phương trình bậc nhất có nghiệm: %.2f", c);
        }

        scanner.close();
    }
}
