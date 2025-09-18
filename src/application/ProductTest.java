package application;

import entities.Product;

public class ProductTest {
    public static void main(String[] args) {

        Product product = new Product("Notebook", 1200.0, 10);
        Product product2 = new Product();

        product2.setName("TV 50 Polegadas");
        product2.setPrice(2000.0);
        product2.setQuantity(5);

        String description = product.toString();

        String description2 = product2.toString();

        System.out.println(description);
        System.out.println(description2);
    }
}
