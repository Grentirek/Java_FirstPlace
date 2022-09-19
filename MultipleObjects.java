class MulObj {
    int x = 5;
  
    public static void main(String[] args) {
      MulObj myObj1 = new MulObj();  // Object 1
      MulObj myObj2 = new MulObj();  // Object 2
      myObj2.x = 25;
      System.out.println(myObj1.x);  // Outputs 5
      System.out.println(myObj2.x);  // Outputs 25
    }
  }