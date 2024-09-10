public class Problem1
{
  public static void main(String[] args)
  {
    int y = 24;
    System.out.println("Initial value: " + y);
    for (int i = 0; i < 4; i++) {
        y++;
        System.out.println("number is now " + y);
    }

    for (int i = 0; i < 4; i++) {
        y--;
        System.out.println("number is now " + y);
    }
  }
}
