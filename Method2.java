class Ave{
    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodDouble(double x, double y) {
        return x + y;//Farklı türde toplamalar için bunun gibi aynı işlemleri farklı metotlarla yapmaktansa,
    }

    public static void main(String[] args) {
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}

class sam{
    static int plusMethod(int x, int y) {
        return x + y;
      }
      
      static double plusMethod(double x, double y) {
        return x + y;//Bir metodu 'aşırı yüklemek' daha iyidir. Böylece farklı "tür"deki işlemleri aynı metodla yapabiliriz.
      }
      
      public static void main(String[] args) {
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);//plusMethod, hem integer hem de double olarak çalışabilir.
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
      }
}

//Parametrelerin sayısı ve/veya türü farklı olduğu sürece, birden çok yöntem aynı ada sahip olabilir.