public class Mein {
    public static void main(String[] args) {
        String str = new String("I study Basic Java!");
        processString(str);
    }

    public static void processString(String str) {
        System.out.println("Предпоследний символ: " + str.charAt(str.length() - 2));
        System.out.println("Вырезанная строка: " + str.substring(14, 18));
        System.out.println("Строка в верхнем регистре: " + str.toUpperCase());
        System.out.println("Строка в нижнем регистре: " + str.toLowerCase());

    }
}
