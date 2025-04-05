import model.Veichle;

public class Main {
    public static void main(String[] args) {

        Veichle veichle = new Veichle("Fusca", 100.0);
        int days = 10;
        System.out.println("Model: " + veichle.getModel());
        System.out.println("Cost for " + days + " days: " + veichle.calculateCost(days));
        System.out.println("Discount: " + veichle.descount(days));
        System.out.println("Total cost after discount: " + (veichle.calculateCost(days) - veichle.descount(days)));
    }
}
