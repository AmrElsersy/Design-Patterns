package CompositeAssignment;

import java.util.*;

public class Playlist implements IComponent {

    public String playlistName;
    float playbackSpeed;
    public ArrayList<IComponent> playlist = new ArrayList();

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }

    public String getName()
    {
        return this.playlistName;
    }
    public void play()
    {
        System.out.println(this.playlistName);
        System.out.println("...............");
        for (IComponent component: this.playlist)
        {
            component.play();
        }
    }
    public void setPlaybackSpeed(float speed)
    {
        this.playbackSpeed = speed;
    }
    public void add(IComponent component)
    {
        this.playlist.add(component);
    }
    public void remove(IComponent component)
    {
        this.playlist.remove(component);
    }

}