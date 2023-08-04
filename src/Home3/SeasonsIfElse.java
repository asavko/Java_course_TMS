package Home3;

import java.util.Scanner;

public class SeasonsIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number month: ");
        int numberMonth = scanner.nextInt();
        if (numberMonth == 12 || numberMonth == 1 || numberMonth == 2) {
            System.out.println("It's winter");
        } else if (numberMonth >= 3 && numberMonth <= 5) {
            System.out.println("It's spring");
        } else if (numberMonth >= 6 && numberMonth <= 8) {
            System.out.println("It's summer");
        } else if (numberMonth >= 9 && numberMonth <= 11) {
            System.out.println("It's autumn");
        } else  {
            System.out.println("Месяца с числом " + numberMonth + " нет");
        }
    }
}
