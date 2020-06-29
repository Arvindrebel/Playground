import java.util.Scanner;
class Main
{
   public static int square(int num){
   		int result = num*num;
     return result;
   }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in = new Scanner(System.in);
      int num1 = in.nextInt();
      int result1= square(num1);
      System.out.println(result1);
      
	} 
}