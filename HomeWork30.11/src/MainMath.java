public class MainMath {
    public static void main(String[] args) {
        System.out.println("Sum: " + add(19, 6));
        System.out.println("Number deference: " + deference(60, 5));
        System.out.println("multiplying numbers: " + multiplying(5, 7));
        System.out.println("dividing numbers: " + dividing(10, 5));
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static int deference(int a, int b){
        return a - b;
    }
    public static int multiplying(int a, int b){
        return a * b;
    }
    public static double dividing(double a, double b){
        return a / b;
    }
}
