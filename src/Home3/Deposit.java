package Home3;

import java.util.Scanner;

public class Deposit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первоначальную сумм вклада: ");
        float sum = scanner.nextFloat();
        System.out.print("Введите количество месяцев: ");
        int month = scanner.nextInt();


        for (int i = 1; i <= month; i++) {
            sum = (float) ((float) sum + (sum * 0.07));
        }
        System.out.println("Сумма вклада составит "+ " " + sum);
    }
}
