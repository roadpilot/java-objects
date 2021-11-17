public class Calculator {
    public void doNothing() {
        System.out.println("Nothing to do.");
    }

    // public void addSelf(int x) {
    //     System.out.println(x + x);
    // }    

    // public void subtract2(int x, double y) {
    //     System.out.println(x-y);
    // }

    public int addSelf(int x) {
        return x + x;
    }    

    public double subtract2(int x, double y) {
         return x - y;
    }
}
