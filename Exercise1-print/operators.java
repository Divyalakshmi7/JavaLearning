class Hello{
    public static void main(String args[]){

        /*Arithmetic opr */
        int num1 = 7;
        int num2 = 5;

        //int result  = num1+num2;
        //int result = num1-num2;
        //int result = num1/num2;        
        int result = num2%num1;
        System.out.println(result);

        num1 =num2++;
        System.out.println(num2);
        num1 += num2++;//increment num1 by numb2 (5+6)
        //++num1   pre-increment
        //num1++   post-increment
        System.out.println(num1);

        /* Relational operators */

        int x= 6;
        int y = 7;

        boolean re = x==y;
        System.out.println(re);


        /*logical opr */
        int u = 7;
        int v = 8;
        int c = 7;
        int d = 6;

        boolean res = u<v && c>d;
        System.out.println(!res);//negation of res
    }
}