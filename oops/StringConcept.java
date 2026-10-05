public class StringConcept{
    public static void main(String args[]){
        String str = "Divya"; //  this will create string obj in stack and the value will the address value from heap memory. the name value 'Divya' will be stored in heap memory with address.
        str = str.concat(" lakshmi"); // this will create one more address with value 'Divyalakshmi'. and previously stored value is eligible for garbage collection.

        String s1 = "Divya"; // s1 and s2 shares same address.
        String s2 = "Divya";
        System.out.println("Hi "+str);

        //StringBuffer
        StringBuffer sb = new StringBuffer("Dhanvi");
        sb.append(" Sushree");
        sb.deleteCharAt(1);

        System.out.println("hi "+sb);

        //Difference b/w stingbuffer and string builder
        //Stringbuffer is threadsafer and stringbuilder is not.
    }
}