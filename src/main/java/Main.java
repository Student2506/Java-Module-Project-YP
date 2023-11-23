import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("На сколько человек разделить счёт?:");
        int peopleCount;
        try {
            peopleCount = scanner.nextInt();
        } catch (InputMismatchException ignored) {
            peopleCount = -1;
        }
        while (peopleCount <= 1) {
            scanner.nextLine();
            System.out.println("Введите целое положительное число больше 1: ");
            try {
                peopleCount = scanner.nextInt();
            } catch (InputMismatchException ignored) {
                peopleCount = -1;
            }
        }

        Calculator calculator = new Calculator(peopleCount);
        String complete;
        do {
            calculator.addGood();
            System.out.println("Добавить ещё один товар в корзину?:");
            complete = scanner.next();
        } while (!complete.equalsIgnoreCase("завершить"));

        System.out.println("Добавленные товары:\n" + calculator.getGoods());
        Double averagePerPerson = calculator.getAveragePerPerson();
        System.out.printf(
                Locale.US,
                "%.2f %s%n",
                averagePerPerson,
                Formatter.conjugate((int)Math.floor(averagePerPerson))
        );
    }
}