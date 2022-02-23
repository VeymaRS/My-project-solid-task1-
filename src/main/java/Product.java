import Category.Category;

public class Product {
    protected String name;
    protected Manufacture manufacture;
    protected int manufactureDate;
    protected Category category;

    public Product(String name, Manufacture manufacture, int manufactureDate, Category category) {
        this.name = name;
        this.manufacture = manufacture;
        this.manufactureDate = manufactureDate;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public Manufacture getManufacture() {
        return manufacture;
    }

    public int getManufactureDate() {
        return manufactureDate;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return name + " " + manufacture.getNameManufacture() + " " + manufactureDate + " " + category;
    }
}
