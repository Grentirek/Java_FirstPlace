//To access the inner class, create an object of the outer class, and then create an object of the inner class:
class OuterClass {
    int x = 10;
  
    class InnerClass {
      int y = 5;
    }
  }
  
class Innerrunner{
    public static void main(String[] args) {
      OuterClass myOuter = new OuterClass();
      OuterClass.InnerClass myInner = myOuter.new InnerClass();
      System.out.println(myInner.y + myOuter.x);
    }
  }
  
// Outputs 15 (5 + 10)



//An inner class can also be static, which means that you can access it without creating an object of the outer class:
public class InnerClasses {
    int x = 10;
  static class InnerClass {
    int y = 5;
  }
}

class Innerclassrunner {
  public static void main(String[] args) {
    //InnerClasses myOuter2 = new InnerClasses(); If we add this line we can acces to the "InnerClasses"
    InnerClasses.InnerClass myInner = new InnerClasses.InnerClass();//Otherwise we can't access the "InnerClasses" because the static modifier couldn't access outer class like static modifier can't acces other any class(?).
    System.out.println(myInner.y);// + myOuter2.x);
  }
}

/*Access Outer Class From Inner Class
One advantage of inner classes, is that they can access attributes and methods of the outer class:*/

//Example
class OuterClass2 {
  int x = 10;

  class InnerClass2 {
    public int myInnerMethod() {
      return x;
    }
  }
}

class InnerRunner2 {
  public static void main(String[] args) {

    /*OuterClass2 myOuter = new OuterClass2();
    OuterClass2.InnerClass2 myInner = myOuter.new InnerClass2();
    System.out.println(myInner.myInnerMethod());*/

    OuterClass2.InnerClass2 InnerObj2 = new OuterClass2().new InnerClass2();
    InnerObj2.myInnerMethod();
  }
}

// Outputs 10