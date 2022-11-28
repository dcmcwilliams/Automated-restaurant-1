import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();

    public Menu() {
        String names[] = {
                "Roast Beef", "Chicken Korma", "Jiaozi", "Pizza"
        };
        double prices[] = { 5, 10, 15, 20 };

        for (int i = 0; i < names.length; i++) {
            menuItems.add(new MenuItem(i, names[i], prices[i]));
        }
    }

    String getName(int num) {
        for (int i = 0; i < menuItems.size(); i++) {
            if (num == menuItems.get(i).getItemNo()) {
                return menuItems.get(i).getName();
            }
        }
        return "";
    }

    ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
}
