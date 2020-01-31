public class Product {
    private double price;
    private int stockQuantity;
    private int soldQuantity;

    public Product(double price, int quantity){
        this.price = price;
        this.stockQuantity = quantity;
        this.soldQuantity = quantity;

    }

    public double sellUnits(int amount){
        return 0;
    }
}
/*
Product Class:
State:
1. double price – represents how much the product costs
2. int stockQuantity – represents how many units of this product are in stock
3. int soldQuantity – represents how many units of this product have been sold


Behaviour:
1. Product(double price, int quantity) – constructor for the class
2. double sellUnits(int amount) – simulates selling amount units. If there are
enough units in stock to meet the request, the quantity attributes must be
updated appropriately and the total revenue for selling (revenue = units *
price) should be returned. If there are not enough units in stock, no sale
should take place and 0.0 should be returned.
 */