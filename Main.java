import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int number1 = random.nextInt(1,10);
        int number2 = random.nextInt(1,10);
        int number3 = random.nextInt(1,10);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

    }
}
