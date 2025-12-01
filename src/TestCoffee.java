package src;
public class TestCoffee{

    public static void createCustomOrder() {
            Coffee myCoffee = new BlackCoffee();
            System.out.println("Order: " + myCoffee.getDescription());
            System.out.println("Cost: ₱ " + myCoffee.getCost());

            Milk milkCoffee = new Milk();
            milkCoffee.setCoffee(myCoffee);
            System.out.println("Order: " + milkCoffee.getDescription());
            System.out.println("Cost: ₱ " + milkCoffee.getCost());

            CaramelSyrup caramelCoffee = new CaramelSyrup();
            caramelCoffee.setCoffee(milkCoffee);
            System.out.println("Order: " + caramelCoffee.getDescription());
            System.out.println("Cost: ₱ " + caramelCoffee.getCost());

            WhippedCream whippedCreamCoffee = new WhippedCream();
            whippedCreamCoffee.setCoffee(caramelCoffee);
            System.out.println("Order: " + whippedCreamCoffee.getDescription());
            System.out.println("Cost: ₱ " + whippedCreamCoffee.getCost());
        }

        public static void main(String[] args) {
            createCustomOrder();
        }
}