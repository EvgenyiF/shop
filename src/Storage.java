import java.util.ArrayList;

public class Storage extends Item{


    private double cost;

    public Storage(String nameOfItem, double cost, Category category,int quantity) {
        super(nameOfItem,category,quantity);
        this.cost = cost;
    }
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

}
