class Example2{
  public static void main(String args[]){
    int arr[]={23,78,4,220,56,33,50};
    if(arr.length%2==0){
      System.out.println("middle values are " +arr[(arr.length/2)-1]+" and "+arr[(arr.length/2)]);
    }
    else{
      System.out.println("middle value is " +arr[(arr.length/2)]);
    }
   
  }
}