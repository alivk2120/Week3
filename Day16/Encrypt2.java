class Encrypt2 {
  public static void main(String args[]) {
    String str = "Hello Welcome";
    System.out.println("Before encryption string is : " + str);
    char ch[] = new char[str.length()];
    for (int i = 0; i < str.length(); i++) {
      ch[i] = str.charAt(i);
    }
    String st = " ";
    for (int i = 0; i < ch.length; i++) {
      if (ch[i] != ' ') {
        if (i % 2 == 0) {
          st = st + ch[i];
        }
      }
    }
    for (int i = 0; i < ch.length; i++) {
      if (ch[i] != ' ') {
        if (i % 2 == 1) {
          st = st + ch[i];
        }
      }
    }
    System.out.println("Encrypted String is : " + st);
  }
}