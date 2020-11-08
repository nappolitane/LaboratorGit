public class Exercitiu5 {
    public static void run()
    {
        System.out.println(Thread.currentThread().getName());

        for(int i = 0; i < 10; i++){
            Threading1 t = new Threading1();
            t.setName(String.valueOf(i));
            t.start();
        }
    }
}
