class DemoInner{
    public static void main(String args[]){
        A obj =  new A();

        A.B inner = obj.new B();

        obj.show();
        inner.show();
    }
}

class A{
    public void show(){
        System.out.println("in A");
    }
    class B{
         public void show(){
        System.out.println("in B");
    }
    }
}