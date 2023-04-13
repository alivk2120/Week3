class EvenOdd{
  public static void main(String args[]){
    int arr[]={23,45,68,78,97,67};
    int even[]=new int[arr.length];
    int odd[]=new int[arr.length];
    int i,evenindex=-1,oddindex=-1;
    for(i=0;i<arr.length;i++){
      if(arr[i]%2==0){
        even[++evenindex]=arr[i];
      }
      else{
        odd[++oddindex]=arr[i];
      }
   
    }
    System.out.println("Even values are:");
    for(i=0;i<=evenindex;i++){
      System.out.println(even[i]);
    }
    System.out.println("odd values are:");
    for(i=0;i<=oddindex;i++){
      System.out.println(odd[i]);
  }
}
}