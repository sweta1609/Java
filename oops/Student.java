package oops;


// one java file can have multiple classes 
// the class have public access modifier should eb name of file
// /main method should be inside class having public access modifier
public class Student {
    int rollNo;
    String studentName;
    public static void main(String[] args){
        Student obj1 = new Student();
        // as we have not assigned any value to rollNo and studentname so compiler will give 0 to rollno and null to strudnetname
        System.out.println(obj1.rollNo);
        System.out.println(obj1.studentName);

    }
    
}

class Main{
    int auto;
}
