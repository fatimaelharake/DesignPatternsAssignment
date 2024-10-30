package DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        // Basic beverage
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        // Espresso with milk
        Beverage espressoWithMilk = new Milk(espresso);
        System.out.println(espressoWithMilk.getDescription() + " $" + espressoWithMilk.cost());

        // Espresso with milk and sugar
        Beverage espressoWithMilkAndSugar = new Sugar(espressoWithMilk);
        System.out.println(espressoWithMilkAndSugar.getDescription() + " $" + espressoWithMilkAndSugar.cost());

        // Tea with milk
        Beverage teaWithMilk = new Milk(new Tea());
        System.out.println(teaWithMilk.getDescription() + " $" + teaWithMilk.cost());
    }
}
