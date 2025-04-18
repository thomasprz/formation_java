public class Exercice01_Variables {

    public static void main(String[] args){
    //COURSE

    //System.out.println("I like pizza!");
    //System.out.println("It's really good!");
    //System.out.println("Buy me pizza!");

    int age = 21;
    int year = 2025;
    int quantity = 1;
    System.out.println("The year is " + year);

    double price = 19999.99;
    double gpa = 3.5;
    double temperature = -12.5;
    System.out.println("$" + price);

    char grade = 'A';
    char symbol = '!';
    char currency = '$';
    System.out.println(symbol);

    boolean isStudent = false;
    boolean forSale = true;
    boolean isOnline = true;
    System.out.println(isStudent);

    if(isStudent){
        System.out.println("You are a student!");
    }
    else {
        System.out.println("You are NOT a student!");
    }

    String food = "pizza";
    String email = "fake123gmail.com";
    String car = "Mustang";
    String color = "red";
    System.out.println("Your choice is a " + color + " " + year + " " + car);
    System.out.println("The price is: " + currency + price);
    if(forSale){
        System.out.println("There is a " + car + " for sale");
    }else{
        System.out.println("The " + car + " is not for sale");
    }

    //HOMEWORK
    String name = " Thomas Prz";
    int gta = 6;
    double pi = 3.14159;
    char gender = 'M';
    boolean isAdmin = true;

    System.out.println("Hello " + name );
    }
}

