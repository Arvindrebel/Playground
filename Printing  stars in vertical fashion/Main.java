import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    int star;
    int range;
    Scanner in = new Scanner(System.in);
    range = in.nextInt();
    for(star=1;star<=range;star++){
      System.out.println("*");
    }
  }
}