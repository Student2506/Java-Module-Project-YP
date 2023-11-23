public class Formatter {
    public static String conjugate(int count) {
        return switch (count) {
            case 1 -> "рубль";
            case 2, 3, 4 -> "рубля";
            default -> "рублей";
        };
    }
}
