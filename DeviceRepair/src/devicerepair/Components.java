
package devicerepair;


public class Components {
    private String Name;
    private double Cost;

    public Components(String Name, double Cost) {
        this.Name = Name;
        this.Cost = Cost;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost(double Cost) {
        this.Cost = Cost;
    }
            
    
}
