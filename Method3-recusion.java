class Recursion {
    public static void main(String[] args) {
      int result = sum(10);
      System.out.println(result);
    }
    public static int sum(int k) {
      if (k > 0) {
        return k + sum(k - 1);//Döngüye girmesinin nedeni, buradaki sum(k-1) dir.
      } else {
        return 0;
      }
    }
  }

//Olan şudur; result, sum(10) a eşittir. sum(10)da, 10 + sum(9) a eşittir. 10 + sum(9) da 10 + 9 + sum(8) e...
//Bu kendi kendi sürekli kontrol ederek, çağrarak geçici bir döngüye girmesini sağlar.
//en sondaki else: return 0 ise son noktadır.
//sonuç olarak 10+9+8+7..+1+0 cevabı bulunmuş olur.

class Recursion2 {
    public static void main(String[] args) {
        int result = sum(5, 10);
        System.out.println(result);
      }
      public static int sum(int start, int end) {
        if (end > start) {
          return end + sum(start, end - 1);
        } else {
          return end;
        }
      }
}