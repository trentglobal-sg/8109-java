
/**
 * Write a description of class Product here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Product
{
    // name cannot be empty
    private String name;
    // price cannot be negative
    private double price;
    // sku must be at least 3 characters in length
    private String sku;
    
    // The constructor is a method that is used to create a new object from the class
    // The return type and the name of the method is th same as the class
    // this constructor has no parameter and is known as the default constructor
    public Product() {
        // in the constructor, we set the default values of the attributes
        name = "N/A";
        price = 0;
        sku = "NO_SKU_ASSIGNED";
    }
    
    // overloaded constructor
    // This constructor is a method that accepts parameters
    public Product(String name, double price, String sku) throws Exception {
        setName(name);
        setPrice(price);
        setSKU(sku);
    }
    
    // When we try to use an object like a String,
    // Java will automatically call the `toString` method
    // on the string
    public String toString() {
        String template = "Name: %s, Price: %f, SKU: %s";
        return String.format(template, name, price, sku);
    }
    
    // SETTERS
    public void setPrice(double newPrice) throws Exception {
        if (newPrice >= 0) {
            price = newPrice;
        } else {
            throw new Exception("Price cannot be negative");
        }
    }
    
    public void setName(String newName) {
        if (!newName.isEmpty()){
            name = newName;
        }
    }
    
    public void setSKU(String sku) {
        if (sku.length() >= 3) {
            this.sku = sku;
        }
    }
    
    // GETTERS
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String getSKU(){
        return sku;
    }
    
    
}