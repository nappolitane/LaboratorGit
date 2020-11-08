public class Exercitiu4 {
    public static void run()
    {
        Threading1 t1 = new Threading1();
        t1.start();

        Threading2 obj = new Threading2();
        Thread t2 = new Thread(obj);
        t2.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Threading3 running");
            }
        }).start();
    }
}
