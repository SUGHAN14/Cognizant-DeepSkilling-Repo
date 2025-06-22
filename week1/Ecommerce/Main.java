package Ecommerce;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Shoes", "Footwear"),
                new Product(103, "Watch", "Accessories"),
                new Product(104, "Phone", "Electronics"),
                new Product(105, "Bag", "Fashion")
        };
        Arrays.sort(products, Comparator.comparing(Product::getProductName, String.CASE_INSENSITIVE_ORDER));

        String searchTarget = "Laptop";

        Product linearResult = SearchUtil.linearSearch(products, searchTarget);
        System.out.println("Linear Search Result: " + (linearResult != null ? linearResult : "Not Found"));

        Product binaryResult = SearchUtil.binarySearch(products, searchTarget);
        System.out.println("Binary Search Result: " + (binaryResult != null ? binaryResult : "Not Found"));
    }
}

