class Asalbulucu {
    static byte Cozen(byte x, byte y) {
        for(byte sch = x; sch < y+1; ++sch){
            boolean asallik = true;
            
            for(byte s = 2; s < sch; ++s){
                if (sch % s == 0){
                    asallik = false;
                    break;
                }
            }

            if (sch == 1){
                asallik = false;
            }

            if (asallik == true){
                System.out.println("       \"Asal bir sayi: " + sch + "\"    ");
            }
            else{
                System.out.println(" ----Asal olmayan bir sayi: " + sch + "---- ");
            }
        }
        return 0;
    }
    public static void main(String[] args){
        Cozen((byte)1, (byte)100);//1'dan 100'e kadar olan sayıların arasındaki asal sayılar.
    }
}
