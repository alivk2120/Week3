import java.util.Scanner;
class Application{

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
    System.out.println("Enter the number");
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
    arr[pos]=num;
    no_elements++;
      }
  }
    else{
      System.out.println("Invalid input");
    }
  }

  public void deleteFirst(){
    if(no_elements==0){
      System.out.println("There is no element to delete");
    }
    else{
      for(int i=0;i<no_elements;i++){
        arr[i]=arr[i+1];
      }
      no_elements--;
    }
  }

   public void searchElement(){
    if(no_elements==0){
      System.out.println("your array is empty");
    }
    else{
      System.out.println("enter the number");
      int num=s.nextInt();
      for(int i=0;i<arr.length;i++){
        if(arr[i]==num){
          System.out.println(arr[i]+" is found at "+i+"th position");
        }
      }
    }
  }

   public void frequencySearch(){
    if(no_elements==0){
      System.out.println("your array is empty");
    }
    else{
      int count=0;
      System.out.println("Enter the number");
      int num=s.nextInt();
      for(int i=0;i<arr.length;i++){
        if(arr[i]==num){
          count++;
        }
      }
        if(count==0){
          System.out.println("Entered element is not found in the array");
        }
        else{
          System.out.println(num+" is found "+count+" times");
        }
    }
  }

  public void duplicate(){
    if(no_elements==0){
      System.out.println("Array is empty");
    }
    else{
      int count=1;
      for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
          if(arr[i]==arr[j]){
            count++;
            arr[j]=-1;
          }
        }
        System.out.println("duplicate element is:");
        if(arr[i]!=-1 && count>1){
          System.out.println(arr[i]);
        }
        count=1;
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
    System.out.println("\n1. Insert an element in first index position");
    System.out.println("2. Insert an element in last index position");
    System.out.println("3. Insert an element in specific index position");
    System.out.println("4. Delete an element in first index position");
    System.out.println("8. search an element");
    System.out.println("9. Frequency of search");
    System.out.println("10. Find Duplicate elements");
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
        case 8:
          {
            searchElement();
          }
        case 9:
          {
            frequencySearch();
          }
        case 10:
          {
            duplicate();
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