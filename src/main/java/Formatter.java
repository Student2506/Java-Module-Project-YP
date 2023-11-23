public class Formatter {
    public static String conjugate(int count) {
        if (11 <= count && count <= 19) {
            return "рублей";
        }
        return switch (count % 10) {
            case 1 -> "рубль";
            case 2, 3, 4 -> "рубля";
            default -> "рублей";
        };
    }
}
