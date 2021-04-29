import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        if(name.equals("John"))
            System.out.println("True");
        else
            System.out.println("False");
    }
}