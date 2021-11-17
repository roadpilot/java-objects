public class MethodDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sum = calc.addSelf(2);
        double diff = calc.subtract2(50,5);
        System.out.println(sum);
        System.out.println(diff);
    }
}
