public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Add items to the shopping cart
        cart.addItem(new Item("Item 1", 25));
        cart.addItem(new Item("Item 2", 15));
        cart.addItem(new Item("Item 3", 10));

        // Choose a payment strategy
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456", "John Doe");
        PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com");

        // Set the payment strategy and process the payment
        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout();

        // Change the payment strategy and process another payment
        cart.setPaymentStrategy(payPalPayment);
        cart.checkout();
    }
}
