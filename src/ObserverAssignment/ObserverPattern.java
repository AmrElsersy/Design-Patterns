package ObserverAssignment;

public class ObserverPattern {
    public static void main(String args[])
    {
        Channel youtube = new Channel("Youtube");
        youtube.setStatus("Youtube is Live");

        Follower amr = new Follower("Amr");
        Follower sersy = new Follower("sersy");

        youtube.registerObserver(amr);
        youtube.registerObserver(sersy);
        youtube.notifyObservers();

        System.out.println("...............");
        youtube.removeObserver(sersy);
        youtube.notifyObservers();

    }
}
