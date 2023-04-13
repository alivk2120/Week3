class Maximum{
  public static void main(String args[]){
    int arr[][]={{4,6,2,5},{7,9,4,8},{6,9,3,7}};
    int max=arr[0][0],i,j=0;
    for(i=0;i<arr.length;i++){
      for(j=0;j<arr[i].length;j++){
        if(max<arr[i][j]){
          max=arr[i][j];
        }
      }
    }
    System.out.println("Maximum number in the array is:"+max);
    System.out.println("The element is found in the row "+i+" and column" +j);
  }
}