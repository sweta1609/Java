package oops;


// student class will do things related to student
class Student{
    int rollNo;
    String studentName;
}


// class main is entry point for java programme to run
public class Main {
    public static void main(String[] args){
        Student obj1 = new Student();
        obj1.rollNo= 9;
        obj1.studentName="Raj";
        // as we have not assigned any value to rollNo and studentname so compiler will give 0 to rollno and null to strudnetname
        System.out.println(obj1.rollNo);
        System.out.println(obj1.studentName);

        // how to make multiple objects for same class
        Student obj2 = new Student();
         obj2.rollNo= 10;
        obj2.studentName="Vinod";
        System.out.println(obj2.rollNo);
        System.out.println(obj2.studentName);

    }
    
}
