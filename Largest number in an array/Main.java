import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
       Scanner sc = new Scanner(System.in);
      int arr_size = sc.nextInt();
      int arr[] = new int[arr_size];
      //Inputing elements in the array 
      for(int i=0;i<arr_size;i++){
       arr[i]=sc.nextInt(); 
      }
      
      int large=arr[0];
       for(int i=0;i<arr_size;i++){
         if(large<arr[i]){
         large=arr[i];
         
         }
       }
      System.out.println(large);
      
    }
}