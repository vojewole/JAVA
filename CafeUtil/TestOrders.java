public class TestOrders {
  public static void main(String[] args)
  {
    Item item1 = new Item();
    Item item2 = new Item();
    Item item3 = new Item();
    Item item4 = new Item();

    item1.name = "Mocha";
    item2.name = "latte";
    item3.name = "drip coffee";
    item4.name = "capuccino";

    item1.price = 4.25;
    item2.price = 3.50;
    item3.price = 2.75;
    item4.price = 5.00;

    Order order1 = new Order();
    Order order2 = new Order();
    Order order3 = new Order();
    Order order4 = new Order();

    order1.name = "Cinduri";
    order2.name = "Jimmy";
    order3.name = "Noah";
    order4.name = "Sam";

    order2.items.add(item2);
    order2.total = order2.total + 1;
    order3.items.add(item4);
    order3.total = order3.total + 1;
    order4.items.add(item1);
    order4.total = order4.total + 1;
    order1.ready = true;

    System.out.println(order1.ready);
  }
}