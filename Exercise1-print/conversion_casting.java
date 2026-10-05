class Hello{
    public static void main(String args[]){
        byte by = 127;

        int n = 12;
        //byte k =n; // possible lossy conversion from int to byte
        byte l = (byte) n;  // this works
        
        //assign byte with integer having value out of range

        int m = 256;
        byte c = (byte) m; // it will do modulo and print reminder which is 0 (256%256)
        // if m=257 it will print 1(257%256)


        byte a = 10;
        byte b = 20;

        int num = a*b;// two byte type can be saved into int which is calle Type promotion.


        System.out.println(c);
    }
}