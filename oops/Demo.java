class Student{
    int marks;
    int rollno;
    String name;
}

public class Demo{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.marks = 90;
        s1.rollno = 1;
        s1.name = "Surya";

        Student s2 = new Student();
        s2.marks = 80;
        s2.rollno = 2;
        s2.name = "Ajith";

        Student s3 = new Student();
        s3.marks = 80;
        s3.rollno = 3;
        s3.name = "Kamal";

        Student s[] = new Student[3];
        s[0] = s1;
        s[1] = s2;
        s[2] = s3;
        
        for(Student stu : s){
            System.out.println(stu.name + " : "+ stu.marks);
        }       

    }
}