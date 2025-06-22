package Factory_Method_pattern;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening a Word document...");
    }
}