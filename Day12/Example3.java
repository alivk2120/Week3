import java.util.Scanner;
class Example3{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int arr[]={12,24,35,45,6,45,75,45,84};
    int num,i,count=0;
    System.out.println("enter the number");
    num=s.nextInt();
    for(i=0;i<arr.length;i++){
      if(arr[i]==num){
        count++;
      }
    }
    if(count==0){
      System.out.println("no, it is not present in any index");
    }
    else{
      System.out.println("the number has occured "+count+" times");
    }
  }
}