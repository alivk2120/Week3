class RowCol4{
  public static void main(String args[]) {
    int n=9,k=91;
    for(int row=1;row<=5;row++){
      for(int col=1;col<=5;col++){
        if(row%2!=0){
          System.out.print(1+" ");
        }
        else{
          System.out.print(0+" ");
        }
      }
      System.out.println();
    }
  }
}