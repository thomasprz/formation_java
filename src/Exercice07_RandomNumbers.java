import java.util.Random;
public class Exercice07_RandomNumbers {
    public static void main(String[] args) {

        Random random = new Random();

        int number;
        double number1;
        boolean isHeads;

        number = random.nextInt(1,7); //7 pas compris dedans exclusive
        number1 = random.nextDouble();
        isHeads = random.nextBoolean();

        System.out.println(number);
        System.out.println(number1);

        if(isHeads){
            System.out.println("HEADS");
        } else {
            System.out.println("TAILS");
        }
    }
}
