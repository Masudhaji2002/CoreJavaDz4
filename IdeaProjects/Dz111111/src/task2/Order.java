package task2;

public class Order {
    private Customer customer;
    private Product product;
    private int quantity;

    public Order(Customer customer, Product product, int quantity) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }
    public double getTotalPrice(){
        return product.getPrice() * quantity;
    }
}
