import java.util.Scanner;
class Application2 {
  Scanner s = new Scanner(System.in);
  int arr[] = new int[100];
  int no_elements = 0;
  public void insertFirst() {
    System.out.println("Enter your value to insert in first index ");
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
  public void display(){
    for(int i=0;i<no_elements;i++){
      System.out.print(arr[i]+" ");
    }
  }
  public void insertLast(){
    System.out.println("Enter your value to insert in last index ");
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
    System.out.println("Enter your new value");
    int value=s.nextInt();  
    System.out.println("Enter index value ");
    int index=s.nextInt();  
    if(index<=no_elements){
      if(no_elements==0){
        arr[index]=value;
        no_elements++;
      }
      else{
        for(int i=no_elements;i>index;i--){           
          arr[i]=arr[i-1];
        }
        arr[index]=value;
        no_elements++;
      }
    }
    else{
      System.out.println("invalid index,index value should be less than "+no_elements);
    }
  }
  public void deleteFirst(){
    if(no_elements==0){
      System.out.println("Array is empty");
    }
    else{
      for(int i=0;i<no_elements;i++){
        arr[i]=arr[i+1];
      }
      no_elements--;
    }
  }
  public void deleteLast(){
    if(no_elements==0){
      System.out.println("Array is empty");
    }
    else{
      no_elements--;
    }
  }
  public void deleteSpecific(){
    if(no_elements==0){
      System.out.println("Array is empty");
    }
    else{
      System.out.println("Enter index value");
      int index=s.nextInt();
      if(index<no_elements)      {
        for(int i=index;i<no_elements;i++){
          arr[i]=arr[i+1];
        }
        no_elements--;
      }
    }
  }
  public void deleteSearch(){
    System.out.println("Enter search element");
    int key=s.nextInt();
    int index=-1;
    for(int i=0;i<no_elements;i++){
      if(key==arr[i]){
        index=i;
        break;
      }
    }
    if(index>=0){
      for(int i=index;i<no_elements;i++){
        arr[i]=arr[i+1];
      }
      no_elements--;
    }
    else{
      System.out.println("not found");
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
        else{
          System.out.println("Entered element is not found in the array");
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
        if(count==0){
          System.out.println("Entered element is not found in the array");
        }
        else{
          System.out.println(num+" is found "+count+" times");
        }
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
  public void unique(){
    if(no_elements==0){
      System.out.println("Array is empty");
    }
    else{
      int count = 1;
      for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
          if (arr[i] == arr[j]) {
            count++;
            arr[j] = -1;
         }
        }
      if (arr[i] != -1 && count == 1) {
 
         System.out.println(arr[i]);
       }
      count = 1;
      }
    }
  }
  public void viewOptions() {
    int option=0;
    do{
      System.out.println("\n1. Insert an element in first index position");
      System.out.println("2. Insert an element in last index position");
      System.out.println("3. Insert an element in specific index position");
      System.out.println("4. Delete an element in first index ");
      System.out.println("5. Delete an element in last index ");
      System.out.println("6. Delete an element in specific index ");
      System.out.println("7. Delete an element in search value ");
      System.out.println("8. Search an element ");
      System.out.println("9. Frequency of search element ");
      System.out.println("10. Find duplicate elements");
      System.out.println("11. Print unique elements");
      System.out.println("0. EXIT");
      System.out.println("choose your option");
      option=s.nextInt();
      switch(option){
        case 1:
          {
            insertFirst();
            display();
            break;
          }
        case 2:
          {
            insertLast();
            display();
            break;
          }
        case 3:
          {
            insertSpecific();
            display();
            break;
          }
        case 4:{
          deleteFirst();
          display();
          break;
        }
        case 5:{
          deleteLast();
          display();
          break;
        }
        case 6:{
          deleteSpecific();
          display();
          break;
        }
        case 7:{
          deleteSearch();
          display();
          break;
        }
        case 8:
          {
            searchElement();
            break;
          }
        case 9:
          {
            frequencySearch();
            break;
          }
        case 10:
          {
            duplicate();
            break;
          }
        case 11:
          {
            unique();
            break;
          }
        case 0:{
          System.out.println("Thank you");
          break;
        }
      }
    }
      while(option!=0);
  }
  public static void main(String args[]) {
    Example1 obj = new Example1();
    obj.viewOptions();
  }
}
