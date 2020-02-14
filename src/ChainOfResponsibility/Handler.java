package ChainOfResponsibility;

abstract class Handler
{
    // each handler has a next handler to push the request to , if it can't handle the request
    protected Handler nextHandler;
    protected boolean hasNextHandler;
    Handler(Handler handler) {this.nextHandler = handler; this.hasNextHandler = true;}
    Handler() {this.hasNextHandler = false;}
    // handle the request function implemented by the concrete classes
    abstract void handle(String request);
}
