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