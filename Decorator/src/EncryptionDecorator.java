public class EncryptionDecorator implements Message {
    private Message decoratedMessage;

    public EncryptionDecorator(Message decoratedMessage) {
        this.decoratedMessage = decoratedMessage;
    }
    @Override
    public String getContent() {
        // Simulăm criptarea mesajului
        String encryptedContent = encrypt(decoratedMessage.getContent());
        return encryptedContent;
    }

    private String encrypt(String content) {
        // Implementați algoritmul de criptare aici
        return "Encrypted: " + content;
    }
}