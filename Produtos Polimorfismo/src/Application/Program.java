package Application;

import Entity.ImportedProduct;
import Entity.Product;
import Entity.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List <Product> productList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i=1;i<=n;i++){

            System.out.println("Product # " +(i)+" data: ");
            System.out.print("Commom, used or imported? (c/u/i)");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (ch == 'i'){
                System.out.println("Customs fee: ");
                double customs = sc.nextDouble();
                Product product = new ImportedProduct(name, price, customs);
                productList.add(product);
            }
            if (ch == 'u'){
                System.out.println("Manufactured date: (dd/MM/yyyy): ");
                Date date = sdf.parse(sc.next());
                Product product = new UsedProduct(name, price, date);

                productList.add(product);
            }
            if (ch == 'c'){
                Product product = new Product(name, price);
                productList.add(product);
            }
        }


        System.out.println("PRICE TAGS: ");

        for (Product product : productList){


            if (product instanceof ImportedProduct){
                System.out.println(product.priceTag());

            }
            else if (product instanceof UsedProduct){
                String newdate = sdf.format(((UsedProduct) product).getManufacturedDate());
                System.out.println(product.priceTag() +" Manufacture date:"+ newdate);
            } else {
                System.out.println(product.priceTag());
            }

        }

        sc.close();
    }
}
