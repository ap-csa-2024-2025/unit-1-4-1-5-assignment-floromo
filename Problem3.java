public class Problem3
{
  public static void main(String[] args)
  {
    int y = 5678;
    System.out.println("Four digit number: " + y);

    System.out.println("Here are the digits:");
    System.out.println(y % 10);
    System.out.println((y / 10) % 10);
    System.out.println((y / 100) % 10);
    System.out.println(y / 1000);

  }
}

