import java.util.ArrayList;

public class CafeUtil{

  public int getStreakGoal(int numWeek){
      int goal = 0;
      for(int i=0; i<=numWeek; i++)
      {
        goal = goal + i;
      }
      return goal;
    }
  
  public double getOrderTotal(double[] prices) {
    double total = 0;
    for(int i=0; i<prices.length; i++)
    {
      total = total + prices[i];
    }
    return total;
  }

  public void displayMenuItems(ArrayList<String> menuItems) {
     for(int i=0; i<menuItems.size(); i++)
    {
      System.out.println(String.format("%s %s", i, menuItems.get(i)));
    }
  }

  public void addCustomer(ArrayList<String> customers){

    System.out.println("Please enter your name: ");
    String username = System.console().readLine();
    System.out.println("Hello " + username);
    System.out.println(String.format("There are %s people in front of you.", customers.size()));
    customers.add(username);
    System.out.println(customers);
  }
}