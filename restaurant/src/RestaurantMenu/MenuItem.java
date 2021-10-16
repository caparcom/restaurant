package RestaurantMenu;

import com.sun.source.tree.NewArrayTree;

public class MenuItem {

    private String name;
    private double price;
    private String description;
    private String category;

    public MenuItem() {};

    public MenuItem(String name, double price, String description, String category){
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void changePrice(int updatePrice){
        this.price = updatePrice;
    }

    public void changeDescription(String updateDescription){
        this.description = updateDescription;
    }

    public void changeCategory(String updateCategory){
        this.category = updateCategory;
    }

    @Override
    public String toString() {
        return "Menu Item: "+ name +
                "\nPrice: " + price +
                "\nA brief word from our chef: " + description +
                "\nWhat the #@$% is it?!: " + category + "\n\n";
    }
}
