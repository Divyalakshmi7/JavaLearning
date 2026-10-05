public class DemoLambdaExp{
    public static void main(String args[]){
        Vehicle car = (w) -> {
            System.out.println("car has "+w+" wheels");
        };
        car.show(4);

    }
}

interface Vehicle{
    void show(int wheels);
}

