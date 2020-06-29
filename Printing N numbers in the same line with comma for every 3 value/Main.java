import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    int star;
    int range;
    int stop=3;
    Scanner in = new Scanner(System.in);
    range = in.nextInt();
    for(star=1;star<=range;star++){
      System.out.print(star);
      if((star%stop==0) && (star!=range)){
        System.out.print(",");
      }
    }
  }
}