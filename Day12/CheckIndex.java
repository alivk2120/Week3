import java.util.Scanner;
class CheckIndex{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int arr[]={12,24,35,45,6,75,84};
    int num,i,count=0;
    System.out.println("enter the number");
    num=s.nextInt();
    for(i=0;i<arr.length;i++){
      if(arr[i]==num  && count==0){
        System.out.println("yes, it is present in "+i+"th index");
        count++;
      }
    }
    if(count==0){
      System.out.println("no, it is not present in any index");
    }
  }
}