import java.util.ArrayList;
import java.util.Scanner;
public class App {

    private Scanner sc = new Scanner(System.in);

    // products wll be an arraylist that stores Product objects (i,e
    // objects created from the Product class)
    private ArrayList<Product> products = new ArrayList<Product>();
    public void start() {
        try {
              while (true) {
            System.out.println("1. Add New Product");
            System.out.println("2. Display all products");
            System.out.println("3. Quit");
            int choice = sc.nextInt();
            // clear the keyboard buffer
            sc.nextLine();
            if (choice==1) {
                System.out.println("Create new product");
                System.out.println("Enter the name:");
                String name = sc.nextLine();
                System.out.println("Enter the price:");
                double price = sc.nextDouble();
                sc.nextLine();
                System.out.println("Enter the sku:");
                String sku = sc.nextLine();
                Product p = new Product(name, price, sku);
                products.add(p);
            }
            if (choice==2) {
                System.out.println("All products");
                for (Product p : products) {
                    System.out.println(p.getName());
                    System.out.println("Price: " + p.getPrice());
                    System.out.println("SKU : " + p.getSKU());
                    System.out.println();
                }
            }
            if (choice == 3) {
                break;
            }
        }
        } catch (Exception e) {
            System.out.println(e);
        }
      
    }
}