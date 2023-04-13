import java.util.Scanner;
 
class DeleteAll {
  public static void main(String args[]) {
 
    int arr[] = { 23, 89, 10, 12, 77, 10, 90,10, 41 };
 
    Scanner s = new Scanner(System.in);
    System.out.println("Enter key value");mk
    int key = s.nextInt(); // 10
    for (int i = 0; i < arr.length; i++) {
      if (key == arr[i]) {
        int index=i;
        for(int j=index;j<arr.length-1;j++){
        arr[j]=arr[j+1];
      }
    }
    }
 
    for (int i = 0; i < arr.length - 1; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}