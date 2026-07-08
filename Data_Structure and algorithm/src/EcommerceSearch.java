import java.util.Arrays;
import java.util.Comparator;

public class EcommerceSearch {

    // Product Class
    static class Product {
        int productId;
        String productName;
        String category;

        public Product(int productId, String productName, String category) {
            this.productId = productId;
            this.productName = productName;
            this.category = category;
        }

        @Override
        public String toString() {
            return "Product ID: " + productId +
                    ", Name: " + productName +
                    ", Category: " + category;
        }
    }

    // Linear Search
    public static Product linearSearch(Product[] products, int id) {

        for (Product product : products) {
            if (product.productId == id) {
                return product;
            }
        }
        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, int id) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (products[mid].productId == id) {
                return products[mid];
            }

            if (products[mid].productId < id) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        System.out.println("===== E-commerce Platform Search Function =====\n");

        // Big O Explanation
        System.out.println("Big O Notation:");
        System.out.println("Big O notation measures the efficiency of an algorithm.");
        System.out.println("It describes how the execution time grows as the input size increases.\n");

        System.out.println("Search Scenarios:");
        System.out.println("Best Case    : O(1)");
        System.out.println("Average Case : O(n) for Linear Search, O(log n) for Binary Search");
        System.out.println("Worst Case   : O(n) for Linear Search, O(log n) for Binary Search\n");

        // Product Array
        Product[] products = {
                new Product(105, "Keyboard", "Electronics"),
                new Product(101, "Laptop", "Electronics"),
                new Product(104, "Shoes", "Fashion"),
                new Product(102, "Phone", "Electronics"),
                new Product(103, "Watch", "Accessories")
        };

        int searchId = 103;

        // Linear Search
        System.out.println("----- Linear Search -----");
        Product result1 = linearSearch(products, searchId);

        if (result1 != null)
            System.out.println("Product Found: " + result1);
        else
            System.out.println("Product Not Found");

        // Sort array before Binary Search
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        // Binary Search
        System.out.println("\n----- Binary Search -----");
        Product result2 = binarySearch(products, searchId);

        if (result2 != null)
            System.out.println("Product Found: " + result2);
        else
            System.out.println("Product Not Found");

        // Complexity Analysis
        System.out.println("\n===== Time Complexity Analysis =====");
        System.out.println("Linear Search  : Best O(1), Average O(n), Worst O(n)");
        System.out.println("Binary Search  : Best O(1), Average O(log n), Worst O(log n)");

        System.out.println("\nConclusion:");
        System.out.println("Binary Search is more suitable for an e-commerce platform because");
        System.out.println("it searches much faster on sorted data, especially for large product collections.");
    }
}