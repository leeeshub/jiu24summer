package day2.period3;

public class Main {
    public static void main(String[] args) {
        // Create shopping cart.
        // basic capacity should be set initially.
        // or we may consider to get input from the user to set the capacity.
        ShoppingCart cart = new ShoppingCart(10);

        // create product
        Product laptop = new Electronics("Macbook Air", 1300, "Apple", 2);
        Product jam = new Groceries("Orange Jam", 10, "2024/11/01");
        Product tshirt = new Clothing("T-Shirt", 25, "M", "Cotton");

        // add product
        cart.addItem(laptop);
        cart.addItem(jam);
        cart.addItem(tshirt);

        // need to practice using up/down casting?

        // view my shopping cart
        cart.viewCart();

        // show total price
        System.out.println("Total cost: $" + cart.totalCost());

        // remove item & show my shopping cart
        cart.removeItem("Apple");
        cart.viewCart();

        cart.removeItem("T-Shirt");
        cart.viewCart();

        // get total price
        System.out.println("Total cost: $" + cart.totalCost());
    }
}
