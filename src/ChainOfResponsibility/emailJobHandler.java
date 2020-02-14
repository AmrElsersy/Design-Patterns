package ChainOfResponsibility;

public class emailJobHandler extends Handler{
    emailJobHandler(Handler handler) {super(handler);}
    emailJobHandler() {super();}

    public void handle(String request)
    {
        if(request.equals("job")) {
            System.out.println("job email !");
        }
        else {
            if(!hasNextHandler)
                System.out.println("Request Failed");
            else
                this.nextHandler.handle(request);
        }
    }
}
