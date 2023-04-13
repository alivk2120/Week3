import java.util.Scanner;
class Practice{

  Scanner s=new Scanner(System.in);
  int arr[]=new int[100];
  int no_elements=0;
  
  public void insertFirst(){
    System.out.println("Enter the number");
    int num=s.nextInt();
    if(no_elements==0){
      arr[0]=num;
      no_elements++;
      }
    else{
      for(int i=no_elements;i>0;i--){
        arr[i]=arr[i-1]; 
      }
      arr[0]=num;
      no_elements++;
    }
  }
  public void insertLast(){
    System.out.println("Enter the number to insert at last");
    int num=s.nextInt();
    if(no_elements==0){
      arr[0]=num;
      no_elements++;
      }
    else{
      arr[no_elements]=num;
      no_elements++;
     }
  }
  public void insertSpecific(){
    System.out.println("Enter the position to insert number");
    int pos=s.nextInt();
    System.out.println("Enter the number");
    int num=s.nextInt();
    if(pos<=no_elements){
      if(no_elements==0){
        arr[0]=num;
        no_elements++;
      }
      else{
    for(int i=(no_elements-1);i>=pos-1;i--){
      arr[i+1]=arr[i];
    }
    arr[pos-1]=num;
    no_elements++;
      }
  }
    else{
      System.out.println("Invalid input");
    }
  }

  public void deleteFirst(){
    System.out.println("Enter the number");
    int num=s.nextInt();
    if(no_elements==0){
      System.out.println("There is no element to delete");
    }
    else{
      for(int i=0;i<=no_elements;i++){
        arr[i]=arr[i+1];
        no_elements--;
      }
    }
  }
 
    public void display(){
    for(int i=0;i<no_elements;i++){
      System.out.print(arr[i]+ " ");
    }
    viewOptions();
  }
  public void viewOptions() {
    System.out.println("1. Insert an element in first index position");
    System.out.println("2. Insert an element in last index position");
    System.out.println("3. Insert an element in specific index position");
    System.out.println("4. Delete an element in first index position");
    System.out.println("choose your option");
    int option=0;
    do{
      option=s.nextInt();
      switch(option){
        case 1:
          {
            insertFirst();
            display();
          }
        case 2:
          {
            insertLast();
            display();
          }
        case 3:
          {
            insertSpecific();
            display();
          }
        case 4:
          {
            deleteFirst();
            display();
          }
      }
    }
      while(option!=0);
  }
  public static void main(String args[]){

    Application obj=new Application();
    obj.viewOptions();
  }
}