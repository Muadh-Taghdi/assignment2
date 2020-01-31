public class Desktop extends Computer{
    private String profile;

    public Desktop(double price, int quantity, double cpuSpeed, int ram, boolean ssd, int storage, String profile){
        super(price, quantity, cpuSpeed, ram, ssd, storage);
        this.profile = profile;
    }
}

/*
Desktop Class:
State:
1. double price – represents how much the desktop costs
2. int stockQuantity – represents how many units of this desktop are in stock
3. int soldQuantity – represents how many units of this desktop have been sold
4. double cpuSpeed – the CPU speed in Ghz
5. int ram – the amount of RAM in GB
6. boolean ssd – whether the hard-drive is an SSD (true) or HDD (false)
7. int storage – the size of the hard-drive in GB
8. String profile – a string describing the size of the desktop case


Behaviour:
1.  Desktop(double price, int quantity, double cpuSpeed, int ram, boolean ssd, int
    storage, String profile) – constructor for the class
2.  double sellUnits(int amount) – simulates selling amount units. If there are
    enough units in stock to meet the request, the quantity attributes must be
    updated appropriately and the total revenue (revenue = units * price) should
    be returned. If there are not enough units in stock, no sale should take place
    and 0.0 should be returned.
3.  String toString() – returns a string representing the desktop. This should
    summarize the state of the desktop, including each attribute. See the
    example output included at the bottom for examples.
* */
