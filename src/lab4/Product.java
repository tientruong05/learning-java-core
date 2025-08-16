package lab4;

import java.util.Scanner;

public class Product {
    private String name;
    private double price;
    private double tax;

    public Product() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public Product(String name, double price, double tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên sản phẩm: ");
        name = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        price = scanner.nextDouble();
        System.out.print("Nhập vào thuế sản phẩm: ");
        tax = scanner.nextDouble();
    }

    public void xuatThongTin() {
        System.out.println("Tên sản phẩm: " + name);
        System.out.println("Giá sản phẩm: " + price);
        System.out.println("Thuế sản phẩm: " + getTax());
    }

    public double getTax() {
        return tax * price;
    }
}
