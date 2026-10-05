public class DemoMobile{
    public static void main(String args[]){
        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 1500;
        Mobile.name = "SmartPhone";//use className to call the static variable

        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        m2.price = 1700;
        Mobile.name = "Phone";

        m1.show();
        m2.show();

        Mobile.show1(m2);
    }
}

class Mobile{
    int price;
    String brand;
    static String name; //static variable are shared by different object.
    //whenever we change the static variable, it changes all the objects.

    public void show(){
        System.out.println(price+" : "+brand+" : "+ name);
    }

    public static void show1(Mobile obj){
        System.out.println(obj.price+" : "+obj.brand+" : "+ name);
    }
}