public class SystemInterface {

  private static Invoker invoker;

  SystemInterface() {
    invoker = new Invoker();
  }

  public static void setInvoker(Invoker inv) {
    invoker = inv;
  }

  public static String[] getMenu() {
    return invoker.getMenu();
  }

  public static String placeOrder(int itemNo) {
    return invoker.placeOrder(itemNo);
  }

  public static int[] getTab() {
    return invoker.getTab();
  }
}