import java.util.Scanner;

public class UserInterface {
  public void start() {

    System.out.println("~* Welcome to my restaurant! *~");
    System.out.println("Would you like to see your options?: Yes(1)/No(0)");
    Scanner console = new Scanner(System.in);
    int input = console.nextInt();
    while (input == 1) {
      int choice = optionList(console);

      if (choice == 1) {
        String[] showItems = SystemInterface.getMenu();
        for (int i = 0; i < showItems.length; i++) {
          System.out.println(showItems[i]);
        }
      }
      if (choice == 2) {
        System.out.println("Enter item number to submit order: ");
        int itemChoice = console.nextInt();
        String orderItem = SystemInterface.placeOrder(itemChoice);
        System.out.println("You ordered " + (orderItem));
      }
      if (choice == 3) {
        System.out.println("Displaying tab: ");
        int tabItems[] = SystemInterface.getTab(); // I know this isn't the way you asked us to do this;
                                                   // I had a +1 error that I wasn't able to fix otherwise.
        for (int i = 0; i < tabItems.length; i++) {
          if (tabItems[i] == 1)
            System.out.println("Item #" + tabItems[i] + ": Roast Beef ($5)");
          else if (tabItems[i] == 2)
            System.out.println("Item #" + tabItems[i] + ": Chicken Korma ($10)");
          else if (tabItems[i] == 3)
            System.out.println("Item #" + tabItems[i] + ": Jiaozi ($15)");
          else if (tabItems[i] == 4)
            System.out.println("Item #" + tabItems[i] + ": Pizza ($20)");
        }
      }
      System.out.println("View another option?: Yes(1)/No(0)");
      input = console.nextInt();
    }
    System.out.println("Goodbye!");
  }

  public static int optionList(Scanner console) {
    System.out.println("Please choose an option: ");
    System.out.println("1 - Display all menu items\n" + "2 - Place an order\n"
        + "3 - View tab\n");
    int choice = console.nextInt();
    while (choice < 1 || choice > 3) {
      System.out.println("Not valid option: ");
      System.out.println("1 - Display all menu items\n" + "2 - Place an order\n"
          + "3 - View tab\n");
      choice = console.nextInt();
    }
    return choice;
  }
}