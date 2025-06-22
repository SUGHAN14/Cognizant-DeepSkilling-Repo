package Factory_Method_pattern;

public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening an Excel document...");
    }
}
