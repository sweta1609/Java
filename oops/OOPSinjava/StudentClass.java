package oops.OOPSinjava;

public class StudentClass{

    
    public static void main(String[] args){
        Student x = new Student();
        x.name="Sweta";

        // we made rno private in student class so how do we access it here
        // x.rno=78;
        x.percent=76.5;
        // using setter function from student to set value
        x.setrno(75);

        // using getter function from student to det value
        System.out.println(x.getrno());

    }
}