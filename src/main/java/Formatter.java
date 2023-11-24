
public class Formatter {
    public static String conjugate(int count) {
        if (count % 100 >= 11 && count % 100 <= 19) {
            return "рублей";
        }
        return switch (count % 10) {
            case 1 -> "рубль";
            case 2, 3, 4 -> "рубля";
            default -> "рублей";
        };
    }
}
