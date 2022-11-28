public class Invoker {
  private static Aggregator agg;

  public Invoker() {
    agg = new Aggregator();
  }

  public String[] getMenu() {
    return new CMDGetMenu(agg).execute();
  }

  public String placeOrder(int itemNo) {
    return new CMDSubmitOrder(agg, itemNo).execute();
  }

  public int[] getTab() {
    return new CMDGetTab(agg).execute();
  }
}