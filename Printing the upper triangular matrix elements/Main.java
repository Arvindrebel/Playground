import java.util.*;
public class Main
{
 public static void main(String[] args) {
  Scanner sc  = new Scanner(System.in);
  int row = sc.nextInt();
  int column = sc.nextInt();
  if(row!=column)
      System.exit(0);
  int[][] array = new int [row][column];
  for(int i=0; i<row; i++){
      for(int j=0; j<column; j++)
          array[i][j] = sc.nextInt();
  }
  int column_index = 0;
  int rw = row;
  int c = -1;
  String op = "";
  while(rw>=0 && c<column){
      rw--;
      c++;
      column_index = c;  
      for(int i=0; i<=rw; i++){
          if(column_index<column){
              op = op+array[i][column_index]+" ";
             column_index++;
          }
      }
  }
  System.out.println(op);
 }
}