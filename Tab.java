import java.util.ArrayList;

public class Tab {

    private Aggregator agg;

    public Tab(Aggregator agg) {
        this.agg = agg;
    }

    public int[] getTab() {
        // int num_items = agg.getOrdersObj().orderItems.size();
        // int menu_size = agg.getMenuObj().getMenuItems().size();
        // String tab[] = new String[num_items];
        // for (int i = 0; i < num_items; i++) {
        // int itemNo = agg.getOrdersObj().orderItems.get(i).getOrderItemNo();
        // tab[i] = agg.getMenuObj().getName(itemNo);
        // }
        // return tab;
        // }
        // }

        ArrayList<OrderItem> item = this.agg.getOrdersObj().orderItems;
        int[] items = new int[item.size()];

        for (int i = 0; i < items.length; i++) {
            items[i] = item.get(i).getOrderItemNo();
        }
        return items;
    }
}