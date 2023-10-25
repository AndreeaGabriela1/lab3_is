public class Main {
    public static void main(String[] args) {
        Message message = new TextMessage("Hello, World!");

        System.out.println("Original message: " + message.getContent());

        // Adăugăm criptare la mesaj
        message = new EncryptionDecorator(message);
        System.out.println("Encrypted message: " + message.getContent());

        // Adăugăm compresie la mesaj
        message = new CompressionDecorator(message);
        System.out.println("Compressed and encrypted message: " + message.getContent());
    }
}
