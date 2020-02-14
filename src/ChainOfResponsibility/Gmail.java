package ChainOfResponsibility;

public class Gmail {
    public static void main(String args[])
    {
        Handler span = new emailSpanHandler();
        Handler job = new emailJobHandler(span);

        job.handle("job");
    }

}

