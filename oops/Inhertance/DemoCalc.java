
public class DemoCalc{
    public static void main(String args[]){     
        VeryAdvCalc calc = new VeryAdvCalc();
        int r1 = calc.add(9,5);
        int r2 = calc.sub(9,5);
        int r3 = calc.multi(9,5);
        int r4 = calc.div(9,5);
        double r5 = calc.pow(9,5);

        System.out.println(r1+"  "+r2+"  "+r3+"  "+r4+"  "+r5);
    }
}

class Calc{
    public int add(int a, int b){
        return a+b;    
    }

    public int sub(int a, int b){
        return a-b;
    }
}

class AdvCalc extends Calc{
    public int multi(int a, int b){
        return a*b;    
    }

    public int div(int a, int b){
        return a/b;
    }
}

class VeryAdvCalc extends AdvCalc{
    public double pow(int a, int b){
        return Math.pow(a, b);    
    }
}


