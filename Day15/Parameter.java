import java.util.Scanner;
class Parameter{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int arr[][]={{4,6,2,5},{7,9,4,8},{6,9,3,7}};
    int i,j,count=0;
    System.out.println("Enter the parameter");
    int num=s.nextInt();
    for(i=0;i<arr.length;i++){
      for(j=0;j<arr[i].length;j++){
        if(arr[i][j]>num){
          count++;
        }
      }
    }
    System.out.println("no. of elements greater than parameter is:"+count);
  }
}