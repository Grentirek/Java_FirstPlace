/*If we use the Inheritance more times and acces them with other class will be this: (Polymorphism) */
class Animal {
    public void animalSound() {
      System.out.println("The animal makes a sound");
    }
  }
  
  class Pig extends Animal {
    public void animalSound() {
      System.out.println("The pig says: wee wee");
    }
  }
  
  class Dog extends Animal {
    public void animalSound() {
      System.out.println("The dog says: bow wow");
    }
  }
  
  class printinganimals {
    public static void main(String[] args) {
      /* Pig myPig = new Pig();
       myPig.animalSound1 (if animalSound1 represents "Animal", output will be: "The animal makes a sound")
       */
      Animal myAnimal = new Animal();  // Create a Animal object
      Animal myPig = new Pig();  // Create a Pig object
      Animal myDog = new Dog();  // Create a Dog object
      myAnimal.animalSound();
      myPig.animalSound();
      myDog.animalSound();
    }
  }