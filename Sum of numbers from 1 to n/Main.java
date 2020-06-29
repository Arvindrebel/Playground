import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
      int range=in.nextInt();
      int sum=0;
      for(int i = 1; i<=range; i++){
       	sum=sum+i;
        
      }
      System.out.println(sum);
	}
}