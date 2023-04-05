import java.util.Random;

public class randamnumbers {
    public static void main(String[] args) {
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNum = rand.nextInt(100);
            System.out.println("Random Number " + (i + 1) + ": " + randomNum);
        }
    }
}
