
package oops.methods.staticexample;

class Student{
    int rollNo;
    static String college="IIT";
}

public class Test{
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2=new Student();
        s1.college="NIT";
        System.out.println(s2.college);
    }
}