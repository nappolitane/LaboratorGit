import java.util.ArrayList;

public class Exercitiu3 {
    public static void run()
    {
        ArrayList<Task> tasks = new ArrayList<Task>();
        tasks.add(new OutTask("Primul task se executa aici!"));
        tasks.add(new OutTask("Al doilea task se executa aici!"));
        tasks.add(new RandomOutTask(5, 10));
        tasks.add(new CounterOutTask());

        for(Task j:tasks)
            j.execute();
    }
}
