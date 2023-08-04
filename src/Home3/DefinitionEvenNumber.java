package Home3;

import java.util.Scanner;

public class DefinitionEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        if (number % 2 == 0){
            System.out.println("Это число четное");
        } else {
            System.out.println("Это число нечетное");
        }
    }
}
