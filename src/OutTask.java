public class OutTask implements Task {
    private String mMessage;

    public OutTask(String message)
    {
        mMessage = message;
    }

    public void execute()
    {
        System.out.println(mMessage);
    }
}
