package model;

public class Veichle {
    private String model;
    private Double dailyCost;

    public Veichle(String model, Double dailyCost) {
        this.model = model;
        this.dailyCost = dailyCost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double calculateCost(int days) {
        if (days < 0) {
            return 0.0;
        }
        return dailyCost * days;
    }

    public Double descount(int days) {
        if (days > 7) {
            return 0.1 * calculateCost(days);
        }
        return 0.0;
    }

}

