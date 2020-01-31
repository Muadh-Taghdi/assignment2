public class Fridge extends Appliance{

    private double cubicFeet;
    private boolean hasFreezer;

    public Fridge(double price, int quantity, int wattage, String color, String brand, double cubicFeet, boolean freezer){
        super(price, quantity, wattage, color, brand);
        this.cubicFeet = cubicFeet;
        this.hasFreezer = freezer;
    }
}

/*
Fridge Class:
State:
1. double price – represents how much the fridge costs
2. int stockQuantity – represents how many units of this fridge there are in stock
3. int soldQuantity – represents how many units of this fridge have been sold
4. int wattage – the wattage rating of the fridge
5. String color – the color of the fridge
6. String brand – the brand name of the fridge
7. double cubicFeet – The volume of the fridge in cubic feet
8. boolean hasFreezer – Whether the fridge has a freezer or not
Behaviour:
1. Fridge(double price, int quantity, int wattage, String color, String brand,
double cubicFeet, boolean freezer) – constructor for the class
2. double sellUnits(int amount) – simulates selling amount units. If there are
enough units in stock to meet the request, the quantity attributes must be
updated appropriately and the total revenue (revenue = units * price) should
be returned. If there are not enough units in stock, no sale should take place
and 0.0 should be returned.
3. String toString() – returns a string representing the fridge. This should
summarize the state of the fridge, including each attribute. See the example
output included at the bottom for examples.
 */