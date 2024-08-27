import java.util.Scanner;

public class Item {
    private String name;
    private double price;

    private static int totalItemsSold = 0;
    private static double totalRevenue = 0.0;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void sell(int quantity) {
        totalItemsSold += quantity;
        totalRevenue += quantity * price;
    }

    public static int getTotalItemsSold() {
        return totalItemsSold;
    }

    public static double getTotalRevenue() {
        return totalRevenue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the item : ");
        String itemName = scanner.nextLine();
        System.out.print("Enter the price of the " + itemName + ": ");
        double itemPrice = scanner.nextDouble();
        Item item1 = new Item(itemName, itemPrice);

        System.out.print("Enter the quantity of " + itemName + " sold: ");
        int itemQuantity = scanner.nextInt();
        item1.sell(itemQuantity);

        System.out.print("\nEnter the name of another item : ");
        scanner.nextLine();
        String itemName2 = scanner.nextLine();
        System.out.print("Enter the price of the " + itemName2 + ": ");
        double itemPrice2 = scanner.nextDouble();
        Item item2 = new Item(itemName2, itemPrice2);

        System.out.print("Enter the quantity of " + itemName2 + " sold: ");
        int itemQuantity2 = scanner.nextInt();
        item2.sell(itemQuantity2);

        System.out.println("\nTotal Items Sold: " + Item.getTotalItemsSold());
        System.out.println("Total Revenue: $" + Item.getTotalRevenue());

        scanner.close();
    }
}
