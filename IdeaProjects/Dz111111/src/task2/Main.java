package task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Customer> customers = new HashMap<>();
        customers.put("Customer1", new Customer("Customer1"));
        customers.put("Customer2", new Customer("Customer2"));

        Map<String, Product> products = new HashMap<>();
        products.put("Product1", new Product("Product1", 10.0));
        products.put("Product2", new Product("Product2", 15.0));

        double totalPurchases = 0.0;

        try {
            Order order1 = makePurchase("Customer1", "Product1", 3, customers, products);
            totalPurchases += order1.getTotalPrice();

            Order order2 = makePurchase("Customer2", "Product2", 2, customers, products); // Правильное количество
            totalPurchases += order2.getTotalPrice();

            Order order3 = makePurchase("Customer3", "Product3", 2, customers, products); // Несуществующий покупатель и товар
        } catch (Exception e) {
            System.out.println("Произошла ошибка при совершении покупки: " + e.getMessage());
        }

        System.out.println("Итоговая сумма всех совершенных покупок: $" + totalPurchases);
    }


    public static Order makePurchase(String customerName, String productName, int quantity, Map<String, Customer> customers, Map<String, Product> products) throws Exception {

        Customer customer = customers.get(customerName);
        Product product = products.get(productName);

        if (customer == null || product == null) {
            throw new Exception("Покупатель или товар не найден");
        }

        if (quantity <= 0) {
            throw new Exception("Неправильное количество товара");
        }

        return new Order(customer, product, quantity);
    }
    public static double calculateTotalPurchases(List<Order> orders) {
        double total = 0.0;
        for (Order order : orders) {
            total += order.getTotalPrice();
        }
        return total;
    }
}
