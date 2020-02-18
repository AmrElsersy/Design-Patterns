package ObserverAssignment;

import java.util.ArrayList;

public class Channel implements Subject {
    private ArrayList<Observer> observers ;
    String Name;
    String Status;
    Channel(String name) {
        this.observers = new ArrayList<Observer>() ;
        this.Name = name;
    }
    public void  setStatus(String status) {this.Status = status;}
    public String getStatus() {return  this.Status;}
    public String getName() {return this.Name;}

    public void registerObserver(Observer observer) { this.observers.add(observer); }
    public void removeObserver(Observer observer)   { this.observers.remove(observer);}
    public void notifyObservers()
    {
        for(Observer observer : this.observers)
        {
            observer.update(this.Status);
        }
    }
}
