import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int list[] = new int[n];
    for(int i=0;i<n;i++){
      list[i]=sc.nextInt();
  }
    max_elem(list,n);
    
    
}
  public static void max_elem(int list[],int n){
    int max=0,l=0;
    for(int i=0;i<n;i++){
      if(max<=list[i]){
      max=list[i];
        l=i;
      }
    }
    System.out.println(l);
  
  }
  
  
}
