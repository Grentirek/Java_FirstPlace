class Class1 {
    int x = 5;
    int y;
}

class Class2{
    public static void main(String[] args) {
      Class1 myObj = new Class1();
      myObj.y = 20;
      System.out.println(myObj.x);
      System.out.println(myObj.y);//Neden göstermiyor bilmiyorum.
    }
}