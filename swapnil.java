import java.util.ArrayList;
import java.util.List;

class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Customer {
    private String name;
    private List<Item> shoppingCart;

    public Customer(String name) {
        this.name = name;
        this.shoppingCart = new ArrayList<>();
    }

    public void addItemToCart(Item item) {
        shoppingCart.add(item);
    }

    public List<Item> getShoppingCart() {
        return shoppingCart;
    }

    public String getName() {
        return name;
    }
}

public class Supermarket {
    private List<Item> items;
    private List<Customer> customers;

    public Supermarket() {
        this.items = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void printItems() {
        System.out.println("Items available in the supermarket:");
        for (Item item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println();
    }

    public void processCustomers() {
        System.out.println("Processing customers:");
        for (Customer customer : customers) {
            System.out.println("Customer: " + customer.getName());
            List<Item> shoppingCart = customer.getShoppingCart();
            double totalCost = 0.0;
            for (Item item : shoppingCart) {
                System.out.println("Item: " + item.getName() + " - $" + item.getPrice());
                totalCost += item.getPrice();
            }
            System.out.println("Total cost: $" + totalCost);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create supermarket
        Supermarket supermarket = new Supermarket();

        // Add items to the supermarket
        Item item1 = new Item("Apple", 0.5);
        Item item2 = new Item("Bread", 1.0);
        Item item3 = new Item("Milk", 1.5);
        supermarket.addItem(item1);
        supermarket.addItem(item2);
        supermarket.addItem(item3);

        // Add customers to the supermarket
        Customer customer1 = new Customer("John");
        customer1.addItemToCart(item1);
        customer1.addItemToCart(item2);
        Customer customer2 = new Customer("Alice");
        customer2.addItemToCart(item2);
        customer2.addItemToCart(item3);
        supermarket.addCustomer(customer1);
        supermarket.addCustomer(customer2);

        // Print items available in the supermarket
        supermarket.printItems();

        // Process customers and display their shopping carts
        supermarket.processCustomers();
    }
}