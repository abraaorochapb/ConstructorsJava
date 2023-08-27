package Application;

import Entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String name = sc.nextLine();

        System.out.print("Enter product price: ");
        double price = sc.nextDouble();

        System.out.print("Enter product stock: ");
        int stock = sc.nextInt();

        Product product1 = new Product(name, price, stock);

        System.out.println("Total value in stock: " + product1.totalValue());

        System.out.println("Wanna add more products? (y/n)");
        char answeradd = sc.next().charAt(0);
        if (answeradd == 'y') {
            System.out.print("Quantity to be added: ");
            int quantity = sc.nextInt();
            product1.addItem(quantity);
            System.out.println("Products in stock: " + product1.stock);
            System.out.println("Total value in stock: " + product1.totalValue());
        }

        System.out.println("Wanna remove products from stock? (y/n)");
        char answerrm = sc.next().charAt(0);
        if (answerrm == 'y') {
            System.out.print("Quantity to be removed: ");
            int quantity = sc.nextInt();
            product1.removeItem(quantity);
            System.out.println("Products in stock: " + product1.stock);
            System.out.println("Total value in stock: " + product1.totalValue());
        }


        sc.close();
    }

}
