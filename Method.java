class Main {
    static int myMethod(int x) {
      return 5 + x;
    }//Bu daha kullanışlı, returnu "void" yerine "int" kullandığımız için yapabiliyoruz.
    
    static void method(int x){
        System.out.println(x+5);
    }//Bundan.

    public static void main(String[] args) {
      System.out.println(myMethod(3));
      method(3);
    }
    

}

//Difference between public and static methods.

class Class4 {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[] args) {
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would compile an error

    Class4 myObj = new Class4(); // Create an object of Main
    myObj.myPublicMethod(); // Call the public method on the object
  }
}