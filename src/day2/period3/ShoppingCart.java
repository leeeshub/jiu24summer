package day2.period3;

public class ShoppingCart {
    private Product[] items;
    private int itemCount;

    public ShoppingCart(int capacity) {
        items = new Product[capacity];
        itemCount = 0;
    }

    public void addItem(Product product) {
        if (itemCount < items.length) {
            items[itemCount] = product;
            itemCount++;
            System.out.println("Added " + product.getName() + " to the cart.");
        } else {
            System.out.println("Cart is full. Cannot add more items.");
        }
    }

    public void removeItem(String productName) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getName().equals(productName)) {
                items[i] = items[itemCount - 1];  // 마지막 아이템으로 교체
                items[itemCount - 1] = null;     // 마지막 아이템 제거
                itemCount--;
                System.out.println("Removed " + productName + " from the cart.");
                return;
            }
        }
        System.out.println(productName + " not found in the cart.");
    }

    public void viewCart() {
        if (itemCount == 0) {
            System.out.println("Your cart is empty.");
        } else {
            for (int i = 0; i < itemCount; i++) {
                System.out.println(items[i].getInfo());
            }
        }
    }

    public double totalCost() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].getPrice();
        }
        return total;
    }
}
