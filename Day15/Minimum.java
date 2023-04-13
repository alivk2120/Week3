class Minimum{
  public static void main(String args[]){
    int arr[][]={{4,6,2,5},{7,9,4,8},{6,9,3,7}};
    int min=arr[0][0],i,j=0,index1=0,index2=0;
    for(i=0;i<arr.length;i++){
      for(j=0;j<arr[i].length;j++){
        if(min>arr[i][j]){
          min=arr[i][j];
          index1=i;
          index2=j;
        }
      }
    }
    System.out.println("Maximum number in the array is:"+min);
    System.out.println("The element is found in the row "+index1+" and column" +index2);
  }
}