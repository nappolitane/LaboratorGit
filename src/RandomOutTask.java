import java.util.Random;

public class RandomOutTask implements Task {
    private int mRandomNumber;

    public RandomOutTask(int min, int max)
    {
        Random rand = new Random();
        mRandomNumber = rand.nextInt(max-min+1) + min;
    }

    public void execute()
    {
        System.out.println("Numarul " + mRandomNumber + " a fost generat aleator!");
    }
}
