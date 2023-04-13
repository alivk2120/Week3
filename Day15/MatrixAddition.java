class MatrixAddition{
  public static void add(int[][] a, int[][] b)
  {
    int r1 = a.length;
    int c1 = a[0].length;
    int r2 = b.length;
    int c2 = b[0].length;
    int c[][]=new int[r1][c1];
     if((r1==r2 && c1==c2))
      {         
        for(int i = 0;i<r1;i++)
         {
              for(int j = 0;j<c1;j++)
              {
                 c[i][j] = a[i][j]+b[i][j];
            
              }
         }
        printMatrix(c); 
      }
      else{
         System.out.println("matrix addition is not possible");
      }
      
    }
}