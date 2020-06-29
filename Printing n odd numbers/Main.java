import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      
      int range;
      int i=1;
      Scanner in = new Scanner(System.in);
      range = in.nextInt();

   
      for(i=1;i<=2*range;i++){
        if(i%2!=0){
          
        System.out.println(i);
        }
      }
      
      
     
	}
}