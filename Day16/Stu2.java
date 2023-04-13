class Stu2{

  
   public void mail(){
      String email="tejas20012@gmail";
     if (email.length() < 5 || email.length() > 20) {
      System.out.println("enter password from 5-10 chracters ");
    }
     if(email.endsWith(".com") || email.endsWith(".in")){
       if(email.charAt(0)>='a' && email.charAt(0)<='z' || email.charAt(0)>='0'&& email.charAt(0)<='9' ||email.charAt(0)>='A'&& email.charAt(0)<='Z')
       {
         System.out.println("mail id is :"+email);
       }
       else{
         System.out.println("invalid mail id as mail id should not start with special character");
       }
       }
     else{
       System.out.println("invalid mail id as mail id should end with .com or .in");
     }
   }
     
     
  
  public void Number() {
    String num="9901974627";
    int count=0;
    if (num.length()!= 10) {
      System.out.println("check number of digits you have entered it should be 10 ");
    }
     for (int i = 0; i < num.length(); i++){
     if (num.charAt(i) >= '0' && num.charAt(i) <= '9'){
       if(num.charAt(0)>='6'){
         count=1;
       }
         }
       
     }
    if(count==1){
    System.out.println("phone number:"+num);
       }
    else{
      System.out.println("please enter the valid number");
    }
  }
    




  
  public void Password() {
    String pwd = "433489";
    int count = 0;
    if (pwd.length() < 5 || pwd.length() > 10) {
      System.out.println("enter password from 5-10 chracters ");
    }
    
     for (int i = 0; i < pwd.length(); i++){
       
       if (pwd.charAt(i) >= 'a' && pwd.charAt(i) <= 'z' || pwd.charAt(i) >= 'A' && pwd.charAt(i)<='Z'){
         count=1;
         break;
      
       }
       
       
       }
    if(count==0){
      System.out.println("your password should  contain one upper and one lower case");
    }
       
    
         else{
            for (int j = 0; j < pwd.length(); j++){
             if(pwd.charAt(j) >= '0' && pwd.charAt(j) <= '9' ){
                
                 
                   System.out.println(pwd);
                   break;
             }
                 else{
                System.out.println("your password should contain numbers also");
                break;
                
             }
                 
            }
           }
  }
         
  
  

  public void name() {
    String studentname = "Tejas";
    if (studentname.length() < 5 || studentname.length() > 15) {
      System.out.println("enter namefrom 5-15 chracters ");
    } else if (studentname.charAt(0) >= 'a' && studentname.charAt(0) <= 'z') {
      System.out.println("name should start with uppercase only");
    } else {
      System.out.println(" NAME :" + studentname);
    }

  }

  
  public static void main(String args[]) {
    Student obj = new Student();
    obj.name();
    obj.Password();
    obj.Number();
    obj.mail();

  }
}