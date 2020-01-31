public class ToasterOven extends Appliance {
    private int width;
    private  boolean convection;

    public ToasterOven(double price, int quantity, int wattage, String color, String brand, int width, boolean convection){
        super(price, quantity, wattage, color, brand);
        this.width = width;
        this.convection = convection;
    }
}

/*
ToasterOven Class:
State:
1. double price – represents how much the toaster oven costs
2. int stockQuantity – represents how many units of this toaster are in stock
3. int soldQuantity – represents how many units of this toaster have been sold
4. int wattage – the wattage rating of the toaster oven
5. String color – the color of the toaster oven
6. String brand – the brand name of the toaster oven
7. int width – the width of the toaster oven
8. boolean convection – whether the toaster has convection heating or not
Behaviour:
1. ToasterOven(double price, int quantity, int wattage, String color, String brand,
int width, boolean convection) – constructor for the class
2. double sellUnits(int amount) – simulates selling amount units. If there are
enough units in stock to meet the request, the quantity attributes must be
 */