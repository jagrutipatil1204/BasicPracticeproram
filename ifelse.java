import java.util.Scanner;

public class ifelse {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age :");
        int age;
        age=sc.nextInt();
        if (age>18){
            System.out.println("yes boy you can drive");
        }
        else {
            System.out.println("No boy you cannot drive yet!");
        }
    }

}