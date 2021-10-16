package RestaurantMenu;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuItem {

    private MenuItem newItem = new MenuItem();
    private static List<Object> holyMoleyAMenu = new ArrayList<>();

    public Menu(){}

    public Menu(MenuItem newItem){
        this.newItem = newItem;
    }

    public MenuItem getNewItem() {
        return newItem;
    }

    public void setNewItem(MenuItem newItem) {
        this.newItem = newItem;
    }

    public List<Object> getHolyMoleyAMenu() {
        return holyMoleyAMenu;
    }

    public void setHolyMoleyAMenu(List<Object> holyMoleyAMenu) {
        this.holyMoleyAMenu = holyMoleyAMenu;
    }


    public void addItem(MenuItem newItem){
            holyMoleyAMenu.add(newItem);
        }

    public static Object showMenu(){
        System.out.println(holyMoleyAMenu.toString());
        return null;
    }

}
