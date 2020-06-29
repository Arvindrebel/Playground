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
    perfect_match(list,n);
  }
  public static void perfect_match(int list[],int n){
    int sum1=0,sum2=0;
    for(int i=0;i<n;i++)
    {
  		for(int j=0;j<3;j++)
        {
        	sum1=list[0]+list[1]+list[2];
        }
      for(int k=3;k<6;k++){
      sum2=list[3]+list[4]+list[5];
      }
     
      
      
    }
	if(sum1==sum2)
    System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
  }
}