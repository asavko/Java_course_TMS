package Home3;

public class MultiplicationTable {

    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            System.out.println("Таблица умножения на " + i + ":");
            for (int j = 1; j <= 10; j++) {
                int x = i * j;
                System.out.println(i + "*" + j + "=" + x);
            }
        }
    }
}
