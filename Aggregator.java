public class Aggregator {

    Menu menuObj;
    Orders orderObj;

    Aggregator() {
        menuObj = new Menu();
        orderObj = new Orders();
    }

    Menu getMenuObj() {
        return menuObj;
    }

    Orders getOrdersObj() {
        return orderObj;
    }

}