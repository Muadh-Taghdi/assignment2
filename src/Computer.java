public class  Computer extends Product{
    private double cpuSpeed;
    private int ram;
    private boolean ssd;
    private int storage;

    public Computer(double price, int quantity, double cpuSpeed, int ram, boolean ssd, int storage){
        super(price, quantity);
        this.cpuSpeed = cpuSpeed;
        this.ram = ram;
        this.ssd = ssd;
        this.storage = storage;

    }

    public double selUnits(){
        return 0;
    }

    public String toString(){
        return null;
    }


}
