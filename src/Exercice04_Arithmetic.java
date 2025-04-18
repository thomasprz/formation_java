
public class Exercice04_Arithmetic {
    public static void main(String[] args) {

        //Arithmetic Operators
        int x = 10;
        int y = 3;
        int z;

        //z = x + y;
        //z = x - y;
        //z = x * y;
        //z = x / y;
        z = x % y;

        System.out.println(z);

        //Augmented Assignment Operators
        double a = 10;
        double b = 3;

        //a += b;
        //a -= b;
        //a *= b;
        //a /= b;
        a %= b;

        System.out.println(a);

        //Increment and Decrement Operators

        int m = 1;

        m++;
        m++;
        m--;

        System.out.println(m);

        //Order of Operations
        double result = 3 + 4 * (7 - 5) / 2;
        System.out.println(result);

        double j = 10;
        double q = 3;
        j /=q;
        System.out.println(j);

    }
}
