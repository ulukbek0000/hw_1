import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String myNum;

        final int NUM = 30;

        String word = "okey";

        myNum = NUM + word;

        System.out.println("Значения переменной myNum: " + myNum);
        System.out.println("Значения констант NUM: " + NUM);
        System.out.println("Значения переменной word: " + word);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили 0");
        }

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.println("Привет " + userName + "!");
    }
}