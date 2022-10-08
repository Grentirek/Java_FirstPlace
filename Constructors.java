class Constructor {
    int x;
  
    public Constructor(int y) {
      x = y; //The constructor of "Constructor" class.
    }
  
    public static void main(String[] args) {
      Constructor myObj = new Constructor(5);
      System.out.println(myObj.x);
    }
  }
  
  // Outputs 5

class Constructor2 {
    int modelYear;
    String modelName;
  
    public Constructor2(int year, String name) {
      modelYear = year;
      modelName = name;
    }
  
    public static void main(String[] args) {
      Constructor2 myCar = new Constructor2(1969, "Mustang");
      System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
  }
  
  // Outputs 1969 Mustang