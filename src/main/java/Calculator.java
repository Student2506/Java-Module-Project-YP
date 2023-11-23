import java.util.Scanner;

public class Calculator {
    private static final Scanner scanner = new Scanner(System.in);

    private String goods;
    private Double totalCost;
    private final int count;

    Calculator(int count) {
        this.count = count;
        this.totalCost = 0.0;
        this.goods = "";
    }

    public void addGood() {
        String product = "";
        double cost = -1.0;

        while (product.isEmpty() || cost < 0.0) {
            System.out.println("Введите название товара:");
            product = scanner.nextLine();
            System.out.println("Введите стоимость товара:");
            String temp_cost = scanner.nextLine();
            temp_cost = temp_cost.replace(',', '.');
            try {
                cost = Double.parseDouble(temp_cost);
            } catch (NumberFormatException ignored) {
                System.out.println("Не верно введено значение цены. Не удалось добавить товар.");
            }
        }
        this.goods += product + "\n";
        this.totalCost += cost;
        System.out.println("Товар успешно добавлен.");
    }

    public String getGoods() {
        return this.goods;
    }

    public Double getAveragePerPerson() {
        return this.totalCost / this.count;
    }
}
