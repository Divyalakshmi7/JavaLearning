

public class DemoEncap{
    public static void main(String args[]){
        Human obj = new Human();
        Human obj1 =  new Human(14, "Dhanvi");
        // obj.setAge(12);
        // obj.setName("Lakshmi");

        System.out.print(obj1.getAge()+" : "+obj1.getName());
    }
}

class Human{
    private int age;
    private String name;

    public Human(){ // constructor has same name as class name
        //it has no datatype and has public access specifier.
        //Everytime object is created constructor is called.
        age = 13;
        name = "john";
    }

    public Human(int a, String n){//parameterized constructor
        this.age = a;
        this.name = n;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;// it gives priority to local variable not instance variable so we use same name we need to use 'this' keyword.
        //'this' keyword represents current obj.
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
}