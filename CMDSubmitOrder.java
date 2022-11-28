public class CMDSubmitOrder implements Command {
    private Aggregator agg;
    private int itemNo;

    public CMDSubmitOrder(Aggregator agg, int itemNo) {
        this.agg = agg;
        this.itemNo = itemNo;
    }

    public String execute() {
        agg.getOrdersObj().orderItem(itemNo);
        return agg.getMenuObj().getName(itemNo);
    }
}