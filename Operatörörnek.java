class Operatororn{
    public static void main(String[] args){
        byte x = 10;
        System.out.println(x++); //Sistem soldan sağa doğru okuduğu için önce x'i görür ve yazdırır. Sonra "++"ları görür ve x'i bir arttırır.
        System.out.println(++x); //x şuan 11. Sistem önce "++"ları görür bir arrtırır ve sonuç 12 olur. Sonra x yani 12 yazdırılır.
        System.out.println(x--); //x yazdırılır, sonra bir azaltılır. 12 yazılmış olur ve sonrasında da x 11 olur.
        System.out.println(--x); //x 11'dir. Ama önce 1 azaltılır. Sonra yazdırılır. Yazılan 10'dur.
    }
}