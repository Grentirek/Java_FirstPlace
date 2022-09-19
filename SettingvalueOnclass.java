class Set {
    int x;
    int y = 10;
    final int z = 105; //The last value of z is 105, unchageable. Don't forget to add "int <data type>"
  
    public static void main(String[] args) {
      Set myObj = new Set();
      myObj.x = 40;
      myObj.y = 25;
      //myobj.z = 106; is will be generate an error.
      System.out.println(myObj.x);
      System.out.println(myObj.y);
      System.out.println(myObj.z);
    }
  }
