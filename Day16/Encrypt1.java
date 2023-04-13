class Encrypt {
public static void main(String[] args) {
String userinput = "YOU KNOW YOU HAVE TO STRUGGLE"; 
String encrypt=" ";
int temp=5;

for(int i=0;i<userinput.length();i++){
char ch=userinput.charAt(i);
ch+=temp;
encrypt=encrypt+ch;
}
System.out.println("encrypted data is:"+encrypt);

}
}
