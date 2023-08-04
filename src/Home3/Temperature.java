package Home3;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру: ");
        int temperature = scanner.nextInt();
        if(temperature > -5){
            System.out.println("Тепло");
        } else if (temperature > -20 && temperature <= -5) {
            System.out.println("Нормально");
        }else {
            System.out.println("Холодно");
        }
    }
}
