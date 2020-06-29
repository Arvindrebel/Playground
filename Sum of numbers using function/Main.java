import java.util.Scanner;
class Main{
    public static int sumOfNum(int num){
    int total=0,count=1;
      while(count<=num){
      total= total+count;
       count++; 
      }
      return total;
    }
    public static void main (String[] args){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int num1 = in.nextInt();
      int res = sumOfNum(num1);
      System.out.println(res);
    }
}