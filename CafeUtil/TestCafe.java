import java.util.ArrayList;

public class TestCafe {
  public static void main(String[] args)
  {
    CafeUtil test = new CafeUtil();
    double[] newTest = {5.50, 6.25};
    double value = test.getOrderTotal(newTest);
    ArrayList<String> coffee = new ArrayList<String>();
    coffee.add("Drip Coffee");
    coffee.add("Mocha");
    coffee.add("latte");
    int anotherValue = test.getStreakGoal(10);
    //test.displayMenuItems(coffee);
    //System.out.println(anotherValue);
    //System.out.println(value);
    ArrayList<String> customerList = new ArrayList<String>();
    customerList.add("Tony");
    customerList.add("Roger");
    customerList.add("Donald");
    test.addCustomer(customerList);
    
  }
}