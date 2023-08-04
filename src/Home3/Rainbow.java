package Home3;

import java.util.Scanner;

public class Rainbow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число цвета: ");
        int color = scanner.nextInt();

        switch (color){
            case 1:
                System.out.println("красный");
                break;
            case 2:
                System.out.println("оранжевый");
                break;
            case 3:
                System.out.println("желтый");
                break;
            case 4:
                System.out.println("зеленый");
                break;
            case 5:
                System.out.println("голубой");
                break;
            case 6:
                System.out.println("синий");
                break;
            case 7:
                System.out.println("фиолетовый");
                break;
            default:
                System.out.println("Вы ввели не верный цвет");
        }
    }
}
