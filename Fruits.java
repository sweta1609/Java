import java.util.Scanner;

public class Fruits{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String fruit= in.next();
        switch (fruit){
            case "apple":
                System.out.println("You can eat an apple");
                break;
            case "banana":
                System.out.println("You can eat a banana");
                break;
            case "orange":
                System.out.println("You can eat an orange");
                break;
            default:
                System.out.println("You can't eat this fruit");
                break;
        }
    }
}