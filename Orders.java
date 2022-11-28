import java.util.ArrayList;

public class Orders {

    ArrayList<OrderItem> orderItems = new ArrayList<OrderItem>();

    public Orders() {

    }

    int getNumberOfItems() {
        return orderItems.size();
    }

    void orderItem(int itemNo) {
        orderItems.add(new OrderItem(itemNo));
    }

    OrderItem getItem(int i) {
        return orderItems.get(i);
    }

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }

}
