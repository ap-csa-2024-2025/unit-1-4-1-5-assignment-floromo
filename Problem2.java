public class Problem2
{
  public static void main(String[] args)
  {
    int y = 678;
    System.out.println("Three digit number: " + y);
    
    System.out.println("Here are the digits:");
    System.out.println(y / 100);
    System.out.println((y / 10) % 10);
    System.out.println(y % 10);
  }
}

