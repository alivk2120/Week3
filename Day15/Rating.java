class Rating{
  public static void main(String args[]){
    int arr[][]={{4,6,2,5},{7,9,4,8},{6,9,3,7}};
    int sum=0,avg;
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        if(j==3){
          sum=sum+arr[i][j];
        }
      }
    }
    avg=sum/3;
    System.out.println("Average of column 3 is:"+avg);
    
  }
}