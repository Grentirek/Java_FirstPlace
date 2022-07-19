class Operatororn2 {
    public static void main(String[] args){
        byte x = 10;
        byte b = 10;
        System.out.println(x++ + ++x); //Sistem soldan sağa okuduğu için önce x'in 10 olduğunu görecek. Sonra x'i bir arttıracak. Buradaki önemli nokta x'in 1 arttırılmış hali değil ilk görülen hali yani 10 ile işleme girer. Çünkü işleme giren x'tir. Sistem x'i gördüğü an x işleme girer. Arttrıma ve azaltma daha sonra etki eder. Yani önce x işleme 10 haliyle girer, sonra 1 arttırılır. Sonra bir daha arttrılır ve bu sefer x, 12'dir ve bu sayı işleme girer. 10 + 12 = 22.
        System.out.println(b++ + b++);
        System.out.println(b);
    }
}
