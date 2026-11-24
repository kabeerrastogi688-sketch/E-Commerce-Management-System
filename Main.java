package ECommerceProject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Store store = new Store();

        int choice;

        do {

            System.out.println("\n================================");
            System.out.println("   E-COMMERCE MANAGEMENT SYSTEM");
            System.out.println("================================");

            System.out.println("1. View Products");
            System.out.println("2. Search Product");
            System.out.println("3. Add to Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Remove from Cart");
            System.out.println("6. Generate Bill");
            System.out.println("7. Exit");

            System.out.print("\nEnter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    store.displayProducts();
                    break;

                case 2:
                    System.out.print("Enter Product ID: ");
                    int searchId = sc.nextInt();
                    store.searchProduct(searchId);
                    break;

                case 3:
                    System.out.print("Enter Product ID: ");
                    int addId = sc.nextInt();
                    store.addToCart(addId);
                    break;

                case 4:
                    store.viewCart();
                    break;

                case 5:
                    System.out.print("Enter Product ID: ");
                    int removeId = sc.nextInt();
                    store.removeFromCart(removeId);
                    break;

                case 6:
                    store.generateBill();
                    break;

                case 7:
                    System.out.println("Thank you for shopping!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}