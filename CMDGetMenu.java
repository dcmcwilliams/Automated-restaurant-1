public class CMDGetMenu implements Command {
  private Aggregator agg;

  public CMDGetMenu(Aggregator agg) {
    this.agg = agg;
  }

  public String[] execute() {
    int num_items = agg.getMenuObj().getMenuItems().size();
    String menuItems[] = new String[num_items];
    for (int i = 0; i < num_items; i++) {
      int itemNo = agg.getMenuObj().getMenuItems().get(i).getItemNo();
      String itemName = agg.getMenuObj().getMenuItems().get(i).getName();
      double price = agg.getMenuObj().getMenuItems().get(i).getPrice();
      menuItems[i] = String.format("%4d\t\t%-15s $%-5.2f", itemNo, itemName, price);
    }
    return menuItems;
  }
}