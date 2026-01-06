package oops.OOPSinjava;

public class Student {
    String name;
    // we made rno private 
    private int rno;
    double percent;

    // getter function
    public int getrno(){
        return rno;
    }

    // public void setrno(int roll){
    //     rno = roll;
    // }
    

//  this.rno refers to the instance variable of the class, while rno refers to the method parameter.
// Without this, Java assigns the parameter to itself and the instance variable remains unchanged (default 0).
    public void setrno(int rno){
        this.rno = rno;
    }
}
