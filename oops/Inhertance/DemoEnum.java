
// class DemoEnum{
//     public static void main(String args[]){
//         Status s = Status.Running;
//         System.out.println(s);
//         System.out.println(s.getClass().getSuperclass());
//     }
// }

// enum Status{
//     Running,Failed,Success;
// }

class DemoEnum{
    public static void main(String args[]){
       Laptop l = Laptop.MacBook;
       System.out.println(l);

       for(Laptop ll: Laptop.values()){
        if(ll == Laptop.MacBook)
            ll.setPrice(1900);
            System.out.println(ll+" : "+ll.getPrice());
       }
    }
}

enum Laptop{
    MacBook(2000),Surface,Thinkpad(1400);
    int price;
    private Laptop(){
        price= 500;
    }

    private Laptop(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

}
