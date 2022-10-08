public class Inheritance {
    protected String brand = "Ford";        // Inheritance attribute
    public void honk() {                    // Inheritance method
      System.out.println("Tuut, tuut!");
    }
  }
  
  class Car extends Inheritance {
    private String modelName = "Mustang";    // Car attribute
    public static void main(String[] args) {
  
      // Create a myCar object
      Car myCar = new Car();
  
      // Call the honk() method (from the Inheritance class) on the myCar object
      myCar.honk();
  
      // Display the value of the brand attribute (from the Inheritance class) and the value of the modelName from the Car class
      System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
    

