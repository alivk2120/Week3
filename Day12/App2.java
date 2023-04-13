import java.util.Scanner;
class App2{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int arr[]={45,34,56,7,88,76};
    int num,i;
    System.out.println("Enter the number");
    num=s.nextInt();
    
    arr[arr.length]=num;
    arr[arr.length+1]='\0';
    System.out.println("The new array is:");
    for(i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
}