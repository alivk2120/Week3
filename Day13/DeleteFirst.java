class DeleteFirst{
  public static void main(String args[]){
    int arr[]={23,34,45,56,67,58,69,34};
    int m=1;
    for(int i=0;i<arr.length;i++){
      for(int j=m;j<arr.length;j++){
        if(arr[i]==arr[j]){
          for(int k=i;k<arr.length;k++){
            arr[i]=arr[i+1];
          }
        }
      }
      m++;
    }
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}