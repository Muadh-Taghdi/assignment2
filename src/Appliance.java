public class Appliance extends Product{
    private int wattage;
    private  String color;
    private String brand;

    public Appliance(double price, int quantity, int wattage, String color, String brand){
        super(price, quantity);
        this.wattage = wattage;
        this.color = color;
        this.brand = brand;
    }
}
