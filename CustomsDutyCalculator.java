
import java.util.Scanner;

public class CustomsDutyCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в калькулятор пошлин!");

        System.out.print("Введите стоимость товара в рублях: ");
        int price = scanner.nextInt();

        System.out.print("Введите вес товара в килограммах: ");
        int weight = scanner.nextInt();

        int duty = calculateDuty(price, weight);

        System.out.println("Размер пошлины составляет: " + duty + " рублей.");
    }

    public static int calculateDuty(int price, int weight) {

        double priceDuty = price * 0.01;
        int weightDuty = weight * 100;
        return (int) (priceDuty + weightDuty);
    }
}