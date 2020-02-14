package ChainOfResponsibility;

public class emailSpanHandler extends Handler{
    emailSpanHandler(Handler handler) {super(handler);}
    emailSpanHandler() {super();}
    public void handle(String request)
    {
        // if the request is suitable handle it
        if(request.equals("span"))
            System.out.println("span email");
        else {
            // if it is the last handler then the request will not be handled
            if(!hasNextHandler)
                System.out.println("Request Failed");
            else
                // if it has a next handler push the request to it
                this.nextHandler.handle(request);
        }
    }
}
