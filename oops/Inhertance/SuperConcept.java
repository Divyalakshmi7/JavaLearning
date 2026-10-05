
public class SuperConcept{
    public static void main(String args[]){
        B b= new B();
    }

}

class A{
    public A(){
        super(); // calls the constructor of super class which is parent class.
        //it can also be parameterized. default it will call default constructor, if parameters passed it will call parameterized constructor.
        System.out.println("in A");
    }

    public A(int n){
        super();
        System.out.println("in A int");
    }
}

class B extends A{
    public B(){
        super(5);
        System.out.println("in B");
    }

    public B(int n){
        super();
        System.out.println("in B int");
    }
}