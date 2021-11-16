public class Properties {
    public static void main(String[] args){
        Customer alice = new Customer();
        Customer bob = new Customer();

        alice.name = "Alice";
        alice.age = 27;

        bob.name = "Bob";
        bob.age = 40;

        alice.displayCustomer();
        bob.displayCustomer();

        bob = alice;
        alice.age = 55;

        alice.displayCustomer();
        bob.displayCustomer();
    }      
}

/**
Objects have properties
- name
- size
- color
Objects have behaviors
- shop
- buy
- display
 */