package service;

import model.Product;

import java.util.ArrayList;

public class ProductService {
    private static final ArrayList<Product> products;
    private static final ArrayList<Product> productArrayList = new ArrayList<>();

    static {
        products = new ArrayList<>();
        products.add(new Product(1, "AIO", 1800000, 4, "Pod"));
        products.add(new Product(2, "FL680", 1000000, 6, "Keyboard"));
        products.add(new Product(3, "Ip13", 2000000, 8, "Apple"));
        products.add(new Product(4, "S21", 3000000, 2, "Samsung"));
        products.add(new Product(5, "S2421HN", 4000000, 10, "Dell"));
    }

    public ArrayList<Product> getProductList() {
        return products;
    }

    public ArrayList<Product> sortProductListAsc() {
        products.sort((o1, o2) -> (int) (o1.getPrice() - o2.getPrice()));
        return products;
    }

    public ArrayList<Product> sortProductListDesc() {
        products.sort((o1, o2) -> (int) (o2.getPrice() - o1.getPrice()));
        return products;
    }

    public void deleteProduct(Product product) {
        ArrayList<Product> productArrayList = new ArrayList<>();
        productArrayList.remove(product);
    }

    public void createProduct(Product product) {
        ArrayList<Product> productArrayList = new ArrayList<>();
        productArrayList.add(product);
    }

    public ArrayList<Product> getProductArrayListList() {
        return productArrayList;
    }

    public void sumPriceProduct(ArrayList<Product> productArrayList) {
        double sumPrice = 0;
        for (Product product : productArrayList) {
            sumPrice += product.getPrice() * product.getQuantity();
        }
    }
}
