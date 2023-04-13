import java.util.Scanner;
class App1{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int arr[]={23,56,45,34,56,7,88,76};
    int num,i;
    System.out.println("Enter the number");
    num=s.nextInt();
    
    for(i=arr.length-1;i>=0;i--){
      arr[i+1]=arr[i];
    }
    arr[0]=num;
    System.out.println("The new array is:");
    for(i=0;i<arr.length;i++){
      System.out.print(arr[i]+ ",");
    }
    System.out.print(arr[arr.length]);
  }
}