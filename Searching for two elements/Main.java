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
      //Scanning search elements
      int elem_1=sc.nextInt();
      int elem_2=sc.nextInt();
      //Initializing index values as -1
      int index_1=-1;
      int index_2=-1;
      //Logic
      for(int i=0;i<arr_size;i++){
        if(elem_1 == arr[i]){
           
          index_1=i;
          
        }
          if(elem_2 == arr[i]){
           
          index_2=i;
          
        }
          
        
      }
      
      System.out.println(index_1);
      System.out.println(index_2);
      
    }
}