package ObserverAssignment;

public class Follower implements Observer{
    private String name;
    Follower(String Name) {this.name = Name;}
    public void update(String status)
    {
        String s =  name + " notified with" + status;
        System.out.println(s);
        this.play();
    }
    public void play()
    {
        // play the video
    }
}
