class Example1{
  public static void main(String args[]){
    int arr[]={23,78,4,220,56,33};
    int array,i;
    for(i=0;i<arr.length;i++){
      if(arr[i]%2==0){
        arr[i]=arr[i]+5;
      }
      else{
        arr[i]=arr[i]-5;
      }
    }
    for(i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
}