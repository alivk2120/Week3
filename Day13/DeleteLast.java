class DeleteLast{
  public static void main(String args[]){
    int arr[]={23,34,45,56,34,67,58,69};
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j]){
          for(int k=i;k<arr.length-1;k++){
            arr[j]=arr[j+1];
          }
        }
      }
    }
    for(int i=0;i<arr.length-1;i++){
      System.out.print(arr[i]+" ");
    }
  }
}