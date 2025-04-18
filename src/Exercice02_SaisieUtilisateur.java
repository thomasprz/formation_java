import java.util.Scanner;

public class Exercice02_SaisieUtilisateur {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("What is your gpa: ");
        double gpa = scanner.nextDouble();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        System.out.println("Hello " + name); //Hello Thomas
        System.out.println("You are " + age + " years old"); //You are 31 years old
        System.out.println("Your gpa is: " + gpa); //Your gpa is: 3.0
        if(isStudent){
            System.out.println("You are enrolled as a student");
        } else {
            System.out.println("You are NOT enrolled");
        }

        //Calculate area of a rectangle
        double width = 0;
        double height = 0;
        double area = 0;

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();
        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;
        System.out.println("The area is: " + area + "cm^2");

        scanner.close();
    }
}
