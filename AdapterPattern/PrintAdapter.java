public class PrintAdapter extends Printer {
    private AdvancedPrinter advancedPrinter;

    public PrintAdapter() {
        this.advancedPrinter = new AdvancedPrinter();
    }

    @Override
    public void printText(String text) {
        // Adapting the call to use AdvancedPrinter with a default color
        advancedPrinter.printTextWithColor(text, "Red");
    }
}
