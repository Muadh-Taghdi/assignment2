public class ElectronicStore {
}
/*

ElectronicStore Class:
State:
1. final int MAX_PRODUCTS = 10 – the maximum number of different product
instances that this store can contain. This value should be set to 10 and
never changed. Your class should refer to this variable so that the maximum
number of products can be changed easily.
2. String name – the name of the electronics store
3. double revenue – the total revenue the store has made through sales. This
should initially be 0 but should be updated as products are sold.
4. Product[ ] products – an array to store product objects that are in the store.
This array should have size equal to MAX_PRODUCTS. In case you are
working on this before we have finished discussing polymorphism in
class, all you need to know is that you can store any class that is below
Product in the class hierarchy within this array. So if you have additional
classes that extend Product (or in general, are further down the hierarchy),
you can store them in this array without any problems.


Behaviour:
1. ElectronicStore(String name) – constructor for the class.
2. String getName() – returns the name of the store
3. boolean addProduct(Product p) – if there is space remaining in the products
array, this method should add p to the products array at the next available
array slot and return true. If there is no space remaining in the products array,
this method should just return false.
4. void sellProducts() – this method should print out the store’s products (see
example output below for an idea of how it should look), read an integer from
the user representing the product to sell (i.e., what index in the products
array), and read an integer from the user representing how many units of the
product to sell. You may assume the user will only enter integer numbers but
must verify that the values are valid (e.g., a valid item index, an amount
greater than 0). If the values supplied by the user are valid, the specified
number of units of the specified product should be sold, if possible. All
appropriate variables must be updated in all instances (e.g., revenue, number
of units in stock, etc.). If any of the input is invalid, no sales should take place.
5. void sellProducts(int item, int amount) – should sell amount units of the
product stored at index item in the products array, if possible. All appropriate
variables must be updated in all instances (e.g., revenue, number of units in
stock, etc.). If any of the input is invalid, no sales should take place.
6. double getRevenue() – returns the total revenue the store has made through
sales.
7. void printStock() – should print out the products of the store. See the example
output at the bottom of the document for examples
 */