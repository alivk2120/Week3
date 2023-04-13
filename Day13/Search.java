import java.util.Scanner;
class Search{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int arr[]={23,25,26,30,39,40,50};
    int count=0;
    System.out.println("Enter the key element");
    int key=s.nextInt();
    for(int i=0;i<arr.length;i++){
      if(arr[i]==key){
        count++;
      }
    }
    if(count==0){
      System.out.println(key+" is not present in the array");
    }
    else{
      System.out.println(key+" is present in the array");
    }
  }
}