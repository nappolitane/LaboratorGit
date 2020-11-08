public class CounterOutTask implements Task {
    public static int mGlobalVariable;

    public CounterOutTask()
    {
        mGlobalVariable = 55;
    }

    public void execute()
    {
        mGlobalVariable++;
        System.out.println("Variabila globala are acum valoarea: " + mGlobalVariable);
    }
}
