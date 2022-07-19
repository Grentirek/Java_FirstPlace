class Operatororn4{
    public static void main(String[] args){
        System.out.println(10 << 2); //10 * 2^2 = 10*4 = 40 , bu, '10 değerini bellekte 2 bit sola kaydır' demektir. Bir veriyi bellekte 1 bit ola kaydırmak o veriyi 2 ile çarpmak, 2 bit sola kaydırmak ise o veriyi 2 üzeri 2 ile çarpmak demektir.
        System.out.println(10 << 3); //10 * 2^3 = 10*8 = 80
        System.out.println(20 << 2); //20 * 2^2 = 20*4 = 80
        System.out.println(15 << 4); //15 * 2^4 = 15*16 = 240

        System.out.println(10 >> 2); //10 / 2^2 = 10/4 = 2 (<-- 2.5)
        System.out.println(20 >> 2); //20 / 2^2 = 20/4 = 5
        System.out.println(20 >> 3); //20 / 2^3 = 20/8 = 2 (<-- 2.5)

    }
}