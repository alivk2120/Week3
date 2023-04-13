class PosNeg{
  public static void main(String args[]){
    int arr[]={23,45,-68,78,97,-67,-96};
    int pos[]=new int[arr.length];
    int neg[]=new int[arr.length];
    int i,posindex=-1,negindex=-1;
    for(i=0;i<arr.length;i++){
      if(arr[i]>0){
        pos[++posindex]=arr[i];
      }
      else{
        neg[++negindex]=arr[i];
      }
   
    }
    System.out.println("Positive values are:");
    for(i=0;i<=posindex;i++){
      System.out.println(pos[i]);
    }
    System.out.println("ngative values are:");
    for(i=0;i<=negindex;i++){
      System.out.println(neg[i]);
  }
}
}