public class MethodDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        // int sum = calc.addSelf(2);
        // double diff = calc.subtract2(50,5);
        // System.out.println(sum);
        // System.out.println(diff);
        System.out.println(calc.add(2,2));
        System.out.println(calc.add(2.0,2.0));
        System.out.println(calc.add("Hello","World"));
    }
}
