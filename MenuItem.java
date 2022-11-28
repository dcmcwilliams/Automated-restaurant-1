public class MenuItem {

    private int itemNo;
    private String name;
    private double price;

    public MenuItem(int num, String n, double p) {
        itemNo = num;
        name = n;
        price = p;
    }

    int getItemNo() {
        return itemNo;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

}
