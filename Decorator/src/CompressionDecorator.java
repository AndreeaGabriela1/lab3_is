public class CompressionDecorator implements Message {
    private Message decoratedMessage;

    public CompressionDecorator(Message decoratedMessage) {
        this.decoratedMessage = decoratedMessage;
    }

    @Override
    public String getContent() {
        // Simulăm compresia mesajului
        String compressedContent = compress(decoratedMessage.getContent());
        return compressedContent;
    }

    private String compress(String content) {
        // Implementați algoritmul de compresie aici
        return "Compressed: " + content;
    }
}