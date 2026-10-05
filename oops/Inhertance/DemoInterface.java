public class DemoInterface{
    public static void main(String args[]){
        A obj = new B();
        obj.show();
        obj.config();

        X obj1 = new B();
        obj1.run();

        System.out.println(A.area);
    }
}

/**
 * DemoInterface
 */
interface A {
    int age= 11;
    String area = "Chennai";

    void show();
    void config();
    
}

interface X{
    void run();
}

class B implements A,X{
    public void show(){
        System.out.println("in show");
    }

    public void config(){
        System.out.println("in config ");
    }

    public void run(){
        System.out.println("in running... ");
    }
}

