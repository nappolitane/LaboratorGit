public class Threading1 extends Thread {
    public void run(){
        String threadName = Thread.currentThread().getName(); // or this.getName()
        System.out.println(threadName);
    }
}
