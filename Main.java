import Geometry.Circle;
import Geometry.MainGeometry;
import Geometry.Rectangle;
import Geometry.Square;
import Resizeable.Resizeable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tính diện tích và chu vi các hình");
        int number;
        System.out.println("Nhập hình cần tính");
        System.out.println("1. Hình tròn");
        System.out.println("2. Hình chữ nhật");
        System.out.println("3. Hình vuông");
        System.out.println("0. Exit");
        System.out.print("Choice number: ");
        number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.print("Nhập bán kính hình tròn: ");
                int radius = scanner.nextInt();
                MainGeometry circle = new Circle(radius);
                System.out.print("Diện tích hình tròn là: " + circle.getArea());
                System.out.println("Chu vi hình tròn là: " + circle.getPerimeter());
                break;
            case 2:
                System.out.print("Nhập chiều dài hình chữ nhật: ");
                int length = scanner.nextInt();
                System.out.print("Nhập chiều rộng hình chữ nhật: ");
                int width = scanner.nextInt();
                MainGeometry rectangle = new Rectangle(length, width);
                System.out.println("Diện tích hình chữ nhật là: " + rectangle.getArea());
                System.out.println("Chu vi hình chữ nhật là: " + rectangle.getPerimeter());
                break;
            case 3:
                System.out.print("Nhập cạnh bên hình vuông: ");
                int side = scanner.nextInt();
                MainGeometry square = new Square(side);
                System.out.println("Diện tích hình vuông là: " + square.getArea());
                System.out.println("Chu vi hình vuông là: " + square.getPerimeter());
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Bạn chọn sai");
                break;
        }

    }
}
