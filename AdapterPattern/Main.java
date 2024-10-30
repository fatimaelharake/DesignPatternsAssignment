public class Main {
    public static void main(String[] args) {
        // Using PrintAdapter as a simple Printer
        Printer printer = new PrintAdapter();
        printer.printText("Hello, world!");
    }
}
