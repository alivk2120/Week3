class Unique{

public static void main(String args[]){
  int arr[]={23,24,25,26,27,26,27,25,29};
  int k=1,count=0;
      for(int i=0;i<arr.length;i++){
        for(int j=k;j<arr.length;j++){
          if(arr[i]==arr[j]){
            count++;
          }
         }
        if(count==0){
          System.out.println(arr[i]);
        }
        k++;
        }
    }
  }