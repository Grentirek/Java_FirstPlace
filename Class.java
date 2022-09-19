class Class1 {
    int x = 5;
    public static void main(String[] args) {
      Class1 myObj = new Class1();
      System.out.println(myObj.x);
    }
}

class Class2{
    public static void main(String[] args) {
      Class1 myObj2 = new Class1();
      System.out.println(myObj2.x);
    }
}

class Class3 {
  String fname = "John";
  String lname = "Doe";
  int age = 24;

public static void main(String[] args) {
    Class3 myObj = new Class3();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Age: " + myObj.age);
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

//Access Methods With an Object

// Create a Main class
class Class5 {
 
  // Create a fullThrottle() method
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  // Create a speed() method and add a parameter
  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  // Inside main, call the methods on the myCar object
  public static void main(String[] args) {
    Class5 myCar = new Class5();   // Create a myCar object
    myCar.fullThrottle();      // Call the fullThrottle() method
    myCar.speed(200);          // Call the speed() method
  }
}

// The car is going as fast as it can!
// Max speed is: 200