import java.util.Scanner;
class Employee{
 String eid,esalary;
 String ename;
 void setEid(int eid){
    this.eid=eid;
  }
  void setEname(String ename){
    this.ename=ename;
  }
  void setEsalary(String esalary){
    this.esalary=esalary;
  }
  int getEid(){
  return eid;
  }
  int getEname(){
  return ename;
  }
  int getEsalary(){
  return esalary;
  }
}
class EmployeeDemo{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    Employee obj=new Employee();
    Employee workers[]=new Employee[5];
    System.out.println("enter the details of employee");
    for(int i=0;i<5;i++){
      System.out.println("enter name of Employee "+(i+1));
      String ename=s.next();
      if(ename.length()>=5){
        workers[i].setEname(ename);
      }
      else{
        System.out.println("Name should be greater than 5 letters");
      }
      System.out.println("enter ID of employee "+(i+1));
      String eid=s.nextLine();
      if(eid.length()==7){
        workers[i].setEid(eid);
      }
      else{
        System.out.println("id length should be 7 digits");
      }
      System.out.println("enter salary of employee "+(i+1));
      String esalary=s.nextLine();
      if(esalary.length()>=5 && esalary.length()<=10){
        workers[i].setEsalary(esalary);
      }
      else{
        System.out.println("Salary should be 5 to 10 digits");
      }
      
    }
    for(int i=0;i<5;i++){
      System.out.println(workers[i].getEname()+" "+workers[i].getEid()+" "+workers[i].getEsalary)
    }
   
    
  }
}